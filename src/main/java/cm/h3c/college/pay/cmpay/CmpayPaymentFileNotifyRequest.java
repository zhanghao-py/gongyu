package cm.h3c.college.pay.cmpay;

import org.apache.commons.lang3.StringUtils;

public class CmpayPaymentFileNotifyRequest implements CmpaySignable {
	String MCODE;// 功能码 101610 M
	String MID;// 系统跟踪号 14位 M
	String DATE;// 交易日期 YYYYMMDD M
	String TIME;// 交易时间 HHMMSS M
	String PAYDAY;// 账务日期 YYYYMMDD M
	String MERID;// 商户编号 15位 M
	String FILETYP;// 文件类型 BLOTRET 彩票文件BNPPRET 个人三方协议文件MERTXND 商户交易明细BCHGRET
					// 批量充值结果文件 M
	String FILENAME;// 文件名
					// 商户交易明细文件名称：TRAN_MER_ZZZZZZZZZZZZZZZ_XXXXXXXX_YYYYMMDD.dat
					// ZZZZZZZZZZZZZZZ：15位中心商户编号 XXXXXXXX: 8位省平台编号；

	String REMARK;// 备注 O
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
		ret.append("&FILETYP=").append(StringUtils.stripToEmpty(FILETYP));
		ret.append("&FILENAME=").append(StringUtils.stripToEmpty(FILENAME));
		ret.append("&REMARK=").append(StringUtils.stripToEmpty(REMARK));
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

	public String getFilename() {
		return FILENAME;
	}
	
	
}
