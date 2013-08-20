package cm.h3c.college.pay.cmpay.web.action.dto;

import java.io.IOException;
import java.util.List;

import org.apache.log4j.Logger;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import cm.h3c.college.pay.cmpay.bo.CmpayBillingDetail;
import cm.h3c.college.pay.cmpay.bo.CmpayBillingHeader;

public class CmpayBilling {
	
	private static Logger log = Logger.getLogger(CmpayBilling.class);
	
	private CmpayBillingHeader header;
	private List<CmpayBillingDetail> details;
	
	public CmpayBilling(CmpayBillingHeader header, List<CmpayBillingDetail> details) {
		this.header = header;
		this.details = details;
	}
	
	public CmpayBillingHeader getHeader() {
		return header;
	}

	public List<CmpayBillingDetail> getDetails() {
		return details;
	}

	@Override
	public String toString() {
		ObjectMapper mapper = new ObjectMapper();
		String jsonString = "";
		try {
			jsonString = mapper.writeValueAsString(this);
		} catch (JsonGenerationException e) {
			log.warn("", e);
		} catch (JsonMappingException e) {
			log.warn("", e);
		} catch (IOException e) {
			log.warn("", e);
		}
		
		return jsonString;
	}
	
	
}

/*
class Detail {
	
	private static Logger log = Logger.getLogger(Detail.class);
	
	@JsonProperty
	String MERID;// 商户编号 15位
	@JsonProperty
	String PRODUCTID;// 产品编号 最长30位
	@JsonProperty
	String ORDERID;// 商户订单号 20位
	@JsonProperty
	String ORDERDATE;// 订单日期 8位
	@JsonProperty
	String PAYDATE;// 支付日期 8位
	@JsonProperty
	String AMOUNT;// 金额 15位 分为单位
	@JsonProperty
	String TYPE;// 付款类型 1位
	@JsonProperty
	String STATUS;// 订单状态 1位
	
	public Detail(String line) {
		this.MERID = StringUtils.substring(line, 0, 15);
		this.PRODUCTID = StringUtils.substring(line, 15, 45);
		this.ORDERID = StringUtils.substring(line, 45, 65);
		this.ORDERDATE = StringUtils.substring(line, 65, 73);
		this.PAYDATE = StringUtils.substring(line, 73, 81);
		this.AMOUNT = StringUtils.substring(line, 81, 96);
		this.TYPE = StringUtils.substring(line, 96, 97);
		this.STATUS = StringUtils.substring(line, 97, 98);
	}

	@Override
	public String toString() {
		ObjectMapper mapper = new ObjectMapper();
		String jsonString = "";
		try {
			jsonString = mapper.writeValueAsString(this);
		} catch (JsonGenerationException e) {
			log.warn("", e);
		} catch (JsonMappingException e) {
			log.warn("", e);
		} catch (IOException e) {
			log.warn("", e);
		}
		
		return jsonString;
	}
	
}

class Header {
	
	private static Logger log = Logger.getLogger(Header.class);
	
	@JsonProperty
	String MERID; // 商户ID 15位
	@JsonProperty
	String PROVID; // 省平台编号 8位
	@JsonProperty
	String DEALTIMES; // 交易笔数 8位
	@JsonProperty
	String DEALAMOUNT; // 交易总金额 15位 分为单位
	@JsonProperty
	String DATE; // 账务日期 YYYYMMDD
	
	public Header(String filename, String headLine) {
		this.MERID = StringUtils.substring(filename, 9, 24);
		this.DATE = StringUtils.substring(filename, 34, 42);
		this.PROVID = StringUtils.substring(headLine, 0, 8);
		this.DEALTIMES = StringUtils.substring(headLine, 8, 16);
		this.DEALAMOUNT = StringUtils.substring(headLine, 16, 31);
	}
	
	@Override
	public String toString() {
		ObjectMapper mapper = new ObjectMapper();
		String jsonString = "";
		try {
			jsonString = mapper.writeValueAsString(this);
		} catch (JsonGenerationException e) {
			log.warn("", e);
		} catch (JsonMappingException e) {
			log.warn("", e);
		} catch (IOException e) {
			log.warn("", e);
		}
		
		return jsonString;
	}
}
*/