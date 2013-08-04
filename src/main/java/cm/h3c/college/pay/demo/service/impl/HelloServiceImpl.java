package cm.h3c.college.pay.demo.service.impl;

import org.springframework.stereotype.Component;

import cm.h3c.college.pay.demo.service.HelloService;

@Component("helloService")
public class HelloServiceImpl implements HelloService {

	@Override
	public String sayHello(String msg) {
		return msg + ", hello!";
	}

}
