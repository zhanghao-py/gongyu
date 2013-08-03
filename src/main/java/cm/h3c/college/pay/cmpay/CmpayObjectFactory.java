package cm.h3c.college.pay.cmpay;

import java.lang.reflect.Field;

import org.apache.commons.lang3.StringUtils;

import com.thoughtworks.xstream.XStream;
import com.umpay.mpay.SignEncException;
import com.umpay.mpay.SignUtil;

public class CmpayObjectFactory {
	public CmpayPaymentCallBackRequest parseCmpayPaymentCallBackRequest(
			String xml) {
		XStream xstream = new XStream();
		xstream.alias("MESSAGE", CmpayPaymentCallBackRequest.class);
		CmpayPaymentCallBackRequest request = (CmpayPaymentCallBackRequest) xstream
				.fromXML(xml);
		checkSign(request, xml);
		return request;
	}

	public CmpayPaymentCallBackWebRequest parseCmpayPaymentCallBackWebRequest(
			String xml) {
		XStream xstream = new XStream();
		xstream.alias("MESSAGE", CmpayPaymentCallBackWebRequest.class);
		CmpayPaymentCallBackWebRequest request = (CmpayPaymentCallBackWebRequest) xstream
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

	public String cmpayPaymentCallBackResponse2Xml(
			CmpayPaymentCallBackResponse callBackResponse) {
		sign(callBackResponse);
		return toXml(callBackResponse);
	}

	void sign(CmpaySignable obj) {
		/*
		 * try { obj.setSign(SignUtil.doGenerateSign(obj.prepareSignData())); }
		 * catch (SignEncException e) { throw new IllegalArgumentException(e); }
		 */}

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
					+ obj.getClass());
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
}