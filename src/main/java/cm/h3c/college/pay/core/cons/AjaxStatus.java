package cm.h3c.college.pay.core.cons;

public enum AjaxStatus {

	SUCCESS("�ɹ�", 0L), 
	ERROR("ʧ��", 400L);

	private String name;
	private Long value;

	private AjaxStatus(String name, Long value) {
		this.name = name;
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getValue() {
		return value;
	}

	public void setValue(Long value) {
		this.value = value;
	}

}
