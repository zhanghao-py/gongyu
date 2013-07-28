package cm.h3c.college.pay.payment.service;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Test;

import cm.h3c.college.pay.core.exception.ServiceException;
import cm.h3c.college.pay.payment.bo.College;
import cm.h3c.college.pay.test.core.BaseIntegrationTest;

public class CollegeServiceIntegrationTest extends BaseIntegrationTest {

	private Logger log = Logger.getLogger(CollegeServiceIntegrationTest.class);
	
	@Resource(name = "collegeService")
	private CollegeServcie collegeService;
	
	@Test
	public void itShouldCallFindCollege() throws ServiceException {
		
		// [Given]
		Long collegeId = 1L;
		
		// [When]
		College college = collegeService.findCollegeById(collegeId);
		
		// [Then]
		log.info("college name is " + college.getName());
		
	}
	
	@Test
	public void itShouldCallFindAll() throws ServiceException {
		
		// [Given]
		
		// [When]
		List<College> colleges = collegeService.findAll();
		
		// [Then]
		log.info("size is " + colleges.size());
	}
}
