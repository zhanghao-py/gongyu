package cm.h3c.college.pay.payment.service;

import java.util.List;

import cm.h3c.college.pay.core.exception.ServiceException;
import cm.h3c.college.pay.payment.bo.College;
import cm.h3c.college.pay.payment.web.action.dto.CollegeForm;

public interface CollegeServcie {

	public College findCollege(CollegeForm form) throws ServiceException;
	
	public List<College> findAll();
}
