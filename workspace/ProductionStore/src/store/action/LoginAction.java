package store.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import store.dao.BuyItemDAO;
import store.dao.LoginDAO;
import store.dto.BuyItemDTO;
import store.dto.LoginDTO;

public class LoginAction extends ActionSupport implements SessionAware {
	private String username;
	private String password;
	private List<LoginDTO> LoginDTOList = new ArrayList<LoginDTO>();
	private Map<String,Object> session;

	private BuyItemDAO buyItemDAO = new BuyItemDAO();


	public String execute() {
		String ret = ERROR;
		System.out.println(username);
		System.out.println(password);
		LoginDAO dao = new LoginDAO();

		LoginDTOList = dao.select(username,password);

		if(this.username.equals(LoginDTOList.get(0).getUsername()) &&
				this.password.equals(LoginDTOList.get(0).getPassword())) {
		BuyItemDTO buyItemDTO = buyItemDAO.getBuyItemInfo();
		session.put("password",LoginDTOList.get(0).getPassword());
		session.put("login_user_id", LoginDTOList.get(0).getId());
		session.put("id", buyItemDTO.getId());
		session.put("buyItem_name", buyItemDTO.getItemName());
		session.put("buyItem_price", buyItemDTO.getItemPrice());

			ret = SUCCESS;
		}else {
			ret = ERROR;
		}
		return ret;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

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

	public List<LoginDTO> getLoginDTOList() {
		return LoginDTOList;
	}
	public void setLoginDTOList(List<LoginDTO> loginDTOList) {
		LoginDTOList = loginDTOList;
	}

}
