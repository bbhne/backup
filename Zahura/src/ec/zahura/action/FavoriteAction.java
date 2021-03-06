package ec.zahura.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import ec.zahura.dao.BuyItemDAO;
import ec.zahura.dao.FavoriteDAO;
import ec.zahura.dto.BuyItemDTO;
import ec.zahura.dto.FavoriteDTO;

public class FavoriteAction extends ActionSupport implements SessionAware {


	private String itemTransactionId;
	private String item;
	private String itemName;
	private String itemPrice;
	private String count;
	private String checkList;
	private String itemStock;
	private String pay;
	private String userMasterId;

	private String errorMessage;

	private List<BuyItemDTO> buyItemList = new ArrayList<BuyItemDTO>();



	private String itemTransaction;

	public List<FavoriteDTO> favoriteList = new ArrayList<FavoriteDTO>();


	/**
	 * アイテム情報を格納
	 */
	public Map<String,Object> session;
//	FavoriteDAO favo = new FavoriteDAO();

//今日
	public String execute() {
		String result = ERROR;
		System.out.println("FavoAction----------------");
		System.out.println(itemTransactionId);
		System.out.println(itemName);
		System.out.println(itemPrice);
		System.out.println(count);
		System.out.println(checkList);
		System.out.println(pay);
		System.out.println(userMasterId);
		System.out.println("--------------------------");


		errorMessage=null;
		if(checkList==null){
			errorMessage="商品がなにも選択されていません。";
			// アイテム情報を取得
			BuyItemDAO buyItemDAO = new BuyItemDAO();
			//アイテム情報を取得
			buyItemList = buyItemDAO.getBuyItemList();
			return ERROR;
		}


		String[] itemTransactionIdList = itemTransactionId.split(", ", 0);
		String[] itemNameList = itemName.split(", ", 0);
		String[] itemPriceList = itemPrice.split(", ", 0);
		String[] countList = count.split(", ", 0);
		String[] favoriteItemTransactionIdList = checkList.split(", ", 0);


		for(int i=0; i< favoriteItemTransactionIdList.length;i++){
			int id=Integer.parseInt(favoriteItemTransactionIdList[i]);
			System.out.println(id);

				FavoriteDTO dto=new FavoriteDTO();
				dto.setItemTransactionId(itemTransactionIdList[id-1].toString());
				dto.setItemName(itemNameList[id-1].toString());
				dto.setItemPrice(itemPriceList[id-1].toString());
				dto.setCount(countList[id-1].toString());
				dto.setUserMasterId(userMasterId);
				favoriteList.add(dto);
		}

		System.out.println("お気に入りが"+ favoriteList.size()+"件ありました");

		int count=0;
		FavoriteDAO dao = new FavoriteDAO();
		for(int i=0;i<favoriteList.size();i++){
			count += dao.insertFavoriteItem(favoriteList.get(i).getItemTransactionId(),favoriteList.get(i).getUserMasterId());
		}
		System.out.println("データベースに登録された件数："+ count);

		favoriteList = dao.selectFavoriteItem(userMasterId);
//
//
//
//
//		favoList = favo.favoList(item, itemName, itemTransaction);
//		session.put("favoList", favoList);
//		session.put("item_name", favo.getItemName());
//
//		BuyItemDTO dto = new BuyItemDTO();
//			System.out.println(dto.getItemName());
//		session.put("item_name", dto.getItemName());
//
		result = SUCCESS;
		return result;
	}





	public List<BuyItemDTO> getBuyItemList() {
		return buyItemList;
	}





	public void setBuyItemList(List<BuyItemDTO> buyItemList) {
		this.buyItemList = buyItemList;
	}





	public String getItemTransactionId() {
		return itemTransactionId;
	}

	public void setItemTransactionId(String itemTransactionId) {
		this.itemTransactionId = itemTransactionId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(String itemPrice) {
		this.itemPrice = itemPrice;
	}

	public String getCount() {
		return count;
	}

	public void setCount(String count) {
		this.count = count;
	}

	public String getCheckList() {
		return checkList;
	}

	public void setCheckList(String checkList) {
		this.checkList = checkList;
	}

	public String getItemStock() {
		return itemStock;
	}

	public void setItemStock(String itemStock) {
		this.itemStock = itemStock;
	}

	public String getPay() {
		return pay;
	}

	public void setPay(String pay) {
		this.pay = pay;
	}

	public String getUserMasterId() {
		return userMasterId;
	}

	public void setUserMasterId(String userMasterId) {
		this.userMasterId = userMasterId;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}



	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public String getItemTransaction() {
		return itemTransaction;
	}

	public void setItemTransaction(String itemTransaction) {
		this.itemTransaction = itemTransaction;
	}

	public List<FavoriteDTO> getFavoriteList() {
		return favoriteList;
	}

	public void setFavoriteList(List<FavoriteDTO> favoriteList) {
		this.favoriteList = favoriteList;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}




}
