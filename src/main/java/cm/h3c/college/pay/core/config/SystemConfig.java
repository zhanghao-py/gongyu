package cm.h3c.college.pay.core.config;

public class SystemConfig {

	public final static String ORDER_FORM_KEY = "orderForm";
	public final static String SECURITY_CODE_KEY = "securityCode";

	private String merId;
	private String payUrl;
	private String checkUrl;

	private String paymentResultUrl;

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

}
