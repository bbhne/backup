package phantom.store.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import phantom.store.dao.BuyItemDAO;
import phantom.store.dao.LoginDAO;
import phantom.store.dto.BuyItemDTO;
import phantom.store.dto.LoginDTO;

public class LoginAction extends ActionSupport implements SessionAware {

	private String accountId;
	private String userPass;
	private String userMail;
	public Map<String,Object> session;

	private LoginDAO loginDAO = new LoginDAO();
	private LoginDTO loginDTO = new LoginDTO();

	private BuyItemDAO buyItemDAO = new BuyItemDAO();

	public String execute() {

		String result = ERROR;

		loginDTO = loginDAO.getLoginUserInfo(accountId,userPass);

		session.put("loginUser", loginDTO);

		if(((LoginDTO) session.get("loginUser")).getLoginFlg()) {
			result = SUCCESS;

			BuyItemDTO buyItemDTO = buyItemDAO.getBuyItemInfo();
			session.put("accountId",loginDTO.getAccountId());
			session.put("itemNumber",buyItemDTO.getItemNumber());
			session.put("itemName",buyItemDTO.getItemName());
			session.put("itemPrice",buyItemDTO.getItemPrice());

			return result;
		}
		return result;
	}

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
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

}
