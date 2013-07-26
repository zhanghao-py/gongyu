package cm.h3c.college.pay.payment.web.action;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

import cm.h3c.college.pay.payment.service.HelloService;

import com.opensymphony.xwork2.ActionSupport;

@Namespace("/hello")
public class HelloAction extends ActionSupport {
	
	private Logger log = Logger.getLogger(HelloAction.class);
	
	private static final long serialVersionUID = 3921807869626262750L;

	@Resource(name = "helloService")
	private HelloService helloService;
	
	private Object data;
	
	@Action(value = "sayHello", results = { @Result(name = "success", type = "redirect", location = "/") })
	public String sayHello() {
		
		String data = helloService.sayHello("zhanghao!");
		log.info(data);
		
		return SUCCESS;
	}

}
