package cm.h3c.college.pay.payment.web.action;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.lang.ObjectUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.math.NumberUtils;
import org.apache.log4j.Logger;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

import cm.h3c.college.pay.cmpay.CmpayPaymentRequest;
import cm.h3c.college.pay.core.cons.AjaxStatus;
import cm.h3c.college.pay.core.exception.ServiceException;
import cm.h3c.college.pay.core.web.action.GenericAction;
import cm.h3c.college.pay.payment.service.OrderService;

@Namespace("/payment")
public class PayOrderAction extends GenericAction {

	private Logger log = Logger.getLogger(PayOrderAction.class);
	private static final long serialVersionUID = -1541026036542059117L;
	
	@Resource(name = "orderService")
	private OrderService orderService;
	
	// 页面输入参数
	private String orderId;
	
	// 模版渲染参数
	private Object data;
		
	@Action(value = "payOrder", results = { @Result(name = "success", type = "velocity", location = "/vm/payment_payRequest.vm") })
	public String payOrder() {
		
		if (StringUtils.isBlank(orderId) || !NumberUtils.isNumber(orderId)) {
			result.setStatus(AjaxStatus.ERROR.getValue());
			result.setStatusInfo("orderId不存在！");
			return SUCCESS;
		}
		
		CmpayPaymentRequest payment = null;
		
		try {
			payment = orderService.doPayOrder(NumberUtils.createLong(orderId));
		} catch (ServiceException e) {
			log.warn("", e);
			result.setStatus(AjaxStatus.ERROR.getValue());
			result.setStatusInfo(e.getMessage());
			return SUCCESS;
		}
		
		Map<String, Object> data = new HashMap<String, Object>();
		data.put("payment", payment);
		
		this.data = data;
		
		return SUCCESS;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public Object getData() {
		return data;
	}
	

}
