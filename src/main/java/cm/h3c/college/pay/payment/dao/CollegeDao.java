package cm.h3c.college.pay.payment.dao;

import java.util.List;

import cm.h3c.college.pay.payment.bo.College;

public interface CollegeDao {

	public List<College> findAll();
	
	public College findById(Long id);
}
