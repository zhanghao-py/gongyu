package cm.h3c.college.pay.cams.service;

import javax.annotation.Resource;

import org.junit.Test;

import cm.h3c.college.pay.core.exception.ServiceException;
import cm.h3c.college.pay.test.core.BaseIntegrationTest;

public class CamsServiceIntegrationTest extends BaseIntegrationTest {

	@Resource(name = "camsService")
	private CamsService camsService;
	
	@Test
	public void itShouldRecharge2CAMS() throws ServiceException {
		
		// [Given]
		Long orderId = 2L;
		
		// [When]
		camsService.doRecharge2Cams(orderId);
	}
}
