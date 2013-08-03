package cm.h3c.college.pay.payment.web.action;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

import cm.h3c.college.pay.core.cons.AjaxStatus;
import cm.h3c.college.pay.core.exception.ServiceException;
import cm.h3c.college.pay.core.web.action.GenericAction;
import cm.h3c.college.pay.payment.service.OrderService;
import cm.h3c.college.pay.payment.web.action.dto.OrderForm;

import com.opensymphony.xwork2.ActionContext;

@Namespace("/payment")
public class CreateAndPayOrderAction extends GenericAction {

	private Logger log = Logger.getLogger(CreateAndPayOrderAction.class);
	private static final long serialVersionUID = -1541026036542059117L;
	
	@Resource(name = "orderService")
	private OrderService orderService;
	
	@Action(value = "createAndPayOrder", results = { @Result(name = "success", type = "json", params = { "excludeNullProperties", "true", "root", "result" }) })
	public String createAndPayOrderAjax() {
		
		Map<String, Object> session = ActionContext.getContext().getSession();
		OrderForm form = (OrderForm) session.get("orderForm");
		
		Long id = null;
		
		try {
			id = orderService.doCreateOrder(form);
			orderService.doPayOrder(id);
		} catch (ServiceException e) {
			log.warn(e);
			result.setStatus(AjaxStatus.ERROR.getValue());
			result.setStatusInfo(e.getMessage());
			return SUCCESS;
		}
		
		Map<String, Object> data = new HashMap<String, Object>();
		data.put("id", id);
		
		result.setData(data);
		result.setStatus(AjaxStatus.SUCCESS.getValue());
		return SUCCESS;
	}
	

}