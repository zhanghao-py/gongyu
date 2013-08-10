package cm.h3c.college.pay.cmpay.service.impl;

import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpResponseException;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
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
import cm.h3c.college.pay.payment.cons.LogType;
import cm.h3c.college.pay.payment.service.LogService;

import com.umpay.mpay.SignEncException;

@Component("cmpayPaymentService")
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
		CmpayPaymentRequest request = createPayment(order);
		String reqXml = cmpayObjectFactory.cmpayPaymentReqeust2Xml(request);
		log.info(reqXml);
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
	public CmpayPaymentCheckResponse checkPayment(Long orderId)
			throws ServiceException {
		// create checkRequest by orderId
		CmpayPaymentCheckRequest request = cmpayObjectFactory
				.createCmpayPaymentCheckRequest(orderId);
		String reqXml = cmpayObjectFactory.cmpayPaymentCheckRequest2Xml(request);
		log.info(reqXml);

		// submit
		try {
			String response = postRequest(reqXml, config.getCheckUrl());

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
			HttpResponse response = client.execute(post);

			StatusLine statusLine = response.getStatusLine();
			HttpEntity responseEntity = response.getEntity();
			if (statusLine.getStatusCode() >= 300) {
				EntityUtils.consume(responseEntity);
				log.warn(statusLine.getStatusCode() + ", "
						+ statusLine.getReasonPhrase());
				throw new HttpResponseException(statusLine.getStatusCode(),
						statusLine.getReasonPhrase());
			}
			return entity == null ? null : EntityUtils.toString(responseEntity, "UTF-8");
		} finally {
			if (post != null) {
				post.releaseConnection();
			}
		}
	}

	@Override
	public CmpayPaymentRequest createPayment(Order order)
			throws ServiceException {
		try {
			CmpayPaymentRequest ret = cmpayObjectFactory
					.createCmpayPaymentRequest(order);
			String reqXml = cmpayObjectFactory.cmpayPaymentReqeust2Xml(ret);
			log.info(reqXml);
			// save request to db
			logService.doLog(LogType.CAMS_PAY_REQUEST, order.getId(), reqXml);

			return ret;
		} catch (SignEncException e) {
			throw new ServiceException("sign payment request error", e);
		}
	}
}
