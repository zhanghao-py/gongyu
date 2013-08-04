package cm.h3c.college.pay.payment.service;

import javax.annotation.Resource;

import org.junit.Test;

import cm.h3c.college.pay.core.exception.ServiceException;
import cm.h3c.college.pay.payment.cons.LogType;
import cm.h3c.college.pay.test.core.BaseIntegrationTest;

public class LogServiceIntegrationTest extends BaseIntegrationTest {

	@Resource(name = "logService")
	private LogService logService;
	
	@Test
	public void itShouldDoLog() throws ServiceException {
		logService.doLog(LogType.LOCAL_LOG, "it test log.");
	}
	
	@Test
	public void itShouldDoLog4Order() throws ServiceException {
		logService.doLog(LogType.LOCAL_LOG, 10L,"it test log.");
	}
}
