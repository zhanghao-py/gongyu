package cm.h3c.college.pay.payment.service.impl;

import java.io.File;
import java.math.BigDecimal;
import java.net.MalformedURLException;

import javax.annotation.Resource;
import javax.xml.ws.BindingProvider;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import cm.h3c.college.pay.core.exception.ServiceException;
import cm.h3c.college.pay.core.ws.soap.SOAPKeepSessionHandlerSettor;
import cm.h3c.college.pay.payment.bo.Order;
import cm.h3c.college.pay.payment.cons.OrderStatus;
import cm.h3c.college.pay.payment.dao.OrderDao;
import cm.h3c.college.pay.payment.service.OrderService;
import cm.h3c.college.pay.payment.web.action.dto.OrderForm;

import com.h3c.imc.acm.feeservice.FeeService;
import com.h3c.imc.acm.feeservice.FeeServicePortType;
import com.h3c.imc.acmws.fee.xsd.ObjectFactory;
import com.h3c.imc.acmws.fee.xsd.PaymentInfo;
import com.h3c.imc.common.ws.xsd.WSCommonResult;
import com.h3c.imc.imcplatservice.ImcplatService;
import com.h3c.imc.imcplatservice.ImcplatServicePortType;

@Service("orderService")
public class OrderServiceImpl implements OrderService {

	private Logger log = Logger.getLogger(OrderService.class);
	
	@Resource(name = "orderDao")
	private OrderDao orderDao;

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
		
		if (form.getCollegeId() == null || form.getCollegeId()  < 1) {
			throw new ServiceException("collegeId不能为空！");
		}
		
		// TODO 校验collegeId是否存在
		
		if (StringUtils.isBlank(form.getAccount())) {
			throw new ServiceException("account不能为空！");
		}
		
		// TODO 检验account是否存在
		
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


}
