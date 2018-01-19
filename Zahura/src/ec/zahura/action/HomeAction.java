package ec.zahura.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import ec.zahura.dao.BuyItemDAO;
import ec.zahura.dto.BuyItemDTO;

public class HomeAction extends ActionSupport implements SessionAware {

	public Map<String,Object> session;

	/**
	 * ログインボタン押下時に実行
	 * ログイン画面へ遷移する。
	 *
	 * @return SUCCESS
	 */
	public String execute() {

		String result = "login";
		if(session.containsKey("id")) {
			//アイテム情報を取得
			BuyItemDAO buyItemDAO = new BuyItemDAO();
			BuyItemDTO buyItemDTO = buyItemDAO.getBuyItemInfo();

			session.put("id",buyItemDTO.getItemTransactionId());
			session.put("buyItem_name", buyItemDTO.getItemName());
			session.put("buyItem_price", buyItemDTO.getItemPrice());

			result = SUCCESS;
		}
		return result;
	}

	@Override
	public void setSession(Map<String,Object> session) {
		this.session = session;
	}

	public Map<String,Object> getSession() {
		return this.session;
	}


}
