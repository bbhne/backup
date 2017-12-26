package ec.dto;

public class LoginDTO {

	private String loginId;
	public String loginPassword;
	public String userName;
	private boolean LoginFlg = false;

	public String LoginId() {
		return loginId;
	}
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getLoginPassword() {
		return loginPassword;
	}
	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}

	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

	public boolean getLoginFlg() {
		return LoginFlg;
	}
	public void setLoginFlg(boolean loginFlg) {
		this.LoginFlg = loginFlg;
	}

}
