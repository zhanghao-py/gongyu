package cm.h3c.college.pay.core.ws.soap;

import java.util.List;

import javax.xml.ws.Binding;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.Handler;

public class SOAPKeepSessionHandlerSettor {
	
	private ThreadLocal<SOAPKeepSessionHandler> keepSessionHandler = new ThreadLocal<SOAPKeepSessionHandler>();
	
	private static SOAPKeepSessionHandlerSettor instance;
	
	private SOAPKeepSessionHandlerSettor() {
		keepSessionHandler.set(new SOAPKeepSessionHandler());
	}
	
	public static SOAPKeepSessionHandlerSettor getInstance() {
		
		if (instance == null) {
			instance = new SOAPKeepSessionHandlerSettor();
		}
		
		return instance;
	}
	
	
	public void setHandler(BindingProvider proxy) {

		if (proxy == null) {
			return;
		}

		Binding binding = ((BindingProvider) proxy).getBinding();

		List<Handler> handlerList = binding.getHandlerChain();// 获得Handler链

		SOAPKeepSessionHandler handler = keepSessionHandler.get();
		
		if (!handlerList.contains(handler)) {// 防止重复插入Handler
			handlerList.add(handler);
			binding.setHandlerChain(handlerList);
		}

	}
}
