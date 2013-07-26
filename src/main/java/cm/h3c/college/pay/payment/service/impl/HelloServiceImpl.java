package cm.h3c.college.pay.payment.service.impl;

import cm.h3c.college.pay.payment.service.HelloService;

public class HelloServiceImpl implements HelloService {

	@Override
	public String sayHello(String msg) {
		return msg + ", hello!";
	}

}
