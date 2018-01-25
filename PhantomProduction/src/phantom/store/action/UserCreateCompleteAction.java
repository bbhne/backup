package phantom.store.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import phantom.store.dao.UserCreateCompleteDAO;


public class UserCreateCompleteAction extends ActionSupport implements SessionAware {

	private String accountId;
	private String userName;
	private String userPass;
	private String userMail;

	public Map<String,Object> session;

	private UserCreateCompleteDAO userCreateCompleteDAO = new UserCreateCompleteDAO();


	public String execute() throws SQLException {

		userCreateCompleteDAO.createUser(
				session.get("accountId").toString(),
				session.get("userName").toString(),
				session.get("userPass").toString(),
				session.get("userMail").toString());

		String result = SUCCESS;

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
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
