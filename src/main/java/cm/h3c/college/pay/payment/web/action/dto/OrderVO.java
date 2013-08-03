package cm.h3c.college.pay.payment.web.action.dto;

import java.math.BigDecimal;

public class OrderVO {

	private Long id;

	private String collegeName;

	private BigDecimal money;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public BigDecimal getMoney() {
		return money;
	}

	public void setMoney(BigDecimal money) {
		this.money = money;
	}

}
