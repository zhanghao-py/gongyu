package cm.h3c.college.pay.cmpay;

import org.apache.commons.lang3.StringUtils;

public class CmpayPaymentCheckRequest implements CmpaySignable {
	String MCODE = "101455";// 功能码 101455 M
	String MID;// 系统跟踪号 14位 M
	String DATE;// 交易日期 YYYYMMDD M
	String TIME;// 交易时间 HHMMSS M
	String MERID;// 商户编号 15位 M
	String ORDERID;// 订单号 20位 M
	String SIGN;// 签名 172位 M

	@Override
	public String prepareSignData() {
		StringBuilder ret = new StringBuilder();
		ret.append("MCODE=").append(StringUtils.stripToEmpty(MCODE));
		ret.append("&MID=").append(StringUtils.stripToEmpty(MID));
		ret.append("&DATE=").append(StringUtils.stripToEmpty(DATE));
		ret.append("&TIME=").append(StringUtils.stripToEmpty(TIME));
		ret.append("&MERID=").append(StringUtils.stripToEmpty(MERID));
		ret.append("&ORDERID=").append(StringUtils.stripToEmpty(ORDERID));
		return ret.toString();
	}

	@Override
	public String getSign() {
		return SIGN;
	}

	@Override
	public void setSign(String sign) {
		this.SIGN = sign;
	}
	
	public String getMerId() {
		return MERID;
	}

	public void setMerId(String merid) {
		MERID = merid;
	}
}
