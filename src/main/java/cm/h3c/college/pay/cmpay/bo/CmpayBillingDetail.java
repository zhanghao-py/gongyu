package cm.h3c.college.pay.cmpay.bo;

import java.io.Serializable;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;

import org.apache.commons.lang.StringUtils;

import cm.h3c.college.pay.payment.bo.College;


public class CmpayBillingDetail implements Serializable {
	
	private static final long serialVersionUID = -3226567125889601947L;
	
	private volatile Long hashCode;
	private static final Map<Serializable, Long> SAVED_HASHES = Collections
			.synchronizedMap(new WeakHashMap<Serializable, Long>());
	
	/**
	 * 主键id
	 */
	private Long id;
	
	/**
	 * 商户编号 15位
	 */
	private String merId;
	
	/**
	 * 产品编号 最长30位
	 */
	private String productId;
	
	/**
	 * 商户订单号 20位
	 */
	private String orderId;
	
	/**
	 * 订单日期 8位
	 */
	private String orderDate;
	
	/**
	 * 支付日期 8位
	 */
	private String payDate;
	
	/**
	 * 金额 15位 单位：分
	 */
	private String amount;
	
	/**
	 * 付款类型 1位
	 */
	private String type;
	
	/**
	 * 订单状态 1位
	 */
	private String status;
	
	/**
	 * 外键关联headerId
	 */
	private Long headerId;
	
	public CmpayBillingDetail() { }
	
	public CmpayBillingDetail(String line) {
		this.merId = StringUtils.substring(line, 0, 15);
		this.productId = StringUtils.substring(line, 15, 45);
		this.orderId = StringUtils.substring(line, 45, 65);
		this.orderDate = StringUtils.substring(line, 65, 73);
		this.payDate = StringUtils.substring(line, 73, 81);
		this.amount = StringUtils.substring(line, 81, 96);
		this.type = StringUtils.substring(line, 96, 97);
		this.status = StringUtils.substring(line, 97, 98);
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

	public String getMerId() {
		return merId;
	}

	public void setMerId(String merId) {
		this.merId = merId;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public String getPayDate() {
		return payDate;
	}

	public void setPayDate(String payDate) {
		this.payDate = payDate;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Long getHeaderId() {
		return headerId;
	}

	public void setHeaderId(Long headerId) {
		this.headerId = headerId;
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
		if (!(other instanceof College)) {
			return false;
		}

		final CmpayBillingDetail that = (CmpayBillingDetail) other;
		boolean result = true;
		result = result
				&& (((this.getId() == null) && (that.getId() == null)) || (this
						.getId() != null && this.getId().equals(that.getId())));
		return result;
	}

}
