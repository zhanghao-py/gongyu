package cm.h3c.college.pay.cams.service;

import cm.h3c.college.pay.core.exception.ServiceException;

public interface CamsService {

	public void doRecharge2Cams(Long orderId) throws ServiceException;
}
