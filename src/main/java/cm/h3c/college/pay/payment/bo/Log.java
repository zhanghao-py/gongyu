package cm.h3c.college.pay.payment.bo;

import java.io.Serializable;
import java.util.Collections;
import java.util.Date;
import java.util.Map;
import java.util.WeakHashMap;

public class Log implements Serializable {

	private static final long serialVersionUID = -8929526503238718837L;
	
	private volatile Long hashCode;
	private static final Map<Serializable, Long> SAVED_HASHES = Collections
			.synchronizedMap(new WeakHashMap<Serializable, Long>());

	/**
	 * 主键id, 日志id
	 */
	private Long id;
	
	/**
	 * 订单id
	 */
	private Long orderId;

	/**
	 * 日志类型(1:CmpayRequest 2:CmpayCallbackRequest 3:CmpayCallbackWebRequest 10:CAMS充值日志 20:本地日志)
	 */
	private Short type;

	/**
	 * 创建时间
	 */
	private Date createTime;

	/**
	 * 日志内容
	 */
	private String content;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		if ( this.id == null && id != null && this.hashCode != null ) {
            SAVED_HASHES.put( id, this.hashCode );
        }
		this.id = id;
	}

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public Short getType() {
		return type;
	}

	public void setType(Short type) {
		this.type = type;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
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
		if (!(other instanceof Log)) {
			return false;
		}

		final Log that = (Log) other;
		boolean result = true;
		result = result
				&& (((this.getId() == null) && (that.getId() == null)) || (this
						.getId() != null && this.getId().equals(that.getId())));
		return result;
	}

}
