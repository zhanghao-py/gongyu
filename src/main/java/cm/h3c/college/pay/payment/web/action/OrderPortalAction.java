package cm.h3c.college.pay.payment.web.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.lang.ObjectUtils;
import org.apache.log4j.Logger;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

import cm.h3c.college.pay.cmpay.CmpayPaymentCheckResponse;
import cm.h3c.college.pay.core.config.SystemConfig;
import cm.h3c.college.pay.core.exception.ServiceException;
import cm.h3c.college.pay.core.web.action.GenericAction;
import cm.h3c.college.pay.payment.bo.College;
import cm.h3c.college.pay.payment.bo.Order;
import cm.h3c.college.pay.payment.cons.OrderStatus;
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
			log.warn("", e);
		}

		Map<String, Object> data = new HashMap<String, Object>();
		data.put("colleges", colleges);

		this.data = data;
		return SUCCESS;
	}

	@Action(value = "createAndPayOrderPortal", results = {
			@Result(name = "success", type = "velocity", location = "/vm/payment_createAndPayOrder_portal.vm"),
			@Result(name = "error", type = "velocity", location = "/vm/error.vm") })
	public String createAndPayOrderPortal() {
		Map<String, Object> session = ActionContext.getContext().getSession();
		OrderForm form = (OrderForm) session.get(SystemConfig.ORDER_FORM_KEY);

		if (ObjectUtils.equals(form, null)) {
			return ERROR;
		}

		this.data = form;
		return SUCCESS;
	}

	@Action(value = "doneOrderPortal", results = {
			@Result(name = "success", type = "velocity", location = "/vm/payment_doneOrder_portal.vm"),
			@Result(name = "error", type = "velocity", location = "/vm/error.vm") })
	public String doneOrderPortal() {
		Map<String, Object> session = ActionContext.getContext().getSession();
		OrderForm form = (OrderForm) session.get(SystemConfig.ORDER_FORM_KEY);
		Long orderId = null;
		if (form != null) {
			orderId = form.getId();// TODO 连续两次支付的问题
		} else {
			String strOrderId = ServletActionContext.getRequest().getParameter(
					"orderId");
			if (strOrderId == null) {
				return ERROR;
			}
			orderId = Long.parseLong(strOrderId);
		}

		Map<String, Object> data = new HashMap<String, Object>();
		try {
			Order order = orderService.findOrderById(orderId);
			data.put("order", order);

			if (order.getStatus().equals(OrderStatus.PAYING.getValue())) {
				CmpayPaymentCheckResponse response = orderService
						.checkPayment(order.getId());
				data.put("response", response);
			}
		} catch (ServiceException e) {
			// TODO 停留在当前页，或者给出可在此查询的入口
			log.warn("", e);
			this.data = e.getMessage();
			return ERROR;
		}

		this.data = data;
		return SUCCESS;
	}

	public Object getData() {
		return data;
	}

}
