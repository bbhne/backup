package phantom.store.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class UserCreateConfirmAction extends ActionSupport implements SessionAware {

	private String accountId;
	private String userName;
	private String userPass;
	private String userMail;

	public Map<String,Object> session;

	private String errorMessage;

	public String execute() {


		String result = SUCCESS;

		if(!(accountId.equals("")) &&!(userName.equals("")) && !(userPass.equals("")) && !(userMail.equals(""))) {

			session.put("accountId", accountId);
			session.put("userName", userName);
			session.put("userPass", userPass);
			session.put("userMail", userMail);
		}else {
			setErrorMessage("未入力の項目があります。");
			result = ERROR;
		}
		return result;
	}

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPass() {
		return userPass;
	}

	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}

	public String getUserMail() {
		return userMail;
	}

	public void setUserMail(String userMail) {
		this.userMail = userMail;
	}

	@Override
	public void setSession(Map<String,Object> session) {
		this.session = session;
	}


	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}


}
