package cm.h3c.college.pay.cmpay.dao;

import cm.h3c.college.pay.cmpay.bo.CmpayBillingDetail;
import cm.h3c.college.pay.cmpay.bo.CmpayBillingHeader;

public interface CmpayBillingDao {

	int saveCmpayBillingHeader(CmpayBillingHeader header);
	int saveCmpayBillingDetail(CmpayBillingDetail detail);
}
