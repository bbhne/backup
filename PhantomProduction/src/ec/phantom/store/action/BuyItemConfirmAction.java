package ec.phantom.store.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import ec.phantom.store.dao.BuyItemCompleteDAO;

public class BuyItemConfirmAction extends ActionSupport implements SessionAware {

	public Map<String,Object> session;

	private BuyItemCompleteDAO buyItemCompleteDAO = new BuyItemCompleteDAO();

	/**
	 * 商品購入情報登録メソッド
	 */
	public String execute() throws SQLException {
		//item_transaction_id, account_id, total_price, total_count, pay
		buyItemCompleteDAO.buyItemInfo(
				session.get("item_transaction_id").toString(),
				session.get("account_id").toString(),
				session.get("total_price").toString(),
				session.get("count").toString(),
				session.get("pay").toString());

		String result = SUCCESS;
		return result;

	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}



}
