package cm.h3c.college.pay.core.ws.soap;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.xml.namespace.QName;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;

public class SOAPKeepSessionHandler implements SOAPHandler<SOAPMessageContext> {
	
	private List<String> cookie = null;

	@Override
	public boolean handleMessage(SOAPMessageContext context) {
		
		try {
			Boolean out = (Boolean) context.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);
			
			//响应
			if ( !out ) {
				
				Map<String, List<String>> responseHeaders = (Map<String, List<String>>) context.get(MessageContext.HTTP_RESPONSE_HEADERS);
				
				// sessionid在该域中
				List<String> c = responseHeaders.get("Set-cookie"); 
				
				//这是第一次HTTP调用，cookie刚刚得到
				if( cookie == null && c != null ) { 
					cookie = c;
				}
			
			//请求
			} else {
				
				Map<String, List<String>> requestHeaders = (Map<String, List<String>>) context.get(MessageContext.HTTP_REQUEST_HEADERS);
				
				//请求上下文可能为空，构造一个新的即可
				if ( requestHeaders == null ) {
					requestHeaders = new HashMap<String, List<String>>();
					//将一个空的请求上下文设置到SOAPMessageContext中
					context.put(MessageContext.HTTP_REQUEST_HEADERS, requestHeaders);
					//设置该请求上下文全局有效
					context.setScope(MessageContext.HTTP_REQUEST_HEADERS, MessageContext.Scope.APPLICATION);
				}
				
				//如果已经获得了sessionid，将该sessionid设置到请求上下文中即可
				if( cookie != null ){
					requestHeaders.put("cookie", cookie);
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return true;
	}

	@Override
	public boolean handleFault(SOAPMessageContext context) {
		return false;
	}

	@Override
	public void close(MessageContext context) {
		
	}

	@Override
	public Set<QName> getHeaders() {
		return null;
	}

}
