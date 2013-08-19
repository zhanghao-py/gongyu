package cm.h3c.college.pay.cmpay.service;

import cm.h3c.college.pay.cmpay.CmpayPaymentFileNotifyRequest;
import cm.h3c.college.pay.core.exception.ServiceException;

public interface CmpayBillingService {

	void doLogCmpayBilling(CmpayPaymentFileNotifyRequest notify) throws ServiceException;
}
