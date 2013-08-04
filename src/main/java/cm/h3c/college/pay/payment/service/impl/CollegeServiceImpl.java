package cm.h3c.college.pay.payment.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import cm.h3c.college.pay.core.exception.ServiceException;
import cm.h3c.college.pay.payment.bo.College;
import cm.h3c.college.pay.payment.dao.CollegeDao;
import cm.h3c.college.pay.payment.service.CollegeServcie;

@Component("collegeService")
public class CollegeServiceImpl implements CollegeServcie {

	@Resource(name = "collegeDao")
	private CollegeDao collegeDao;
	
	@Override
	public College findCollegeById(Long id) throws ServiceException {
		
		if (id == null || id < 1) {
			throw new ServiceException("id不能为空！");
		}
		
		College college = collegeDao.findById(id);
		
		if (college == null) {
			throw new ServiceException("collegeId = " + id + "不存在");
		}
		
		return college;
	}

	@Override
	public List<College> findAll() throws ServiceException {
		
		List<College> colleges = collegeDao.findAll();
		
		if (colleges == null || colleges.size() == 0) {
			throw new ServiceException("当前没有college信息.");
		}
		
		return colleges;
	}

}
