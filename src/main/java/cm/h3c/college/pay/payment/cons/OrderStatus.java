package cm.h3c.college.pay.payment.cons;

public enum OrderStatus {
	
	INIT("单订初始化", (short) 1), 
	PAYING("支付中", (short) 2), 
	DONE("支付完成", (short) 3);

	private String name;
	private Short value;
	
	private OrderStatus(String name, Short value) {
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
