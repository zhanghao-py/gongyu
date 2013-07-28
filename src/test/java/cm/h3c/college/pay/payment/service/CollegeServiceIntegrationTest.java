package cm.h3c.college.pay.payment.service;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Test;

import cm.h3c.college.pay.core.exception.ServiceException;
import cm.h3c.college.pay.payment.bo.College;
import cm.h3c.college.pay.payment.web.action.dto.CollegeForm;
import cm.h3c.college.pay.test.core.BaseIntegrationTest;

public class CollegeServiceIntegrationTest extends BaseIntegrationTest {

	private Logger log = Logger.getLogger(CollegeServiceIntegrationTest.class);
	
	@Resource(name = "collegeService")
	private CollegeServcie collegeService;
	
	@Test
	public void itShouldCallFindCollege() throws ServiceException {
		
		// [Given]
		CollegeForm form = new CollegeForm();
		form.setId(1L);
		
		// [When]
		College college = collegeService.findCollege(form);
		
		// [Then]
		log.info("college name is " + college.getName());
		
	}
	
	@Test
	public void itShouldCallFindAll() {
		
		// [Given]
		
		// [When]
		List<College> colleges = collegeService.findAll();
		
		// [Then]
		log.info("size is " + colleges.size());
	}
}
