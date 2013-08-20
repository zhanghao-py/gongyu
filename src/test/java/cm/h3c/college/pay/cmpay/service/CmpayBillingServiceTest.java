package cm.h3c.college.pay.cmpay.service;

import javax.annotation.Resource;

import org.junit.Test;
import org.springframework.test.util.ReflectionTestUtils;

import cm.h3c.college.pay.cmpay.CmpayPaymentFileNotifyRequest;
import cm.h3c.college.pay.core.exception.ServiceException;
import cm.h3c.college.pay.test.core.BaseIntegrationTest;

public class CmpayBillingServiceTest extends BaseIntegrationTest {

	@Resource(name = "cmpayBillingService")
	private CmpayBillingService cmpayBillingService;
	
	@Test
	public void itShouldLogCmpayBilling() throws ServiceException {
		// [Given]
		String filename = "TRAN_MER_888000130000008_01210100_20111017.dat";
		CmpayPaymentFileNotifyRequest notify = new CmpayPaymentFileNotifyRequest();
		ReflectionTestUtils.setField(notify, "FILENAME", filename);
		
		// [When]
		cmpayBillingService.doLogCmpayBilling(notify);
	}
}
