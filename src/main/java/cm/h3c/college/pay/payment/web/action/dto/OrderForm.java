package cm.h3c.college.pay.payment.web.action.dto;

import java.math.BigDecimal;

import cm.h3c.college.pay.core.web.action.dto.AbstractGenericModel;

public class OrderForm extends AbstractGenericModel {

	private Long id;
	
	private String account;

	private Long collegeId;

	private BigDecimal money;

	private Short status;
	
	private Short payResult;
	
	private Short camsResult;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public Short getStatus() {
		return status;
	}

	public void setStatus(Short status) {
		this.status = status;
	}

	public Short getPayResult() {
		return payResult;
	}

	public void setPayResult(Short payResult) {
		this.payResult = payResult;
	}

	public Short getCamsResult() {
		return camsResult;
	}

	public void setCamsResult(Short camsResult) {
		this.camsResult = camsResult;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public Long getCollegeId() {
		return collegeId;
	}

	public void setCollegeId(Long collegeId) {
		this.collegeId = collegeId;
	}

	public BigDecimal getMoney() {
		return money;
	}

	public void setMoney(BigDecimal money) {
		this.money = money;
	}

}
