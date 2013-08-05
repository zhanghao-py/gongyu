package cm.h3c.college.pay.cmpay;

import org.apache.commons.lang3.StringUtils;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("MESSAGE")
public class CmpayPaymentCallbackRequest implements CmpaySignable {
	String MCODE;// 功能码 101440 M
	String MID;// 系统跟踪号 14 位 M
	String DATE;// 交易日期 YYYYMMDD M
	String TIME;// 交易时间 HHMMSS M
	String PAYDAY;// 账务日期 YYYYMMDD M
	String MERID;// 商户编号 15位 M
	String ORDERDATE;// 订单日期 YYYYMMDD 8位 M
	String ORDERID;// 订单号 20位 M
	// 状态 PADSUCCESS：预授权成功PADFAILED：预授权失败REFUSE：用户拒付SUCCESS：成功FAILED：失败  M
	String STATUS;
	String REMARK;// 备注 最长60位 O
	String FROZENNO;// 冻结编号 6为 M
	String SIGN;// 签名 172位 M

	@Override
	public String prepareSignData() {
		StringBuilder ret = new StringBuilder();
		ret.append("MCODE=").append(StringUtils.stripToEmpty(MCODE));
		ret.append("&MID=").append(StringUtils.stripToEmpty(MID));
		ret.append("&DATE=").append(StringUtils.stripToEmpty(DATE));
		ret.append("&TIME=").append(StringUtils.stripToEmpty(TIME));
		ret.append("&PAYDAY=").append(StringUtils.stripToEmpty(PAYDAY));
		ret.append("&MERID=").append(StringUtils.stripToEmpty(MERID));
		ret.append("&ORDERDATE=").append(StringUtils.stripToEmpty(ORDERDATE));
		ret.append("&ORDERID=").append(StringUtils.stripToEmpty(ORDERID));
		ret.append("&STATUS=").append(StringUtils.stripToEmpty(STATUS));
		ret.append("&REMARK=").append(StringUtils.stripToEmpty(REMARK));
		ret.append("&FROZENNO=").append(StringUtils.stripToEmpty(FROZENNO));
		return ret.toString();
	}

	public String getMcode() {
		return MCODE;
	}

	public void setMcode(String mcode) {
		MCODE = mcode;
	}

	public String getPayDay() {
		return PAYDAY;
	}

	public void setPayDay(String payday) {
		PAYDAY = payday;
	}

	public String getFrozenno() {
		return FROZENNO;
	}

	public void setFrozenno(String frozenno) {
		FROZENNO = frozenno;
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

	public String getDate() {
		return DATE;
	}

	public void setDate(String date) {
		DATE = date;
	}

	public String getTime() {
		return TIME;
	}

	public void setTime(String time) {
		TIME = time;
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

}
