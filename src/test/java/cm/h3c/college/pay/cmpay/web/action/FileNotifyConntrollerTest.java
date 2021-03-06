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
import cm.h3c.college.pay.cmpay.CmpayPaymentFileNotifyRequest;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:/config/spring.xml",
		"classpath:/config/spring-webmvc.xml" })
public class FileNotifyConntrollerTest {
	@Autowired
	public HttpRequestHandlerAdapter handlerAdapter;
	
	@Autowired
	private CmpayFileNotifyController cmpayFileNotifyController;
	
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
		CmpayPaymentFileNotifyRequest callbackRequest = new CmpayPaymentFileNotifyRequest();
		
		String xml = cmpayObjectFactory
				.cmpayPaymentFileNotifyRequest2Xml(callbackRequest);

		request.setRequestURI("/back.pay");
		request.setMethod(HttpMethod.POST.name());
		request.setContent(xml.getBytes("UTF-8"));

		ModelAndView mv = null;
		try {
			mv = handlerAdapter.handle(request, response,
					cmpayFileNotifyController);
		} catch (Exception e) {
			e.printStackTrace();
		}

		Assert.assertNull(mv);
		Assert.assertEquals(response.getStatus(), 200);
		System.out.println(response.getContentAsString());
	}
	
}
