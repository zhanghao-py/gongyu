package cm.h3c.college.pay.payment.web.action;

import javax.annotation.Resource;

import org.apache.commons.lang.math.NumberUtils;
import org.apache.log4j.Logger;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

import cm.h3c.college.pay.core.cons.AjaxStatus;
import cm.h3c.college.pay.core.exception.ServiceException;
import cm.h3c.college.pay.core.web.action.GenericAction;
import cm.h3c.college.pay.payment.bo.Order;
import cm.h3c.college.pay.payment.service.OrderService;

public class SearchOrderAction extends GenericAction {

	private Logger log = Logger.getLogger(SearchOrderAction.class);
	
	private static final long serialVersionUID = 5831720082127836752L;

	private String orderId;
	
	@Resource(name = "orderService")
	private OrderService orderService;
	
	@Action(value = "searchOrder", results = { @Result(name = "success", type = "json", params = { "excludeNullProperties", "true", "root", "result" }) })
	public String searchOrder() {
		Long id = NumberUtils.createLong(orderId);
		
		Order data = null;
		try {
			data = orderService.findOrderById(id);
		} catch (ServiceException e) {
			log.warn("", e);
			result.setStatus(AjaxStatus.ERROR.getValue());
			result.setStatusInfo(e.getMessage());
			return SUCCESS;
		}
		
		result.setData(data);
		result.setStatus(AjaxStatus.SUCCESS.getValue());
		return SUCCESS;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	
	
}
