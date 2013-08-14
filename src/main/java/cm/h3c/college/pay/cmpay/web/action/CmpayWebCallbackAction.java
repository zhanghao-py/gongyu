package cm.h3c.college.pay.cmpay.web.action;

import org.apache.log4j.Logger;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;

import cm.h3c.college.pay.cmpay.CmpayObjectFactory;
import cm.h3c.college.pay.cmpay.CmpayPaymentCallbackWebRequest;
import cm.h3c.college.pay.core.config.SystemConfig;
import cm.h3c.college.pay.core.exception.ServiceException;
import cm.h3c.college.pay.payment.cons.LogType;
import cm.h3c.college.pay.payment.service.LogService;
import cm.h3c.college.pay.payment.service.OrderService;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

@Namespace("/cmpay")
public class CmpayWebCallbackAction extends ActionSupport implements
		ModelDriven<CmpayPaymentCallbackWebRequest> {
	private static final long serialVersionUID = 20130811L;

	private static Logger log = Logger
			.getLogger(CmpayWebCallbackAction.class);

	@Autowired
	private OrderService orderService;
	@Autowired
	private SystemConfig config;
	@Autowired
	private CmpayObjectFactory objectFactory;

	@Autowired
	private LogService logService;
	
	private CmpayPaymentCallbackWebRequest callback = new CmpayPaymentCallbackWebRequest();

	@Override
	public CmpayPaymentCallbackWebRequest getModel() {
		return callback;
	}

	@Action(value = "web", results = { @Result(name = "success", type = "redirectAction", params = {
			"orderId", "${model.orderId}", "namespace", "/payment",
			"actionName", "doneOrderPortal" }) })
	public String callback() {
		if (!config.isDebug()) {
			objectFactory.checkSign(callback,
					"webcallback:" + callback.prepareSignData() + ", "
							+ callback.getSign(), callback.getMerId());
		}

		try {
			logService.doLog(LogType.CMPAY_CALLBACK_WEB_REQUEST, callback.parseOriginOrderId(), callback.prepareSignData());
			
			orderService.doWebCallbackOrder(callback);
		} catch (NumberFormatException e) {
			log.error(
					"parse callback.orderId to Long error, "
							+ callback.prepareSignData(), e);
		} catch (ServiceException e) {
			log.error("", e);
		}
		return SUCCESS;
	}
}
