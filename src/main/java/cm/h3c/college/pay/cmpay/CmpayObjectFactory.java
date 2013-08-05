package cm.h3c.college.pay.cmpay;

import java.lang.reflect.Field;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

import com.thoughtworks.xstream.XStream;
import com.umpay.mpay.SignEncException;
import com.umpay.mpay.SignUtil;

@Component
public class CmpayObjectFactory {
	public CmpayPaymentCallbackRequest parseCmpayPaymentCallbackRequest(
			String xml) {
		XStream xstream = new XStream();
		xstream.alias("MESSAGE", CmpayPaymentCallbackRequest.class);
		CmpayPaymentCallbackRequest request = (CmpayPaymentCallbackRequest) xstream
				.fromXML(xml);
		checkSign(request, xml);
		return request;
	}

	public CmpayPaymentCallbackWebRequest parseCmpayPaymentCallbackWebRequest(
			String xml) {
		XStream xstream = new XStream();
		xstream.alias("MESSAGE", CmpayPaymentCallbackWebRequest.class);
		CmpayPaymentCallbackWebRequest request = (CmpayPaymentCallbackWebRequest) xstream
				.fromXML(xml);
		checkSign(request, xml);
		return request;
	}

	public CmpayPaymentCheckResponse parseCmpayPaymentCheckResponse(String xml) {
		XStream xstream = new XStream();
		xstream.alias("MESSAGE", CmpayPaymentCheckResponse.class);
		CmpayPaymentCheckResponse response = (CmpayPaymentCheckResponse) xstream
				.fromXML(xml);
		checkSign(response, xml);
		return response;
	}

	public CmpayPaymentRequest parseCmpayPaymentRequest(String xml) {
		XStream xstream = new XStream();
		xstream.alias("MESSAGE", CmpayPaymentRequest.class);
		CmpayPaymentRequest response = (CmpayPaymentRequest) xstream
				.fromXML(xml);
		return response;
	}

	void checkSign(CmpaySignable signedObj, String xml) {

		try {
			if (!SignUtil.doCheckSign(signedObj.prepareSignData(),
					signedObj.getSign())) {
				throw new IllegalArgumentException("check Sign failed " + xml);
			}
		} catch (SignEncException e) {
			throw new IllegalArgumentException("check Sign failed " + xml, e);
		}

	}

	public String cmpayPaymentCallbackResponse2Xml(
			CmpayPaymentCallbackResponse callBackResponse) {
		sign(callBackResponse);
		return toXml(callBackResponse);
	}

	void sign(CmpaySignable obj) {
		try {
			obj.setSign(SignUtil.doGenerateSign(obj.prepareSignData()));
		} catch (SignEncException e) {
			throw new IllegalArgumentException(e);
		}
	}

	String toXml(Object obj) {
		try {
			Class<?> clazz = obj.getClass();
			StringBuilder ret = new StringBuilder();
			ret.append("<MESSAGE>");
			for (Field field : clazz.getDeclaredFields()) {
				ret.append("<").append(field.getName().toUpperCase())
						.append(">");
				ret.append(StringUtils.stripToEmpty((String) field.get(obj)));
				ret.append("</").append(field.getName().toUpperCase())
						.append(">");
			}
			ret.append("</MESSAGE>");
			return ret.toString();
		} catch (Exception e) {
			throw new IllegalArgumentException("transfer obj to xml error, "
					+ obj.getClass(), e);
		}
	}

	public String cmpayPaymentCheckRequest2Xml(
			CmpayPaymentCheckRequest checkRequest) {
		sign(checkRequest);
		return toXml(checkRequest);
	}

	public String cmpayPaymentReqeust2Xml(CmpayPaymentRequest request) {
		sign(request);
		return toXml(request);
	}

	public String cmpayPaymentCallbackRequest2Xml(
			CmpayPaymentCallbackRequest callbackRequest) {
		sign(callbackRequest);
		return toXml(callbackRequest);
	}

	public String cmpayPaymentCallbackWebRequest2Xml(
			CmpayPaymentCallbackWebRequest callbackWebRequest) {
		sign(callbackWebRequest);
		return toXml(callbackWebRequest);
	}

	public String cmpayPaymentCallbackRequest(
			CmpayPaymentCallbackRequest callBackRequest) {
		sign(callBackRequest);
		return toXml(callBackRequest);
	}
	
	public CmpayPaymentCheckRequest createCmpayPaymentCheckRequest(
			CmpayPaymentRequest paymentRequest) {
		CmpayPaymentCheckRequest ret = new CmpayPaymentCheckRequest();
		ret.MID = paymentRequest.MID;
		ret.DATE = paymentRequest.DATE;
		ret.TIME = paymentRequest.TIME;
		ret.MERID = paymentRequest.MERID;
		ret.ORDERID = paymentRequest.ORDERID;
		return ret;
	}

	public CmpayPaymentCallbackResponse createCmpayPaymentCallbackResponse(
			CmpayPaymentCallbackRequest callback) {
		CmpayPaymentCallbackResponse ret = new CmpayPaymentCallbackResponse();
		ret.MID = callback.MID;
		ret.DATE = callback.DATE;
		ret.TIME = callback.TIME;
		return ret;
	}
}
