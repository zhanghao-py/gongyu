package cm.h3c.college.pay.payment.service.impl;

import java.math.BigDecimal;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.Transformer;
import org.apache.commons.lang.ObjectUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import cm.h3c.college.pay.cams.service.CamsService;
import cm.h3c.college.pay.cmpay.CmpayObjectFactory;
import cm.h3c.college.pay.cmpay.CmpayPaymentCallbackRequest;
import cm.h3c.college.pay.cmpay.CmpayPaymentCallbackWebRequest;
import cm.h3c.college.pay.cmpay.CmpayPaymentCallbackable;
import cm.h3c.college.pay.cmpay.CmpayPaymentCheckResponse;
import cm.h3c.college.pay.cmpay.CmpayPaymentRequest;
import cm.h3c.college.pay.cmpay.service.CmpayPaymentService;
import cm.h3c.college.pay.core.config.SystemConfig;
import cm.h3c.college.pay.core.exception.ServiceException;
import cm.h3c.college.pay.core.util.PrimaryKeyGenerator;
import cm.h3c.college.pay.payment.bo.College;
import cm.h3c.college.pay.payment.bo.Log;
import cm.h3c.college.pay.payment.bo.Order;
import cm.h3c.college.pay.payment.cons.CamsResult;
import cm.h3c.college.pay.payment.cons.LogType;
import cm.h3c.college.pay.payment.cons.OrderStatus;
import cm.h3c.college.pay.payment.cons.PayResult;
import cm.h3c.college.pay.payment.dao.OrderDao;
import cm.h3c.college.pay.payment.service.CollegeServcie;
import cm.h3c.college.pay.payment.service.LogService;
import cm.h3c.college.pay.payment.service.OrderService;
import cm.h3c.college.pay.payment.web.action.dto.OrderForm;
import cm.h3c.college.pay.payment.ws.delegate.AcmUserServiceDelegator;

@Component("orderService")
public class OrderServiceImpl implements OrderService {
	private static Logger log = Logger.getLogger(OrderService.class);
	
	private Lock[] callbackLocks;
	
	@Autowired
	private CmpayObjectFactory cmpayObjectFactory;
	
	@Resource(name = "collegeService")
	private CollegeServcie collegeService;
	
	@Resource(name = "orderDao")
	private OrderDao orderDao;
	
	@Resource(name = "cmpayPaymentService")
	private CmpayPaymentService cmpayPaymentService;
	
	@Resource(name = "camsService")
	private CamsService camsService;
	
	@Resource(name = "logService")
	private LogService logService;
	
	@Resource(name = "systemConfig")
	private SystemConfig config;
	
	@PostConstruct
	private void init() {
		callbackLocks = new Lock[config.getCallbackThreadNumber()];
		for(int i = 0; i < callbackLocks.length; i++) {
			callbackLocks[i] = new ReentrantLock();
		}
	}

	@Override
	public Long doCreateOrder(OrderForm form) throws ServiceException {
		return saveOrUptOrder(form);
	}
	
	private Long save(OrderForm form) throws ServiceException {
		
		Order order = new Order(form);
		order.setId(PrimaryKeyGenerator.getKey());
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
			throw new ServiceException("高校id不能为空！");
		}
		
		College college = collegeService.findCollegeById(collegeId);
		
		if (StringUtils.isBlank(form.getAccount())) {
			throw new ServiceException("账号不能为空！");
		}
		
		this.validateAccountExistAtCASM(form.getAccount(), college);
		
