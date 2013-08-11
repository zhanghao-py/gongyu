package cm.h3c.college.pay.cmpay;

import org.apache.commons.lang3.StringUtils;

public class CmpayPaymentCallbackWebRequest implements CmpaySignable, CmpayPaymentCallbackable {
	String MERID;// 商户编号 15位 M
	String MID;// 系统跟踪号 14位 M
	String OMID;// 交易流水号 暂无意义 M
	String TXNTYP;// 业务类型 直接支付：DODIRECTPAYMENTB2C担保交易：B2C-DOGUARANTEE
	// C2C担保交易：C2C-DOGUARANTEE 预授权：DOAHTORIZATION
	// 预授权确认：DOCAPTURE 预授权取消：DOVOID 订单查询：ORDERSEARCH 退款：
	// ORDERREFUND M
	String AMOUT;// 支付金额 单位分 M
	String ORDERID;// 原商户订单号 M
	String ORDERDATE;// 订单日期 M
	String PAYDATE;// 财务时间 M
	String REMARK;// 备注 O
	String STATUS;// 支付结果
	// PADSUCCESS：预授权成功PADFAILED：预授权失败REFUSE：用户拒付SUCCESS：成功FAILED：失败
	// M
	String SIGN;// 签名 172位 M

	@Override
	public String prepareSignData() {
		StringBuilder ret = new StringBuilder();
		ret.append("MERID=").append(StringUtils.stripToEmpty(MERID));
		ret.append("&MID=").append(StringUtils.stripToEmpty(MID));
		ret.append("&OMID=").append(StringUtils.stripToEmpty(OMID));
		ret.append("&TXNTYP=").append(StringUtils.stripToEmpty(TXNTYP));
		ret.append("&AMOUT=").append(StringUtils.stripToEmpty(AMOUT));
		ret.append("&ORDERID=").append(StringUtils.stripToEmpty(ORDERID));
		ret.append("&ORDERDATE=").append(StringUtils.stripToEmpty(ORDERDATE));
		ret.append("&PAYDATE=").append(StringUtils.stripToEmpty(PAYDATE));
		ret.append("&REMARK=").append(StringUtils.stripToEmpty(REMARK));
		ret.append("&STATUS=").append(StringUtils.stripToEmpty(STATUS));
		return ret.toString();
	}

	public String getPayDate() {
		return PAYDATE;
	}

	public void setPayDate(String payDate) {
		PAYDATE = payDate;
	}

	public String getOmid() {
		return OMID;
	}

	public void setOmid(String omid) {
		OMID = omid;
	}

	public String getTxntyp() {
		return TXNTYP;
	}

	public void setTxntyp(String txntyp) {
		TXNTYP = txntyp;
	}

	public String getAmout() {
		return AMOUT;
	}

	public void setAmout(String amout) {
		AMOUT = amout;
	}

	@Override
	public String getSign() {
		return SIGN;
	}

	@Override
	public void setSign(String sign) {
		this.SIGN = sign;
	}

	public void setStatus(String status) {
		this.STATUS = status;
	}

	@Override
	public String getStatus() {
		return STATUS;
	}

	public String getRemark() {
		return REMARK;
	}

	public void setRemark(String remark) {
		REMARK = remark;
	}

	public String getMid() {
		return MID;
	}

	public void setMid(String mid) {
		MID = mid;
	}

	public String getMerid() {
		return MERID;
	}

	public void setMerid(String merid) {
		MERID = merid;
	}

	public String getOrderId() {
		return ORDERID;
	}

	public void setOrderId(String orderid) {
		ORDERID = orderid;
	}

	public String getOrderDate() {
		return ORDERDATE;
	}

	public void setOrderDate(String orderdate) {
		ORDERDATE = orderdate;
	}

	@Override
	public Long parseOriginOrderId() {
		return Long.parseLong(getOrderId());
	}
}
