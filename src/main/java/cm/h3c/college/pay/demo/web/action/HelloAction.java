package cm.h3c.college.pay.demo.web.action;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

import cm.h3c.college.pay.core.cons.AjaxStatus;
import cm.h3c.college.pay.core.web.action.GenericAction;
import cm.h3c.college.pay.core.web.action.dto.AbstractGenericModel;
import cm.h3c.college.pay.demo.service.HelloService;
import cm.h3c.college.pay.demo.web.action.dto.HelloForm;

@Namespace("/hello")
public class HelloAction extends GenericAction {
	
	private Logger log = Logger.getLogger(HelloAction.class);
	
	private static final long serialVersionUID = 3921807869626262750L;
	
	private HelloForm form = new HelloForm();
	
	@Resource(name = "helloService")
	private HelloService helloService;
	
	@Action(value = "sayHello", results = { @Result(name = "success", type = "redirect", location = "/") })
	public String sayHello() {
		
		String data = helloService.sayHello("zhanghao!");
		log.info(data);
		
		result.setData(data);
		
		return SUCCESS;
	}
	
	@Action(value = "sayHelloAjax", results = { @Result(name = "success", type = "json" , params = { "excludeNullProperties", "true", "root", "result" }) })
	public String sayHelloAjax() {
		
		String msg = helloService.sayHello("zhanghao!");
		
		Map<String, Object> data = new HashMap<String, Object>();
		data.put("msg", msg);
		
		result.setStatus(AjaxStatus.SUCCESS.getValue());
		result.setData(data);
		
		return SUCCESS;
	}

	@Override
	public AbstractGenericModel getModel() {
		return form;
	}


}
