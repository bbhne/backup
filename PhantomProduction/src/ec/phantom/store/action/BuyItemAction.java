package ec.phantom.store.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class BuyItemAction extends ActionSupport implements SessionAware {

	/**
	 * アイテム購入個数
	 */
	private int count;

	private int payment;

	private int itemNumber;

	/**
	 * 支払い方法
	 */
	private String pay;

	/**
	 * アイテム情報格納
	 */
	public Map<String,Object> session;

	/**
	 * 商品情報取得メソッド
	 */

	private String errorMessage;
	public String execute() {

		if(!session.containsKey("loginUser")) {
			setErrorMessage("購入する場合はログインしてください!");
			return ERROR;

		}

		String result = SUCCESS;

		session.put("count", count);

		int intCount = Integer.parseInt(session.get("count").toString());
		int intPrice = Integer.parseInt(session.get("Item_price").toString());

		session.put("total_price", intCount * intPrice);
		String payment;
System.out.println(pay);
		if(pay.equals("1")) {
			payment = "現金払い";
			session.put("pay", payment);
		}else {
			payment = "クレジットカード";
			session.put("pay", payment);
		}
		return result;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getPay() {
		return pay;
	}

	public void setPay(String pay) {
		this.pay = pay;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public int getPayment() {
		return payment;
	}

	public void setPayment(int payment) {
		this.payment = payment;
	}

	public int getItemNumber() {
		return itemNumber;
	}

	public void setItemNumber(int itemNumber) {
		this.itemNumber = itemNumber;
	}



}