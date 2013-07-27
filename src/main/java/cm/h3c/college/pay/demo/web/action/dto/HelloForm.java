package cm.h3c.college.pay.demo.web.action.dto;

import cm.h3c.college.pay.core.web.action.dto.AbstractGenericModel;

public class HelloForm extends AbstractGenericModel {

	private static final long serialVersionUID = 2226595253517927951L;
	
	private String username;
	
	private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
