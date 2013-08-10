package cm.h3c.college.pay.cmpay.web.action;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.HttpRequestHandlerAdapter;

import cm.h3c.college.pay.cmpay.CmpayObjectFactory;
import cm.h3c.college.pay.cmpay.CmpayPaymentCallbackRequest;
import cm.h3c.college.pay.cmpay.CmpayPaymentCallbackWebRequest;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:/config/spring.xml",
		"classpath:/config/spring-webmvc.xml" })
public class PaymentActionTest {
	@Autowired
	public HttpRequestHandlerAdapter handlerAdapter;
	
	@Autowired
	private CmpayCallbackController cmpayCallbackController;
	
	@Autowired
	private CmpayWebCallbackController cmpayWebCallbackController;
	
	@Autowired
	private CmpayObjectFactory cmpayObjectFactory;

	private static MockHttpServletRequest request;

	private static MockHttpServletResponse response;

	@BeforeClass
	public static void before() {
		request = new MockHttpServletRequest();
		request.setCharacterEncoding("UTF-8");
		response = new MockHttpServletResponse();
	}

	@Test
	public void postCallback() throws ClientProtocolException, IOException {
		CmpayPaymentCallbackRequest callbackRequest = new CmpayPaymentCallbackRequest();
		callbackRequest.setRemark("中文");
		callbackRequest.setOrderId("201308101615543112");
		callbackRequest.setStatus("SUCCESS");
		String xml = cmpayObjectFactory
				.cmpayPaymentCallbackRequest2Xml(callbackRequest);

		request.setRequestURI("/");
		request.setMethod(HttpMethod.POST.name());
		request.setContent(xml.getBytes("UTF-8"));

		ModelAndView mv = null;
		try {
			mv = handlerAdapter.handle(request, response,
					cmpayCallbackController);
		} catch (Exception e) {
			e.printStackTrace();
		}

		Assert.assertNull(mv);
		Assert.assertEquals(response.getStatus(), 200);
		System.out.println(response.getContentAsString());
	}
	
	@Test
	public void postWebCallback() throws ClientProtocolException, IOException {
		CmpayPaymentCallbackWebRequest callbackRequest = new CmpayPaymentCallbackWebRequest();
		callbackRequest.setRemark("中文");
		callbackRequest.setOrderId("201308101615543112");
		callbackRequest.setStatus("SUCCESS");
		String xml = cmpayObjectFactory
				.cmpayPaymentCallbackWebRequest2Xml(callbackRequest);

		request.setRequestURI("/");
		request.setMethod(HttpMethod.POST.name());
		request.setContent(xml.getBytes("UTF-8"));

		ModelAndView mv = null;
		try {
			mv = handlerAdapter.handle(request, response,
					cmpayWebCallbackController);
		} catch (Exception e) {
			e.printStackTrace();
		}

		Assert.assertNull(mv);
		Assert.assertEquals(response.getStatus(), 200);
		System.out.println(response.getContentAsString());
	}
}
