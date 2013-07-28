package cm.h3c.college.pay.payment.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cm.h3c.college.pay.core.exception.ServiceException;
import cm.h3c.college.pay.payment.bo.College;
import cm.h3c.college.pay.payment.dao.CollegeDao;
import cm.h3c.college.pay.payment.service.CollegeServcie;
import cm.h3c.college.pay.payment.web.action.dto.CollegeForm;

@Service("collegeService")
public class CollegeServiceImpl implements CollegeServcie {

	@Resource(name = "collegeDao")
	private CollegeDao collegeDao;
	
	@Override
	public College findCollege(CollegeForm form) throws ServiceException {
		
		if (form == null) {
			throw new ServiceException("表单不能为空！");
		}
		
		if (form.getId() == null || form.getId() < 1) {
			throw new ServiceException("id不能为空！");
		}
		
		return collegeDao.findById(form.getId());
	}

	@Override
	public List<College> findAll() {
		return collegeDao.findAll();
	}

}
