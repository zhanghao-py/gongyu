package cm.h3c.college.pay.payment.web.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

import cm.h3c.college.pay.core.exception.ServiceException;
import cm.h3c.college.pay.core.web.action.GenericAction;
import cm.h3c.college.pay.payment.bo.College;
import cm.h3c.college.pay.payment.service.CollegeServcie;
import cm.h3c.college.pay.payment.service.OrderService;
import cm.h3c.college.pay.payment.web.action.dto.OrderForm;

import com.opensymphony.xwork2.ActionContext;

@Namespace("/payment")
public class OrderPortalAction extends GenericAction {

	private Logger log = Logger.getLogger(OrderPortalAction.class);
	
	private static final long serialVersionUID = -5719028343640493412L;

	@Resource(name = "collegeService")
	private CollegeServcie collegeService;
	
	@Resource(name = "orderService")
	private OrderService orderService;

	// 模版渲染参数
	private Object data;
	
	@Action(value = "portal", results = { @Result(name = "success", type = "velocity", location = "/vm/payment_portal.vm") })
	public String portal() {
		List<College> colleges = null;
		
		try {
			colleges = collegeService.findAll();
		} catch (ServiceException e) {
			log.warn(e);
		}
		
		Map<String, Object> data = new HashMap<String, Object>();
		data.put("colleges", colleges);
		
		this.data = data;
		return SUCCESS;
	}
	
	@Action(value = "createAndPayOrderPortal", results = { @Result(name = "success", type = "velocity", location = "/vm/payment_createAndPayOrder_portal.vm") })
	public String createAndPayOrderPortal() {
		Map<String, Object> session = ActionContext.getContext().getSession();
		OrderForm form = (OrderForm) session.get("orderForm");
		this.data = form;
		return SUCCESS;
	}

	public Object getData() {
		return data;
	}

	
	
}