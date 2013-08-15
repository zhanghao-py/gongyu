package cm.h3c.college.pay.cmpay;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.junit.Test;

public class CmpayNotifyFileUtils {
	
	private static Logger log = Logger.getLogger(CmpayNotifyFileUtils.class);

	@Test
	public void test() {
		
		List<CmpayBillingDetail> billingDetails = new LinkedList<CmpayBillingDetail>();
		
		
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader(new File("C:/Users/ZhangHao/Desktop/TRAN_MER_888000130000008_01210100_20111017.dat"));
			br = new BufferedReader(fr);
			
			String headLine = br.readLine();
			CmpayBillingHeader header = new CmpayBillingHeader(headLine);
			log.info(header);
			
			String line = "";
			while( (line = br.readLine())!=null ) {
				CmpayBillingDetail detail = new CmpayBillingDetail(line);
				log.info(detail);
				billingDetails.add(detail);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			IOUtils.closeQuietly(br);
			IOUtils.closeQuietly(fr);
		}
		
	}
}

class CmpayBillingHeader {
	String PROVID; // 省平台编号 8位
	String DEALTIMES; // 交易笔数 8位
	String DEALAMOUNT; // 交易总金额 15位 分为单位
	
	public CmpayBillingHeader(String line) {
		this.PROVID = StringUtils.substring(line, 0, 8);
		this.DEALTIMES = StringUtils.substring(line, 8, 16);
		this.DEALAMOUNT = StringUtils.substring(line, 16, 31);
	}
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append(" PROVID:");
		sb.append(this.PROVID);
		sb.append(" DEALTIMES:");
		sb.append(this.DEALTIMES);
		sb.append(" DEALAMOUNT:");
		sb.append(this.DEALAMOUNT);
		return sb.toString();
	}
}

class CmpayBillingDetail {
	String MERID;// 商户编号 15位
	String PRODUCTID;// 产品编号 最长30位
	String ORDERID;// 商户订单号 20位
	String ORDERDATE;// 订单日期 8位
	String PAYDATE;// 支付日期 8位
	String AMOUNT;// 金额 15位 分为单位
	String TYPE;// 付款类型 1位
	String STATUS;// 订单状态 1位
	
	public CmpayBillingDetail(String line) {
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
		StringBuffer sb = new StringBuffer();
		sb.append(" MERID:");
		sb.append(this.MERID);
		sb.append(" PRODUCTID:");
		sb.append(this.PRODUCTID);
		sb.append(" ORDERID:");
		sb.append(this.ORDERID);
		sb.append(" ORDERDATE:");
		sb.append(this.ORDERDATE);
		sb.append(" PAYDATE:");
		sb.append(this.PAYDATE);
		sb.append(" AMOUNT:");
		sb.append(this.AMOUNT);
		sb.append(" TYPE:");
		sb.append(this.TYPE);
		sb.append(" STATUS:");
		sb.append(this.STATUS);
		return sb.toString();
	}
	
}
