package cm.h3c.college.pay.payment.bo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collections;
import java.util.Date;
import java.util.Map;
import java.util.WeakHashMap;

public class Order implements Serializable {

	private static final long serialVersionUID = 2014593433036376984L;
	
	private volatile Long hashCode;
	private static final Map<Serializable, Long> SAVED_HASHES = Collections
			.synchronizedMap(new WeakHashMap<Serializable, Long>());
	
	/**
	 * ����id��������
	 */
	private Long id;
	
	/**
	 * �ɷѽ��
	 */
	private BigDecimal money;
	
	/**
	 * ����״̬()
	 */
	private Short status;
	
	/**
	 * ֧�����()
	 */
	private Short payResult;
	
	/**
	 * ��ֵ���()
	 */
	private Short camsResult;
	
	/**
	 * ��������ʱ��
	 */
	private Date createTime;
	
	/**
	 * �ɷ��˺�
	 */
	private String account;
	
	/**
	 * ����ѧУid
	 */
	private Long collegeId;
	
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


}
