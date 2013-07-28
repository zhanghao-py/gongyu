package cm.h3c.college.pay.payment.service;

import java.util.List;

import cm.h3c.college.pay.core.exception.ServiceException;
import cm.h3c.college.pay.payment.bo.College;

public interface CollegeServcie {

	public College findCollegeById(Long id) throws ServiceException;
	
	public List<College> findAll() throws ServiceException;
}
