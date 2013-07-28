package cm.h3c.college.pay.payment.service.impl;

import java.math.BigDecimal;

import javax.annotation.Resource;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import cm.h3c.college.pay.core.exception.ServiceException;
import cm.h3c.college.pay.payment.bo.College;
import cm.h3c.college.pay.payment.bo.Order;
import cm.h3c.college.pay.payment.cons.CAMSResult;
import cm.h3c.college.pay.payment.cons.OrderStatus;
import cm.h3c.college.pay.payment.dao.OrderDao;
import cm.h3c.college.pay.payment.service.CollegeServcie;
import cm.h3c.college.pay.payment.service.OrderService;
import cm.h3c.college.pay.payment.web.action.dto.OrderForm;
import cm.h3c.college.pay.payment.ws.delegate.FeeServiceDelegator;
import cm.h3c.college.pay.payment.ws.delegate.ImcplatServiceDelegator;

@Service("orderService")
public class OrderServiceImpl implements OrderService {

	private Logger log = Logger.getLogger(OrderService.class);
	
	@Resource(name = "collegeService")
	private CollegeServcie collegeService;
	
	@Resource(name = "orderDao")
	private OrderDao orderDao;

	/*
	
	@Override
	public void login() {
		
		ImcplatService remoteImplService = null;

		try {
			File f = new File("offline/wsdl/imcplatService.wsdl");
			remoteImplService = new ImcplatService(f.toURL());
		} catch (MalformedURLException e) {
			log.warn(e);
		}

		ImcplatServicePortType imcplatService = remoteImplService
				.getImcplatServiceHttpSoap12Endpoint();
		SOAPKeepSessionHandlerSettor.getInstance().setHandler((BindingProvider) imcplatService);

		String username = "admin";
		String password = "admin";

		WSCommonResult result = imcplatService.login(username, password);

		if (result.getErrorCode() > 0) {
			// throw exception
		}
		
		log.info("error code is " + result.getErrorCode());

		// do some action
		pay();

		imcplatService.logout();
		
	}
	

	@Override
	public void pay() {
		
		FeeService remoteImplService = null;
		
		try {
			File f = new File("offline/wsdl/feeService.wsdl");
			remoteImplService = new FeeService(f.toURL());
		} catch (MalformedURLException e) {
			log.warn(e);
		}
		
		FeeServicePortType feeService = remoteImplService.getFeeServiceHttpSoap12Endpoint();
		SOAPKeepSessionHandlerSettor.getInstance().setHandler((BindingProvider) feeService);
		
		ObjectFactory of = new ObjectFactory();
		PaymentInfo info = new PaymentInfo();
		info.setUserName(of.createPaymentInfoUserName("15810710450"));
		info.setAmount(of.createPaymentInfoAmount("10.88"));
		
		
		WSCommonResult result = feeService.pay(info);
		log.info("error code is " + result.getErrorCode());
		
	}
	
	*/

	@Override
	public Long doCreateOrder(OrderForm form) throws ServiceException {
		return saveOrUptOrder(form);
	}
	
	private Long save(OrderForm form) throws ServiceException {
		
		Order order = new Order(form);
		order.setStatus(OrderStatus.INIT.getValue());
		
		orderDao.save(order);
		return order.getId();
	}

	private void validateBeforeSaveOrUptOrder(OrderForm form)
			throws ServiceException {
		if (form == null) {
			throw new ServiceException("表单不能为空！");
		}
		
		Long collegeId = form.getCollegeId();
		if (collegeId == null || collegeId  < 1) {
			throw new ServiceException("collegeId不能为空！");
		}
		
		collegeService.findCollegeById(collegeId);
		
		if (StringUtils.isBlank(form.getAccount())) {
			throw new ServiceException("account不能为空！");
		}
		
		// TODO CAMS检验account是否存在(需要调用ws)
		
		if (form.getMoney() == null || form.getMoney().compareTo(BigDecimal.ONE) < 0) {
			throw new ServiceException("money不能为空, 不能小于一元钱！");
		}
	}
	
	private Long update(OrderForm form) throws ServiceException {
		
		if (form.getStatus() == null || form.getStatus()  < 1) {
			throw new ServiceException("status不能为空！");
		}
		
		Order order = new Order(form);
		
		orderDao.update(order);
		return order.getId();
	}
	
	private Long saveOrUptOrder(OrderForm form) throws ServiceException {
		
		validateBeforeSaveOrUptOrder(form);
		
		Long id = null;
		
		if (form.getId() != null) {
			id = update(form);
		} else {
			id = save(form);
		}
		
		return id;
	}

	@Override
	public void checkOrderForm(OrderForm form) throws ServiceException {
		validateBeforeSaveOrUptOrder(form);
		return;
	}

	@Override
	public void doRecharge2CAMS(Long orderId) throws ServiceException {
		
		Order order = this.findOrderById(orderId);
		
		if (!order.getStatus().equals(OrderStatus.PAYING.getValue())) {
			throw new ServiceException("只有支付中的订单，才可以向CAMS充值！");
		}
		
		if (order.getCamsResult().equals(CAMSResult.FAIL.getValue())) {
			throw new ServiceException("cmpay支付失败，无法向CAMS充值！");
		}
		
		Long collegeId = order.getCollegeId();
		College college = collegeService.findCollegeById(collegeId);
		
		String account = order.getAccount();
		BigDecimal money = order.getMoney();
		
		ImcplatServiceDelegator imcplatServiceDelegator = new ImcplatServiceDelegator(college);
		FeeServiceDelegator feeServiceDelegator = new FeeServiceDelegator(college);
		
		imcplatServiceDelegator.login();
		feeServiceDelegator.pay(account, money.toPlainString());
		imcplatServiceDelegator.logout();
		
		return;
	}

	@Override
	public Order findOrderById(Long id) throws ServiceException {
		if (id == null || id < 1) {
			throw new ServiceException("id不能为空！");
		}
		
		Order order = orderDao.findById(id);
		
		if (order == null) {
			throw new ServiceException("order = " + id + "不存在！");
		}
		
		return order;
	}


}
