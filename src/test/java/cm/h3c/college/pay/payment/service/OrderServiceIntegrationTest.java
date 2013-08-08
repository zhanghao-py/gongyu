package cm.h3c.college.pay.payment.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;

import org.apache.log4j.Logger;
import org.junit.Test;

import cm.h3c.college.pay.core.exception.ServiceException;
import cm.h3c.college.pay.payment.bo.College;
import cm.h3c.college.pay.payment.web.action.dto.OrderForm;
import cm.h3c.college.pay.payment.ws.delegate.FeeServiceDelegator;
import cm.h3c.college.pay.payment.ws.delegate.ImcplatServiceDelegator;
import cm.h3c.college.pay.test.core.BaseIntegrationTest;


public class OrderServiceIntegrationTest extends BaseIntegrationTest  {
	
	private Logger log = Logger.getLogger(OrderServiceIntegrationTest.class);
	
	@Resource(name = "orderService")
	private OrderService orderService;
	
	@Test
	public void itShouldCheckOrder() throws ServiceException {
		
		// [Given]
		OrderForm form = new OrderForm();
		form.setAccount("15810710450");
		form.setMoney(BigDecimal.TEN);
		form.setCollegeId(1L);
		
		// [When]
		orderService.checkOrderForm(form);
		
		form.setAccount("15810714450");
		form.setMoney(BigDecimal.TEN);
		form.setCollegeId(1L);
		
		// [When]
		orderService.checkOrderForm(form);
	}

	
	@Test
	public void itShouldPayOrder() throws ServiceException {
		
		// [Given]
		Long orderId = 2L;
		
		// [When]
		orderService.doPayOrder(orderId);
	}
	
	@Test
	public void itShouldRecharge2CAMS() throws ServiceException {
		
		// [Given]
		Long orderId = 2L;
		
		// [When]
		orderService.doRecharge2CAMS(orderId);
	}
	
	
	
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
	static {
		HttpsURLConnection.setDefaultHostnameVerifier(new HostnameVerifier() {
			public boolean verify(String hostname, SSLSession session) {
				// ip address of the service URL(like.23.28.244.244)
				if (hostname.equals("123.120.33.72"))
					return true;
				return false;
			}
		});
	}
	@Test
	public void itShouldLogin() throws ServiceException {
		College c = new College();
		c.setUrl("https://123.120.33.72:443");
		c.setOperatorPassword("admin");
		c.setOperatorUsername("admin");
		FeeServiceDelegator feeServiceDelegator = new FeeServiceDelegator(c);
		feeServiceDelegator.pay("15810710450", "10");
	}
}
