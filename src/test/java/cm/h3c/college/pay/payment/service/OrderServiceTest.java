package cm.h3c.college.pay.payment.service;

import javax.annotation.Resource;

import org.junit.Test;

import cm.h3c.college.pay.test.core.BaseIntegrationTest;


public class OrderServiceTest extends BaseIntegrationTest {
	
	@Resource(name = "orderService")
	private OrderService orderService;
	
	@Test
	public void itShouldCallHello() {
		orderService.login();
	}

	@Test
	public void itShouldCallPay() {
		orderService.pay();
	}
}
