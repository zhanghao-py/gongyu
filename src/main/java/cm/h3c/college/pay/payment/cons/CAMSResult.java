package cm.h3c.college.pay.payment.cons;

public enum CAMSResult {
	
	SUCCESS("充值成功", (short) 1), 
	FAIL("充值失败", (short) 2);

	private String name;
	private Short value;
	
	private CAMSResult(String name, Short value) {
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
