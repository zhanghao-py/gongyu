package cm.h3c.college.pay.payment.web.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

import cm.h3c.college.pay.payment.service.HelloService;

import com.opensymphony.xwork2.ActionSupport;

@Namespace("/hello")
public class HelloAction extends ActionSupport {
	
	private static final long serialVersionUID = 3921807869626262750L;

	private HelloService helloService;
	
	private Object data;
	
	@Action(value = "index", results = { @Result(name = "success", type = "json") })
	public String sayHello() {
		
		String data = helloService.sayHello("zhanghao!");
		
		
		return SUCCESS;
	}

}
