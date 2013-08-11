package cm.h3c.college.pay.cams.service.impl;

import java.math.BigDecimal;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import cm.h3c.college.pay.cams.service.CamsService;
import cm.h3c.college.pay.core.exception.ServiceException;
import cm.h3c.college.pay.payment.bo.College;
import cm.h3c.college.pay.payment.bo.Order;
import cm.h3c.college.pay.payment.cons.CamsResult;
import cm.h3c.college.pay.payment.cons.LogType;
import cm.h3c.college.pay.payment.cons.OrderStatus;
import cm.h3c.college.pay.payment.cons.PayResult;
import cm.h3c.college.pay.payment.service.CollegeServcie;
import cm.h3c.college.pay.payment.service.LogService;
import cm.h3c.college.pay.payment.service.OrderService;
import cm.h3c.college.pay.payment.ws.delegate.FeeServiceDelegator;

@Component("camsService")
public class CamsServiceImpl implements CamsService {
	
	private static Logger LOG = Logger.getLogger(CamsService.class);
	
	@Resource(name = "collegeService")
	private CollegeServcie collegeService;
	
	@Resource(name = "logService")
	private LogService logService;
	
	@Resource(name = "orderService")
	private OrderService orderService;
	
	@Override
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public synchronized void doRecharge2Cams(Long orderId) throws ServiceException {
		Order order = orderService.findOrderById(orderId);
		
		if (!order.getStatus().equals(OrderStatus.PAYING.getValue())) {
			throw new ServiceException("只有支付中的订单，才可以向CAMS充值！");
		}
		
		if (order.getPayResult() == null) {
			throw new ServiceException("无法获取cmpay支付结果，无法向CAMS充值！");
		}
		
		if (!order.getPayResult().equals(PayResult.SUCCESS.getValue())) {
			throw new ServiceException("cmpay支付失败，无法向CAMS充值！");
		}
		
		Long collegeId = order.getCollegeId();
		College college = collegeService.findCollegeById(collegeId);
		
		String account = order.getAccount();
		BigDecimal money = order.getMoney();
		
		// 更新order status状态->done
		orderService.updateOrderStatusById(orderId, OrderStatus.DONE);
		
		// CAMS充值
		FeeServiceDelegator feeServiceDelegator = new FeeServiceDelegator(college);
		
		try {
			feeServiceDelegator.pay(account, money.toPlainString());
		} catch(ServiceException e) {
			LOG.warn("", e);
			// 更新order cams_result->failed
			orderService.updateOrderCamsResultById(orderId, CamsResult.FAILED);
			return;
		}
		
		logService.doLog(LogType.CAMS_PAY_REQUEST, orderId, "account:" + account + ", money:" + money.toPlainString());
		
		// 更新order cams_result->success
		orderService.updateOrderCamsResultById(orderId, CamsResult.SUCCESS);
		
		return;
	}

}
