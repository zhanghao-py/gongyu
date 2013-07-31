package cm.h3c.college.pay.payment.service.facade;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cm.h3c.college.pay.payment.service.CollegeServcie;
import cm.h3c.college.pay.payment.service.OrderService;

@Service("paymentFacade")
public class PaymentFacade {
	
	@Resource(name = "orderService")
	private OrderService orderService;
	
	@Resource(name = "collegeService")
	private CollegeServcie collegeService;

	public OrderService getOrderService() {
		return orderService;
	}

	public CollegeServcie getCollegeService() {
		return collegeService;
	}

}
