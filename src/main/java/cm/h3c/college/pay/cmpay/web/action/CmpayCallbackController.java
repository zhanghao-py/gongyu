package cm.h3c.college.pay.cmpay.web.action;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

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
import cm.h3c.college.pay.cmpay.CmpayPaymentCallbackRequest;
import cm.h3c.college.pay.cmpay.CmpayPaymentCallbackResponse;
import cm.h3c.college.pay.cmpay.service.CmpayPaymentService;
import cm.h3c.college.pay.core.config.SystemConfig;
import cm.h3c.college.pay.core.exception.ServiceException;
import cm.h3c.college.pay.payment.cons.LogType;
import cm.h3c.college.pay.payment.cons.PayResult;
import cm.h3c.college.pay.payment.service.LogService;
import cm.h3c.college.pay.payment.service.OrderService;

@Controller
public class CmpayCallbackController implements HttpRequestHandler {
	private static Logger log = Logger
			.getLogger(CmpayWebCallbackController.class);

	@Autowired
	private CmpayObjectFactory cmpayObjectFactory;

	@Autowired
	private OrderService orderService;

	@Autowired
	private LogService logService;

	@Autowired
	private SystemConfig config;

	@Override
	@RequestMapping("/back")
	public void handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String reqXml = FileCopyUtils.copyToString(new InputStreamReader(
				request.getInputStream(), "UTF-8"));
		log.info(reqXml);

		CmpayPaymentCallbackRequest callback = cmpayObjectFactory
				.parseCmpayPaymentCallbackRequest(reqXml);

		CmpayPaymentCallbackResponse callbackResponse = cmpayObjectFactory
				.createCmpayPaymentCallbackResponse(callback);

		Long orderId = null;
		try {
			orderId = Long.parseLong(callback.getOrderId());
		} catch (NumberFormatException e) {
			log.error("parse callback.orderId to Long error, xml=" + reqXml);
			callbackResponse.setRcode("1");
			callbackResponse.setDesc("error orderid");
			sendCallBackResponse(response, callbackResponse);
			return;
		}

		// log callback to DB
		try {
			logService.doLog(LogType.CMPAY_CALLBACK_REQUEST, orderId, reqXml);
		} catch (ServiceException e) {
			log.error("save callback error, xml=" + reqXml, e);
		}

		try {

			orderService.updateOrderPayResultByCallback(orderId,
					PayResult.valueOf(callback.getStatus()),
					callback.getRemark());
			callbackResponse.setRcode(CmpayPaymentService.RCODE_SUCCESS);
		} catch (Exception e) {
			callbackResponse.setRcode("2");
			log.error("", e);
		}

		// send response
		sendCallBackResponse(response, callbackResponse);
	}

	private void sendCallBackResponse(HttpServletResponse response,
			CmpayPaymentCallbackResponse callbackResponse)
			throws UnsupportedEncodingException, IOException {
		String responseXml = cmpayObjectFactory
				.cmpayPaymentCallbackResponse2Xml(callbackResponse);
		response.getOutputStream().write(responseXml.getBytes("UTF-8"));
	}
}
