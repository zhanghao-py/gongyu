package cm.h3c.college.pay.payment.web.action;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

import cm.h3c.college.pay.core.cons.AjaxStatus;
import cm.h3c.college.pay.core.exception.ServiceException;
import cm.h3c.college.pay.core.web.action.GenericAction;
import cm.h3c.college.pay.core.web.action.dto.AbstractGenericModel;
import cm.h3c.college.pay.payment.service.OrderService;
import cm.h3c.college.pay.payment.web.action.dto.OrderForm;

@Namespace("/payment")
public class PayOrderAction extends GenericAction {

	private Logger log = Logger.getLogger(PayOrderAction.class);
	
	private static final long serialVersionUID = 1466992674739867020L;

	private OrderForm form = new OrderForm();
	
	@Resource(name = "orderService")
	private OrderService orderService;
	
	@Action(value = "payOrder", results = { @Result(name = "success", type = "json", params = { "excludeNullProperties", "true", "root", "result" }) })
	public String payOrderAjax() {
		
		try {
			orderService.doPayOrder(form.getId());
		} catch (ServiceException e) {
			log.warn(e);
			result.setStatus(AjaxStatus.ERROR.getValue());
			result.setStatusInfo(e.getMessage());
			return SUCCESS;
		}
		
		result.setStatus(AjaxStatus.SUCCESS.getValue());
		return SUCCESS;
	}
	
	@Override
	public AbstractGenericModel getModel() {
		return form;
	}
}
