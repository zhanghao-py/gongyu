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
import cm.h3c.college.pay.cmpay.CmpayPaymentFileNotifyRequest;
import cm.h3c.college.pay.cmpay.CmpayPaymentFileNotifyResponse;
import cm.h3c.college.pay.cmpay.service.CmpayBillingService;
import cm.h3c.college.pay.cmpay.service.CmpayPaymentService;
import cm.h3c.college.pay.core.exception.ServiceException;
import cm.h3c.college.pay.payment.cons.LogType;
import cm.h3c.college.pay.payment.service.LogService;

@Controller
public class CmpayFileNotifyController implements HttpRequestHandler {
	private static Logger log = Logger
			.getLogger(CmpayFileNotifyController.class);

	@Autowired
	private CmpayObjectFactory cmpayObjectFactory;

	@Autowired
	private LogService logService;

	@Autowired
	private CmpayBillingService cmpayBillingService;

	@Override
	@RequestMapping("/uploaded")
	public void handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String reqXml = FileCopyUtils.copyToString(new InputStreamReader(
				request.getInputStream(), "UTF-8"));
		log.info(reqXml);// 记录下来出现问题时排查用

		CmpayPaymentFileNotifyRequest notify = cmpayObjectFactory
				.parseCmpayPaymentFileNotifyRequest(reqXml);

		CmpayPaymentFileNotifyResponse notifyResponse = cmpayObjectFactory
				.createCmpayPaymentFileNotifyResponse(notify);
		try {
			logService.doLog(LogType.CMPAY_CALLBACK_FILE_NOTIFY_REQUEST, reqXml);
			cmpayBillingService.doLogCmpayBilling(notify);
			// TODO check order
			notifyResponse.setRcode(CmpayPaymentService.RCODE_SUCCESS);
			sendCallBackResponse(response, notifyResponse, notify.getMerId());
		} catch (ServiceException e) {
			notifyResponse.setRcode("2");
			notifyResponse.setDesc("error " + e.getMessage());
			log.error("save callback error, xml=" + reqXml, e);
			sendCallBackResponse(response, notifyResponse, notify.getMerId());
		}
	}

	private void sendCallBackResponse(HttpServletResponse response,
			CmpayPaymentFileNotifyResponse notifyResponse, String merId)
			throws UnsupportedEncodingException, IOException {
		String responseXml = cmpayObjectFactory
				.cmpayPaymentFileNotifyResponse2Xml(notifyResponse, merId);
		response.getOutputStream().write(responseXml.getBytes("UTF-8"));
	}
}
