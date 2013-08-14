package cm.h3c.college.pay.payment.web.action;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

import cm.h3c.college.pay.cmpay.CmpayPaymentRequest;
import cm.h3c.college.pay.core.config.SystemConfig;
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

	// 模版渲染参数
	private Object data;

	@Action(value = "createAndPayOrder", results = {
			@Result(name = "success", type = "velocity", location = "/vm/payment_payRequest.vm"),
			@Result(name = "error", type = "velocity", location = "/vm/errorMessage.vm") })
	public String createAndPayOrder() {
		Map<String, Object> session = ActionContext.getContext().getSession();
		OrderForm form = (OrderForm) session.get(SystemConfig.ORDER_FORM_KEY);

		CmpayPaymentRequest payment = null;
		try {
			assertNotNull(form, SystemConfig.ILLEGAL_REQUEST);
			payment = orderService.doCreateAndPayOrder(form);
		} catch (ServiceException e) {
			log.warn("", e);
			this.data = e.getMessage();
			return ERROR;
		}

		Map<String, Object> data = new HashMap<String, Object>();
		data.put("payment", payment);
		data.put("cmpayUrl", orderService.getCmpayUrl(payment.getMerId()));

		this.data = data;

		return SUCCESS;
	}

	public Object getData() {
		return data;
	}

}
