package cm.h3c.college.pay.cmpay;

import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.util.Date;

import org.apache.commons.lang.time.DateFormatUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import cm.h3c.college.pay.core.config.SystemConfig;
import cm.h3c.college.pay.core.util.SecurityCodeUtil;
import cm.h3c.college.pay.payment.bo.Order;

import com.thoughtworks.xstream.XStream;
import com.umpay.mpay.SignEncException;
import com.umpay.mpay.SignUtil;

@Component
public class CmpayObjectFactory {
	@Autowired
	private SystemConfig config;

	public CmpayPaymentCallbackRequest parseCmpayPaymentCallbackRequest(
			String xml) {
		XStream xstream = new XStream();
		xstream.alias("MESSAGE", CmpayPaymentCallbackRequest.class);
		CmpayPaymentCallbackRequest request = (CmpayPaymentCallbackRequest) xstream
				.fromXML(xml);

		if (!config.isDebug()) {
			checkSign(request, xml);
		}
		return request;
	}

	public CmpayPaymentCallbackWebRequest parseCmpayPaymentCallbackWebRequest(
			String xml) {
		XStream xstream = new XStream();
		xstream.alias("MESSAGE", CmpayPaymentCallbackWebRequest.class);
		CmpayPaymentCallbackWebRequest request = (CmpayPaymentCallbackWebRequest) xstream
				.fromXML(xml);

		if (!config.isDebug()) {
			checkSign(request, xml);
		}
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

	public void checkSign(CmpaySignable signedObj, String xml) {

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

	public CmpayPaymentCheckRequest createCmpayPaymentCheckRequest(Long orderId) {
		CmpayPaymentCheckRequest ret = new CmpayPaymentCheckRequest();
		Date date = new Date();
		ret.MID = genMid(date);
		ret.DATE = formatYyyyMMdd(date);
		ret.TIME = formatHHmmsss(date);
		ret.MERID = config.getMerId();
		ret.ORDERID = "10" + orderId;
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

	String genMid(Date date) {
		return Long.toString(date.getTime() - 1370000000000L)
				+ SecurityCodeUtil.getRandomNumberLen4();
	}

	String formatYyyyMMdd(Date date) {
		return DateFormatUtils.format(date, "yyyyMMdd");
	}

	String formatHHmmsss(Date date) {
		return DateFormatUtils.format(date, "HHmmss");
	}

	public CmpayPaymentRequest createCmpayPaymentRequest(Order order)
			throws SignEncException {
		Date payTime = new Date();
		CmpayPaymentRequest request = new CmpayPaymentRequest();
		request.MID = genMid(new Date());
		request.DATE = formatYyyyMMdd(payTime);
		request.TIME = formatHHmmsss(payTime);
		request.MERID = config.getMerId();
		request.ORDERID = "0" + order.getId();
		request.AMOUT = order.getMoney().multiply(new BigDecimal(100))
				.toBigInteger().toString();
		request.ALLOWNOTE = "1";
		request.AUTHORIZEMODE = "WEB";
		request.CURRENCY = "CNY";
		request.ORDERDATE = request.DATE;
		request.PERIOD = "30";// 有效期数量 3位
		request.PERIODUNIT = "4";// 有效期单位 1位1-月2-日3-小时4-分钟
		request.PRODUCTDESC = config.getProductDesc();
		request.PRODUCTID = request.AMOUT;
		request.PRODUCTNAME = config.getProductName();
		request.TXNTYP = "S";// 交易类型 1位S：直接支付
		request.CALLBACK = config.getCallbackUrl() + "?orderId="
				+ order.getId();
		request.MOBILEID = order.getAccount();
		request.SIGN = SignUtil.doGenerateSign(request.prepareSignData());
		return request;
	}
}
