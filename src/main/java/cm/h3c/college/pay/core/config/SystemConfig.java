package cm.h3c.college.pay.core.config;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;

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

	private String merId;
	private String payUrl;
	private String checkUrl;

	private String paymentResultUrl;
	private String callbackUrl;
	private String productDesc;
	private String productName;

	public String getMerId() {
		return merId;
	}

	public void setMerId(String merId) {
		this.merId = merId;
	}

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

}
