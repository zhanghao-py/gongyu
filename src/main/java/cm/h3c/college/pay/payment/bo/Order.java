package cm.h3c.college.pay.payment.bo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collections;
import java.util.Date;
import java.util.Map;
import java.util.WeakHashMap;

import cm.h3c.college.pay.payment.web.action.dto.OrderForm;

public class Order implements Serializable {

	private static final long serialVersionUID = 2014593433036376984L;
	
	private volatile Long hashCode;
	private static final Map<Serializable, Long> SAVED_HASHES = Collections
			.synchronizedMap(new WeakHashMap<Serializable, Long>());
	
	/**
	 * 主键id，订单号
	 */
	private Long id;
	
	/**
	 * 缴费金额
	 */
	private BigDecimal money;
	
	/**
	 * 订单状态()
	 */
	private Short status;
	
	/**
	 * 支付结果()
	 */
	private Short payResult;
	
	/**
	 * 充值结果()
	 */
	private Short camsResult;
	
	/**
	 * 订单创建时间
	 */
	private Date createTime;
	
	/**
	 * 付款开始时间
	 */
	private Date payTime;
	
	/**
	 * 完成时间
	 */
	private Date finishTime;
	
	/**
	 * 缴费账号
	 */
	private String account;
	
	/**
	 * 所属学校id
	 */
	private Long collegeId;
	
	public Order() {}
	
	public Order(OrderForm form) {
		setAccount(form.getAccount());
		setCollegeId(form.getCollegeId());
		setMoney(form.getMoney());
		setStatus(form.getStatus());
		setPayResult(form.getPayResult());
		setCamsResult(form.getCamsResult());
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		if ( this.id == null && id != null && this.hashCode != null ) {
            SAVED_HASHES.put( id, this.hashCode );
        }
		this.id = id;
	}

	public BigDecimal getMoney() {
		return money;
	}

	public void setMoney(BigDecimal money) {
		this.money = money;
	}

	public Short getStatus() {
		return status;
	}

	public void setStatus(Short status) {
		this.status = status;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
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

	@Override
	public int hashCode() {
		if (this.hashCode == null) {
			synchronized (this) {
				if (this.hashCode == null) {
					Long newHashCode = null;
					if (getId() != null) {
						newHashCode = SAVED_HASHES.get(getId());
					}

					if (newHashCode == null) {
						if (getId() != null) {
							newHashCode = (long) getId().hashCode();
						} else {
							newHashCode = (long) super.hashCode();
						}
					}
					this.hashCode = newHashCode;
				}
			}
		}
		return (int) (this.hashCode & 0xffffff);
	}
	
	@Override
	public boolean equals(final Object other) {

		if (this == other) {
			return true;
		}
		if (other == null) {
			return false;
		}
		if (!(other instanceof Order)) {
			return false;
		}

		final Order that = (Order) other;
		boolean result = true;
		result = result
				&& (((this.getId() == null) && (that.getId() == null)) || (this
						.getId() != null && this.getId().equals(that.getId())));
		return result;
	}

	public Long getCollegeId() {
		return collegeId;
	}

	public void setCollegeId(Long collegeId) {
		this.collegeId = collegeId;
	}

	public Date getPayTime() {
		return payTime;
	}

	public void setPayTime(Date payTime) {
		this.payTime = payTime;
	}

	public Date getFinishTime() {
		return finishTime;
	}

	public void setFinishTime(Date finishTime) {
		this.finishTime = finishTime;
	}

	public boolean isPaySuccess() {
		// TODO Auto-generated method stub
		return false;
	}

	

}
