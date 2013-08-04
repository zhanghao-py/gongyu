package cm.h3c.college.pay.payment.cons;

public enum LogType {
	
	CMPAY_REQUEST("CmpayRequest", (short) 1), 
	CMPAY_CALLBACK_REQUEST("CmpayCallbackRequest", (short) 2),
	CMPAY_CALLBACK_WEB_REQUEST("CmpayCallbackWebRequest", (short) 3),
	
	CAMS_PAY_REQUEST("CAMS充值日志", (short) 10),
	
	LOCAL_LOG("本地日志", (short) 20),;

	private String name;
	private Short value;
	
	private LogType(String name, Short value) {
		this.name = name;
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Short getValue() {
		return value;
	}

	public void setValue(Short value) {
		this.value = value;
	}
	

	
}
