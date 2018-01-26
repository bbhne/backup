package ec.zahura.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import ec.zahura.dao.BuyItemDAO;
import ec.zahura.dao.LoginDAO;
import ec.zahura.dto.BuyItemDTO;
import ec.zahura.dto.LoginDTO;

/**
 * ログイン認証処理
 * Login.jspからログインID、ログインパスワードを受け取り
 * DBへ問い合わせを行います。
 *
 * @author internouis
 * @param loginUserId
 * @param loginPassword
 *
 * @return result
 */

public class LoginAction extends ActionSupport implements SessionAware {
	/**
	 * ログインID
	 */
	private String loginUserId;
	/**
	 * ログインパスワード
	 */
	private String loginPassword;

	/**
	 * ログイン情報を格納
	 */
	public Map<String,Object> session;




	 // ログイン情報取得DAO
	LoginDAO loginDAO = new LoginDAO();
	// ログイン情報格納DTO
	LoginDTO loginDTO = new LoginDTO();

	private BuyItemDAO buyItemDAO = new BuyItemDAO();


		private List<BuyItemDTO> buyItemList = new ArrayList<BuyItemDTO>();

	private String itemTransactionId;
	private String userMasterId;

	/**
	 * 実行メソッド
	 */
	public String execute() {
		// 処理結果を格納
		String result = ERROR;

		//ログイン実行
		loginDTO = loginDAO.getLoginUserInfo(loginUserId, loginPassword);

		session.put("loginUser", loginDTO);

			System.out.println(loginUserId);
			System.out.println(loginPassword);

		//ログイン情報を比較
		if(((LoginDTO) session.get("loginUser")).getLoginFlg()) {

			result = SUCCESS;



			// アイテム情報を取得
			BuyItemDTO buyItemDTO = buyItemDAO.getBuyItemInfo();
			session.put("login_user_id", loginDTO.getLoginId());
			session.put("id",buyItemDTO.getId());
			session.put("buyItem_name", buyItemDTO.getItemName());
			session.put("buyItem_price", buyItemDTO.getItemPrice());

			//アイテム情報を取得
			buyItemList = buyItemDAO.getBuyItemList();
			System.out.println(buyItemList.get(0).getItemName());
			System.out.println(buyItemList.get(0).getItemPrice());
			userMasterId = loginDTO.getId();

//			session.put("login_user_id", loginDTO.getLoginId());
//			session.put("id", buyItemDTO.getId());
//			session.put("buyItem_name", buyItemDTO.getItemName());
//			session.put("buyItem_price", buyItemDTO.getItemPrice());

			return result;
		}
		return result;
	}



	public String getItemTransactionId() {
		return itemTransactionId;
	}



	public void setItemTransactionId(String itemTransactionId) {
		this.itemTransactionId = itemTransactionId;
	}



	public String getUserMasterId() {
		return userMasterId;
	}



	public void setUserMasterId(String userMasterId) {
		this.userMasterId = userMasterId;
	}



	public String getLoginUserId() {
		return loginUserId;
	}
	public void setLoginUserId(String loginUserId) {
		this.loginUserId = loginUserId;
	}

	public String getLoginPassword() {
		return loginPassword;
	}
	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}



	public List<BuyItemDTO> getBuyItemList() {
		return buyItemList;
	}

	public void setBuyItemList(List<BuyItemDTO> buyItemList) {
		this.buyItemList = buyItemList;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	@Override
	public void setSession(Map<String,Object> session) {
		this.session = session;
	}

}
