package cm.h3c.college.pay.cmpay.service.impl;

import java.io.IOException;

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
import cm.h3c.college.pay.payment.bo.Order;

@Component
public class CmpayPaymentServiceImpl implements CmpayPaymentService {
	private static Logger log = Logger.getLogger(CmpayPaymentServiceImpl.class);

	private DefaultHttpClient client = new DefaultHttpClient();

	@Autowired
	private SystemConfig config;

	@Autowired
	private CmpayObjectFactory cmpayObjectFactory;

	@Override
	public void submitPayment(Order order) throws ServiceException {
		// create CmpayPaymentRequest
		CmpayPaymentRequest request = new CmpayPaymentRequest();
		// save request to db

		// submit
		try {
			String response = postRequest(
					cmpayObjectFactory.cmpayPaymentReqeust2Xml(request),
					config.getPayUrl());
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
		
		// create checkRequest by paymentRequest
		CmpayPaymentCheckRequest request = new CmpayPaymentCheckRequest();
		
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
