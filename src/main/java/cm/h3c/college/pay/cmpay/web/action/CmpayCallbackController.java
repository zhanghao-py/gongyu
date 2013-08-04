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
import cm.h3c.college.pay.cmpay.CmpayPaymentCallbackRequest;
import cm.h3c.college.pay.cmpay.CmpayPaymentCallbackResponse;
import cm.h3c.college.pay.cmpay.CmpayPaymentRequest;
import cm.h3c.college.pay.cmpay.service.CmpayPaymentService;
import cm.h3c.college.pay.core.config.SystemConfig;
import cm.h3c.college.pay.payment.bo.Order;
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

		// log callback to DB

		// get payment
		CmpayPaymentRequest payment = new CmpayPaymentRequest();
		CmpayPaymentCallbackResponse callbackResponse = new CmpayPaymentCallbackResponse(
				payment);

		try {
			// get Order
			Order order = orderService.findOrderById(Long.parseLong(callback
					.getOrderId()));

			if (order.isPaySuccess()) {
				log.warn("duplication payment callback, ignore: " + callback);
			} else {
				// update order status
				if (callback.getStatus().equals(
						CmpayPaymentService.PaymentResult.SUCCESS.name())) {
					orderService.paySuccess(order);
				} else {
					orderService.payFiled(order, callback.getStatus(),
							callback.getRemark());
				}
			}

			callbackResponse.setRcode(CmpayPaymentService.RCODE_SUCCESS);
		} catch (Exception e) {
			callbackResponse.setRcode("-1");
			log.error("", e);
		}

		// send response
		String responseXml = cmpayObjectFactory
				.cmpayPaymentCallbackResponse2Xml(callbackResponse);
		response.getOutputStream().write(responseXml.getBytes("UTF-8"));
	}
}
