package cm.h3c.college.pay.payment.service.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.Transformer;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import cm.h3c.college.pay.core.exception.ServiceException;
import cm.h3c.college.pay.payment.bo.College;
import cm.h3c.college.pay.payment.bo.Order;
import cm.h3c.college.pay.payment.cons.OrderStatus;
import cm.h3c.college.pay.payment.cons.PayResult;
import cm.h3c.college.pay.payment.dao.OrderDao;
import cm.h3c.college.pay.payment.service.CollegeServcie;
import cm.h3c.college.pay.payment.service.OrderService;
import cm.h3c.college.pay.payment.web.action.dto.OrderForm;
import cm.h3c.college.pay.payment.web.action.dto.OrderVO;
import cm.h3c.college.pay.payment.ws.delegate.AcmUserServiceDelegator;
import cm.h3c.college.pay.payment.ws.delegate.FeeServiceDelegator;

@Service("orderService")
public class OrderServiceImpl implements OrderService {

	private Logger log = Logger.getLogger(OrderService.class);
	
	@Resource(name = "collegeService")
	private CollegeServcie collegeService;
	
	@Resource(name = "orderDao")
	private OrderDao orderDao;

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
		
		College college = collegeService.findCollegeById(collegeId);
		
		if (StringUtils.isBlank(form.getAccount())) {
			throw new ServiceException("account不能为空！");
		}
		
		this.validateAccountExistAtCASM(form.getAccount(), college);
		
		if (form.getMoney() == null || form.getMoney().compareTo(BigDecimal.ONE) < 0) {
			throw new ServiceException("money不能为空, 不能小于一元钱！");
		}
	}
	
	private void validateAccountExistAtCASM(String account, College college) throws ServiceException {
		AcmUserServiceDelegator acmUserServiceDelegator = new AcmUserServiceDelegator(college);
		acmUserServiceDelegator.queryAcmUser(account);
		
		return;
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
		
		if (order.getPayResult() == null) {
			throw new ServiceException("无法获取cmpay支付结果，无法向CAMS充值！");
		}
		
		if (order.getPayResult().equals(PayResult.FAIL.getValue())) {
			throw new ServiceException("cmpay支付失败，无法向CAMS充值！");
		}
		
		Long collegeId = order.getCollegeId();
		College college = collegeService.findCollegeById(collegeId);
		
		String account = order.getAccount();
		BigDecimal money = order.getMoney();
		
		FeeServiceDelegator feeServiceDelegator = new FeeServiceDelegator(college);
		feeServiceDelegator.pay(account, money.toPlainString());
		
		return;
	}

	@Override
	public Order findOrderById(Long id) throws ServiceException {
		if (id == null || id < 1) {
			throw new ServiceException("id不能为空！");
		}
		
		Order order = orderDao.findById(id);
		
		if (order == null) {
			throw new ServiceException("order = " + id + "，该订单不存在！");
		}
		
		return order;
	}

	@Override
	public void updateOrdersStatus2CanceledByIds(List<Long> ids)
			throws ServiceException {
		if (ids == null || ids.size() < 1) {
			throw new ServiceException("ids不能为空！");
		}
		
		orderDao.updateOrdersStatusByIds(ids, OrderStatus.CANCELED.getValue());
		return;
	}

	@Override
	@SuppressWarnings("unchecked")
	public void doCancelOrderAutomatically() throws ServiceException {
		List<Order> orders = orderDao.findAllUnpaidOrdersMoreThan12Hours();
		
		if (orders == null || orders.size() < 1) {
			return;
		}
		
		List<Long> orderIds = (List<Long>) CollectionUtils.collect(orders, new Transformer() {
			@Override
			public Object transform(Object object) {
				Order order = (Order) object;
				return order.getId();
			}
		});
		
		this.updateOrdersStatus2CanceledByIds(orderIds);
	}

	@Override
	public void doPayOrder(Long orderId) throws ServiceException {
		
		if (orderId == null || orderId < 1) {
			throw new ServiceException("orderId不能为空！");
		}
		
		// 订单状态检查
		Order order = orderDao.findById(orderId);
		
		if (order == null) {
			throw new ServiceException("order id = " + orderId + ", 该订单不存在！");
		}
		
		if (!order.getStatus().equals(OrderStatus.INIT.getValue())) {
			throw new ServiceException("只有处于初始化状态的订单, 方可进行付款！");
		}
		
		// 修改订单状态
		this.updateOrderStatus2PayingById(orderId);
		
		// TODO:跳转到cmpay付款
		
		return;
	}

	@Override
	public void updateOrderStatus2PayingById(Long id) throws ServiceException {
		if (id == null || id < 1) {
			throw new ServiceException("id不能为空！");
		}
		
		List<Long> ids = new ArrayList<Long>();
		ids.add(id);
		
		orderDao.updateOrdersStatusByIds(ids, OrderStatus.PAYING.getValue());
		return;		
	}

	@Override
	public OrderVO findOrderVOById(Long id) throws ServiceException {
		if (id == null || id < 1) {
			throw new ServiceException("id不能为空！");
		}
		
		return orderDao.findOrderVOById(id);
	}

	@Override
	public void paySuccess(Order order) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void payFiled(Order order, String status, String remark) {
		// TODO Auto-generated method stub
		
	}


}
