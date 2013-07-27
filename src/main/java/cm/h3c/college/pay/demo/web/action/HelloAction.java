package cm.h3c.college.pay.demo.web.action;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.json.annotations.JSON;

import cm.h3c.college.pay.demo.service.HelloService;

import com.opensymphony.xwork2.ActionSupport;

@Namespace("/hello")
public class HelloAction extends ActionSupport {
	
	private Logger log = Logger.getLogger(HelloAction.class);
	
	private static final long serialVersionUID = 3921807869626262750L;

	private Object data;
	
	@Resource(name = "helloService")
	private HelloService helloService;
	
	@Action(value = "sayHello", results = { @Result(name = "success", type = "redirect", location = "/") })
	public String sayHello() {
		
		String data = helloService.sayHello("zhanghao!");
		log.info(data);
		
		this.data = data;
		
		return SUCCESS;
	}
	
	@Action(value = "sayHelloAjax", results = { @Result(name = "success", type = "json") })
	public String sayHelloAjax() {
		
		String msg = helloService.sayHello("zhanghao!");
		
		Map<String, Object> data = new HashMap<String, Object>();
		data.put("msg", msg);
		
		this.data = data;
		
		return SUCCESS;
	}
	
	@JSON
	public Object getData() {
		return data;
	}

}
