package ikinuki.Action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class FavoAction extends ActionSupport implements SessionAware {

	public Map<String, Object> session;

	@Override
	public void setSession(Map<String,Object> session) {
		this.session = session;
	}

}
