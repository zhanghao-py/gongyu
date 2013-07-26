package cm.h3c.college.pay.core.web.action;

import org.apache.struts2.json.annotations.JSON;

import com.opensymphony.xwork2.ActionSupport;

public class GenericAction extends ActionSupport {

	private static final long serialVersionUID = 4417165019227377914L;

	protected Long status;
	protected String statusInfo = "";
	protected Object data;

	@JSON
	public Long getStatus() {
		return status;
	}

	@JSON
	public String getStatusInfo() {
		return statusInfo;
	}

	@JSON
	public Object getData() {
		return data;
	}

}