		if (form.getMoney() == null || form.getMoney().compareTo(BigDecimal.valueOf(0.01)) < 0) {
			throw new ServiceException("充值金额不能为空, 不能小于一分钱！");
		}
	}
	
	private void validateAccountExistAtCASM(String account, College college) throws ServiceException {
		AcmUserServiceDelegator acmUserServiceDelegator = new AcmUserServiceDelegator(college);
		acmUserServiceDelegator.queryAcmUser(account);
		return;
	}

	private Long update(OrderForm form) throws ServiceException {
		
		if (form.getStatus() == null || form.getStatus()  < 1) {
			throw new ServiceException("订单状态不能为空！");
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
	public Order findOrderById(Long orderId) throws ServiceException {
		if (orderId == null || orderId < 1) {
			throw new ServiceException("订单编号不能为空！");
		}
		
		Order order = orderDao.findById(orderId);
		
		if (order == null) {
			throw new ServiceException("订单不存在，订单编号：" + orderId + "。");
		}
		
		return order;
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
		
		this.updateOrdersStatusByIds(orderIds, OrderStatus.CANCELED);
	}
	
	@Override
	public void updateOrdersStatusByIds(List<Long> orderIds, OrderStatus status) throws ServiceException {
		if (orderIds == null || orderIds.size() < 1) {
			throw new ServiceException("订单编号列表不能为空");
		}
		
		orderDao.updateOrdersStatusByIds(orderIds, status.getValue());
		return;
	}
	
	@Override
	public void updateOrderStatusById(Long orderId, OrderStatus status) throws ServiceException {
		if (orderId == null || orderId < 1) {
			throw new ServiceException("订单编号不能为空");
		}
		
		orderDao.updateOrderStatusById(orderId, status.getValue());
		return;
	}

	@Override
	public void updateOrderPayResultById(Long orderId, PayResult payResult, LogType type) throws ServiceException {
		if (orderId == null || orderId < 1) {
			throw new ServiceException("订单编号不能为空");
		}
		
		Short callbackType = (short) (type == LogType.CMPAY_CALLBACK_WEB_REQUEST ? 1 : 2);
		orderDao.updateOrderPayResultById(orderId, payResult.getValue(), callbackType);
	}
	
	@Override
	public void updateOrderCamsResultById(Long orderId, CamsResult camsResult) throws ServiceException {
		if (orderId == null || orderId < 1) {
			throw new ServiceException("订单编号不能为空");
		}
		
		orderDao.updateOrderCamsResultById(orderId, camsResult.getValue());
	}
	
	@Override
		
	public CmpayPaymentRequest doPayOrder(Long orderId) throws ServiceException {
		if (orderId == null || orderId < 1) {
			throw new ServiceException("订单编号不能为空！");
		}
		
		// 订单状态检查
		Order order = orderDao.findById(orderId);
		
		if ( !(order.getStatus().equals(OrderStatus.INIT.getValue()) || order.getStatus().equals(OrderStatus.PAYING.getValue())) ) {
			throw new ServiceException("只有处于初始化或付款中状态的订单, 方可进行付款！");
		}
		
		// 修改订单状态至付款中
		this.updateOrderStatusById(orderId, OrderStatus.PAYING);
		
		College college = collegeService.findCollegeById(order.getCollegeId());
		// 生成cmpay订单
		return cmpayPaymentService.createPayment(order, college.getMerId());
	}

	@Override
	public void doCallbackOrder(CmpayPaymentCallbackRequest callback) throws ServiceException, NumberFormatException {
		Lock lock = getLock(callback.parseOriginOrderId());
		lock.lock();// callback 与  webcallback需要串行执行 
		try {
			this.callbackOrder(callback, LogType.CMPAY_CALLBACK_REQUEST);
		}finally {
			lock.unlock();
		}
	}

	@Override
	public void doWebCallbackOrder(CmpayPaymentCallbackWebRequest callback) throws ServiceException, NumberFormatException {
		Lock lock = getLock(callback.parseOriginOrderId());
		lock.lock();// callback 与  webcallback需要串行执行 
		try {
			List<Log> logs = logService.findByOrderIdAndType(callback.parseOriginOrderId(), LogType.CMPAY_CALLBACK_REQUEST);
			if (logs != null && logs.size() > 0) {
				log.warn("doWebCallbackOrder: back callback already received, ignore: "  + callback.prepareSignData());
				return;
			}
			
			this.callbackOrder(callback, LogType.CMPAY_CALLBACK_WEB_REQUEST);
		}finally {
			lock.unlock();
		}
	}
	
	private void callbackOrder(CmpayPaymentCallbackable callback, LogType type) throws ServiceException, NumberFormatException {
		// 获取callback参数
		Long orderId =  callback.parseOriginOrderId();
		Order order = this.findOrderById(orderId);
		
		if(order == null) {
			log.warn("can't find order by id " + orderId);
			throw new ServiceException("找不到指定的订单，订单号： " + orderId);
		}
		
		// 已有请求完成支付(CmpayPaymentCallbackRequest/CmpayPaymentCallbackWebRequest)
		if (!ObjectUtils.equals(order.getPayResult(), null)
				&& !needHandle(orderId, order, type, callback)) {
			return;
		}
		
		PayResult payResult = PayResult.valueOf(callback.getStatus());
		// 更新order pay_result记录
		this.updateOrderPayResultById(orderId, payResult, type);
		
		if (!ObjectUtils.equals(payResult, PayResult.SUCCESS)) {
			log.info("cmpay payment failed. orderId : " + orderId + ", result=" + payResult);
			return;
		}
		
		// CAMS充值
		try {
			camsService.doRecharge2Cams(orderId);
		} catch (ServiceException e) {
			log.error("Recharege to CAMS failed, orderId=" + orderId, e);
		}
		
	}
	
	private boolean needHandle(Long orderId, Order order, LogType type, CmpayPaymentCallbackable callback) {
		// 判断不同的结果
		if (LogType.CMPAY_CALLBACK_REQUEST == type) {
			if (order.getPayCallbackType() == 2) {
				log.warn("duplicate back callback,ignore. orderId="
						+ orderId + ", origin result="
						+ order.getPayResult() + ", new result="
						+ callback.getStatus());
			} else if (!order.getPayResult().equals(
					PayResult.SUCCESS.getValue())
					&& PayResult.SUCCESS.name().equalsIgnoreCase(
							callback.getStatus())) {
				log.info("back callback success, update result. orderId="
						+ orderId + ", origin result="
						+ order.getPayResult() + ", new result="
						+ callback.getStatus());
				return true;
			} else {
				log.info("back callback not success, ignore. orderId="
						+ orderId + ", origin result="
						+ order.getPayResult() + ", new result="
						+ callback.getStatus());
			}				
		} else {
			log.info("duplicate web callback,ignore. orderId=" + orderId
					+ ", origin result=" + order.getPayResult()
					+ ", new result=" + callback.getStatus());
		}
		return false;
	}

	@Override
	public CmpayPaymentCheckResponse checkPayment(Long orderId, String merId) throws ServiceException {
		if (ObjectUtils.equals(orderId, null)) {
			throw new ServiceException("订单编号不能为空！");
		}
		
		return cmpayPaymentService.checkPayment(orderId, merId);
	}

	@Override
	public CmpayPaymentRequest doCreateAndPayOrder(OrderForm form) throws ServiceException {
		
		Long orderId = form.getId();
		
		if (orderId == null) {
			orderId = this.doCreateOrder(form);
			form.setId(orderId);
		}
		
		return this.doPayOrder(orderId);
	}
	
	private Lock getLock(Long orderId) {
		return callbackLocks[(int) (orderId % config.getCallbackThreadNumber())];
	}

	@Override
	public String getCmpayUrl(String merId) {
		return config.getPayUrl();
	}
}
