package cm.h3c.college.pay.cmpay.bo;

import java.io.Serializable;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;

import org.apache.commons.lang.StringUtils;

import cm.h3c.college.pay.payment.bo.College;

public class CmpayBillingHeader implements Serializable {

	private static final long serialVersionUID = -1752459352225531049L;
	
	private volatile Long hashCode;
	private static final Map<Serializable, Long> SAVED_HASHES = Collections
			.synchronizedMap(new WeakHashMap<Serializable, Long>());
	
	/**
	 * 主键id
	 */
	private Long id;
	
	/**
	 * 商户ID 15位
	 */
	private String merId;
	
	/**
	 * 省平台编号 8位
	 */
	private String provinceId;
	
	/**
	 * 交易笔数 8位
	 */
	private String dealTimes;
	
	/**
	 * 交易总金额 15位 单位：分
	 */
	private String dealAmount;
	
	/**
	 * 账务日期 YYYYMMDD
	 */
	private String date;
	
	public CmpayBillingHeader() {}
	
	public CmpayBillingHeader(String filename, String headLine) {
		this.merId = StringUtils.substring(filename, 9, 24);
		this.date = StringUtils.substring(filename, 34, 42);
		this.provinceId = StringUtils.substring(headLine, 0, 8);
		this.dealTimes = StringUtils.substring(headLine, 8, 16);
		this.dealAmount = StringUtils.substring(headLine, 16, 31);
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

	public String getProvinceId() {
		return provinceId;
	}

	public void setProvinceId(String provinceId) {
		this.provinceId = provinceId;
	}

	public String getDealTimes() {
		return dealTimes;
	}

	public void setDealTimes(String dealTimes) {
		this.dealTimes = dealTimes;
	}

	public String getDealAmount() {
		return dealAmount;
	}

	public void setDealAmount(String dealAmount) {
		this.dealAmount = dealAmount;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
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

		final CmpayBillingHeader that = (CmpayBillingHeader) other;
		boolean result = true;
		result = result
				&& (((this.getId() == null) && (that.getId() == null)) || (this
						.getId() != null && this.getId().equals(that.getId())));
		return result;
	}

	
}
