package cm.h3c.college.pay.core.web.action;

import cm.h3c.college.pay.core.exception.ServiceException;
import cm.h3c.college.pay.core.web.action.dto.AbstractGenericModel;
import cm.h3c.college.pay.core.web.action.dto.AjaxResult;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class GenericAction extends ActionSupport implements ModelDriven<AbstractGenericModel> {

	private static final long serialVersionUID = 4417165019227377914L;

	protected AjaxResult result = new AjaxResult();
	protected AbstractGenericModel model;

	@Override
	public AbstractGenericModel getModel() {
		return model;
	}
	
	public AjaxResult getResult() {
		return result;
	}

	protected void assertNotNull(Object obj, String message) throws ServiceException {
		if(obj == null) {
			throw new ServiceException(message);
		}
	}
}
