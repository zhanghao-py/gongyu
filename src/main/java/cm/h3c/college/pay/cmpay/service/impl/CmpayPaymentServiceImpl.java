package cm.h3c.college.pay.cmpay.service.impl;

import java.io.IOException;
import java.util.List;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import cm.h3c.college.pay.cmpay.CmpayObjectFactory;
import cm.h3c.college.pay.cmpay.CmpayPaymentCheckRequest;
import cm.h3c.college.pay.cmpay.CmpayPaymentCheckResponse;
import cm.h3c.college.pay.cmpay.CmpayPaymentRequest;
import cm.h3c.college.pay.cmpay.service.CmpayPaymentService;
import cm.h3c.college.pay.core.config.SystemConfig;
import cm.h3c.college.pay.core.exception.ServiceException;
import cm.h3c.college.pay.payment.bo.Log;
import cm.h3c.college.pay.payment.bo.Order;
import cm.h3c.college.pay.payment.cons.LogType;
import cm.h3c.college.pay.payment.service.LogService;

@Component
public class CmpayPaymentServiceImpl implements CmpayPaymentService {
	private static Logger log = Logger.getLogger(CmpayPaymentServiceImpl.class);

	private DefaultHttpClient client = new DefaultHttpClient();

	@Autowired
	private SystemConfig config;

	@Autowired
	private CmpayObjectFactory cmpayObjectFactory;

	@Autowired
	private LogService logService;

	@Override
	public void submitPayment(Order order) throws ServiceException {
		// create CmpayPaymentRequest
		CmpayPaymentRequest request = new CmpayPaymentRequest();
		String reqXml = cmpayObjectFactory.cmpayPaymentReqeust2Xml(request);
		// save request to db
		logService.doLog(LogType.CAMS_PAY_REQUEST, order.getId(), reqXml);

		// submit
		try {
			String response = postRequest(reqXml, config.getPayUrl());
			if (log.isDebugEnabled()) {
				log.debug("submitPayment response:" + response);
			}
		} catch (Exception e) {
			log.error("", e);
			throw new ServiceException("submit payment error", e);
		}
	}

	@Override
	public CmpayPaymentCheckResponse checkPayment(Order order)
			throws ServiceException {
		// get paymentRequest from db
		List<Log> reqList = logService.findByOrderId(order.getId());
		if (reqList.isEmpty()) {
			throw new ServiceException("Can't find payment request. order.id="
					+ order.getId());
		}
		if (reqList.size() > 1) {
			log.warn("Muilty payment request find, use the first. order.id="
					+ order.getId());
		}

		CmpayPaymentRequest paymentRequest = cmpayObjectFactory
				.parseCmpayPaymentRequest(reqList.get(0).getContent());

		// create checkRequest by paymentRequest
		CmpayPaymentCheckRequest request = cmpayObjectFactory
				.createCmpayPaymentCheckRequest(paymentRequest);

		log.info(request);

		// submit
		try {
			String response = postRequest(
					cmpayObjectFactory.cmpayPaymentCheckRequest2Xml(request),
					config.getCheckUrl());

			log.info(response);
			return cmpayObjectFactory.parseCmpayPaymentCheckResponse(response);
		} catch (Exception e) {
			log.error("", e);
			throw new ServiceException("submit payment error", e);
		}
	}

	protected String postRequest(String reqXml, String uri)
			throws ClientProtocolException, IOException {
		HttpPost post = new HttpPost(uri);
		ByteArrayEntity entity = new ByteArrayEntity(reqXml.getBytes("UTF-8"));
		post.setEntity(entity);
		try {
			ResponseHandler<String> responseHandler = new BasicResponseHandler();
			return client.execute(post, responseHandler);
		} finally {
			if (post != null) {
				post.releaseConnection();
			}
		}
	}
}
