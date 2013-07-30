package cm.h3c.college.pay.payment.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Test;

import cm.h3c.college.pay.core.exception.ServiceException;
import cm.h3c.college.pay.payment.web.action.dto.OrderForm;
import cm.h3c.college.pay.test.core.BaseIntegrationTest;


public class OrderServiceIntegrationTest extends BaseIntegrationTest  {
	
	private Logger log = Logger.getLogger(OrderServiceIntegrationTest.class);
	
	@Resource(name = "orderService")
	private OrderService orderService;
	
//	@Test
//	public void itShouldCallHello() {
//		orderService.login();
//	}
//
//	@Test
//	public void itShouldCallPay() {
//		orderService.pay();
//	}
	
	@Test
	public void itShouldCreateOrder() throws ServiceException {
		// [Given]
		OrderForm form = new OrderForm();
		form.setAccount("15810710450");
		form.setCollegeId(1L);
		form.setMoney(new BigDecimal(5L));
		
		// [When]
		Long id = orderService.doCreateOrder(form);
		
		// [Then]
		log.info("orderId is " + id);
	}
	
	@Test
	public void itShouldUpdateOrdersStatus2Canceled() throws ServiceException {
		// [Given]
		List<Long> ids = new ArrayList<Long>();
		ids.add(8L);
		
		// [When]
		orderService.updateOrdersStatus2CanceledByIds(ids);
		
		// [Then]
	}
	
	@Test
	public void itShouldCancelOrderAutomatically() throws ServiceException {
		// [Given]
		
		// [When]
		orderService.doCancelOrderAutomatically();
		
		// [Then]
	}
}
