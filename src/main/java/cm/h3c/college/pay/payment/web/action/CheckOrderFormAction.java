package cm.h3c.college.pay.payment.web.action;

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

import com.opensymphony.xwork2.ActionContext;

@Namespace("/payment")
public class CheckOrderFormAction extends GenericAction {

	private static final long serialVersionUID = -3920702417617589420L;
	
	private Logger log = Logger.getLogger(CheckOrderFormAction.class);
	
	@Resource(name = "orderService")
	private OrderService orderService;
	
	private String imgCode;
	private OrderForm form = new OrderForm();

	@Action(value = "checkOrderForm", results = { @Result(name = "success", type = "json", params = { "excludeNullProperties", "true", "root", "result" }) })
	public String checkOrderFormAjax() {
		
		if (!SecurityCodeCompareUtil.compare(imgCode)) {
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
		
		Map<String, Object> session = ActionContext.getContext().getSession();
		session.put("orderForm", form);
		
		result.setStatus(AjaxStatus.SUCCESS.getValue());
		return SUCCESS;
	}
	
	@Override
	public AbstractGenericModel getModel() {
		return form;
	}
	
	public void setImgCode(String imgCode) {
		this.imgCode = imgCode;
	}
}
