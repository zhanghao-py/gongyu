package cm.h3c.college.pay.cmpay.web.action;

import java.io.IOException;
import java.io.InputStreamReader;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.HttpRequestHandler;
import org.springframework.web.bind.annotation.RequestMapping;

import cm.h3c.college.pay.cmpay.CmpayObjectFactory;
import cm.h3c.college.pay.cmpay.CmpayPaymentCallbackWebRequest;
import cm.h3c.college.pay.core.config.SystemConfig;
import cm.h3c.college.pay.core.exception.ServiceException;
import cm.h3c.college.pay.payment.service.OrderService;

@Controller
public class CmpayWebCallbackController implements HttpRequestHandler {
	private static Logger log = Logger
			.getLogger(CmpayWebCallbackController.class);

	@Autowired
	private CmpayObjectFactory cmpayObjectFactory;

	@Autowired
	private OrderService orderService;

	@Autowired
	private SystemConfig config;

	@Override
	@RequestMapping("/web")
	public void handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String reqXml = FileCopyUtils.copyToString(new InputStreamReader(
				request.getInputStream(), "UTF-8"));
		log.info(reqXml); //记录下来出现问题时排查用

		CmpayPaymentCallbackWebRequest callback = cmpayObjectFactory
				.parseCmpayPaymentCallbackWebRequest(reqXml);

		try {
			orderService.doWebCallbackOrder(callback);
		} catch (NumberFormatException e) {
			log.error("parse callback.orderId to Long error, xml=" + reqXml);
		} catch (ServiceException e) {
			log.error("", e);
		}

		request.getRequestDispatcher(
				request.getContextPath() + config.getPaymentResultUrl())
				.forward(request, response);
	}
}
