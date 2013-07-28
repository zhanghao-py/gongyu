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
import cm.h3c.college.pay.core.util.SecurityCodeCompareUtil;
import cm.h3c.college.pay.core.web.action.GenericAction;
import cm.h3c.college.pay.core.web.action.dto.AbstractGenericModel;
import cm.h3c.college.pay.payment.service.OrderService;
import cm.h3c.college.pay.payment.web.action.dto.OrderForm;

@Namespace("/payment")
public class CreateOrderAction extends GenericAction {

	private Logger log = Logger.getLogger(CreateOrderAction.class);
	private static final long serialVersionUID = -1541026036542059117L;
	
	private String securityCode;
	private OrderForm form = new OrderForm();
	
	@Resource(name = "orderService")
	private OrderService orderService;
	
	@Action(value = "createOrder", results = { @Result(name = "success", type = "json", params = { "excludeNullProperties", "true", "root", "result" }) })
	public String createOrderAjax() {
		
		Long id = null;
		
		try {
			id = orderService.doCreateOrder(form);
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
	
	@Action(value = "checkOrderForm", results = { @Result(name = "success", type = "json", params = { "excludeNullProperties", "true", "root", "result" }) })
	public String checkOrderFormAjax() {
		
		if (!SecurityCodeCompareUtil.compare(securityCode)) {
			result.setStatus(AjaxStatus.ERROR.getValue());
			result.setStatusInfo("验证码输入不正确！");
			return SUCCESS;
		}
		
		try {
			orderService.checkOrderForm(form);
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

	public void setSecurityCode(String securityCode) {
		this.securityCode = securityCode;
	}
	

}
