package cm.h3c.college.pay.core.config;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("systemConfig")
public class SystemConfig {

	static {
		System.setProperty("javax.net.ssl.trustStore", SystemConfig.class
				.getClassLoader().getResource("jssecacerts").getFile());
		
		HttpsURLConnection.setDefaultHostnameVerifier(new HostnameVerifier() {
			public boolean verify(String hostname, SSLSession session) {
				if (hostname.equals("192.168.1.11"))
					return true;
				return false;
			}
		});
	}

	public final static String ORDER_FORM_KEY = "orderForm";
	public final static String SECURITY_CODE_KEY = "securityCode";
	public static final String ILLEGAL_REQUEST = "请求异常!";

	@Value("${payUrl}")
	private String payUrl;
	@Value("${checkUrl}")
	private String checkUrl;

	@Value("${paymentResultUrl}")
	private String paymentResultUrl;
	@Value("${callbackUrl}")
	private String callbackUrl;
	@Value("${productDesc}")
	private String productDesc;
	@Value("${productName}")
	private String productName;
	
	@Value("${app.debug}")
	private boolean debug;
	@Value("${callbackThreadNumber}")
	private int callbackThreadNumber;

	public String getPayUrl() {
		return payUrl;
	}

	public void setPayUrl(String payUrl) {
		this.payUrl = payUrl;
	}

	public String getCheckUrl() {
		return checkUrl;
	}

	public void setCheckUrl(String checkUrl) {
		this.checkUrl = checkUrl;
	}

	public String getPaymentResultUrl() {
		return paymentResultUrl;
	}

	public void setPaymentResultUrl(String paymentResultUrl) {
		this.paymentResultUrl = paymentResultUrl;
	}

	public String getCallbackUrl() {
		return callbackUrl;
	}

	public void setCallbackUrl(String callbackUrl) {
		this.callbackUrl = callbackUrl;
	}

	public String getProductDesc() {
		return productDesc;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public boolean isDebug() {
		return debug;
	}

	public void setDebug(boolean debug) {
		this.debug = debug;
	}

	public int getCallbackThreadNumber() {
		return callbackThreadNumber;
	}

	public void setCallbackThreadNumber(int callbackThreadNumber) {
		this.callbackThreadNumber = callbackThreadNumber;
	}

}
