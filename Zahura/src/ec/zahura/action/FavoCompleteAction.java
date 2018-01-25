package ec.zahura.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class FavoCompleteAction extends ActionSupport implements SessionAware {

	public Map<String,Object> session;

	private String userMasterId;

	public String execute() {
		String result = SUCCESS;
		return result;
	}

	public void setSession(Map<String,Object> session) {
		this.session = session;
	}

	public String getUserMasterId() {
		return userMasterId;
	}

	public void setUserMasterId(String userMasterId) {
		this.userMasterId = userMasterId;
	}

	public Map<String, Object> getSession() {
		return session;
	}



}
