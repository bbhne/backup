package ec.zahura.dto;

import java.util.ArrayList;

public class BuyItemComplete {

	private String id;
	private String itemTransactionId;
	private String itemName;
	private String itemImage;
	private String itemPrice;
	private String count;
	private String totalPrice;
	private String userMasterId;
	private String pay;
	private String itemStock;
	private ArrayList<String> itemStockList=new ArrayList<String>();
	private String insertDate;
	private String updateDate;


	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
	public String getItemImage() {
		return itemImage;
	}
	public void setItemImage(String itemImage) {
		this.itemImage = itemImage;
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
	public String getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(String totalPrice) {
		this.totalPrice = totalPrice;
	}
	public String getUserMasterId() {
		return userMasterId;
	}
	public void setUserMasterId(String userMasterId) {
		this.userMasterId = userMasterId;
	}
	public String getPay() {
		return pay;
	}
	public void setPay(String pay) {
		this.pay = pay;
	}
	public String getItemStock() {
		return itemStock;
	}
	public void setItemStock(String itemStock) {
		this.itemStock = itemStock;
	}
	public ArrayList<String> getItemStockList() {
		return itemStockList;
	}
	public void setItemStockList(ArrayList<String> itemStockList) {
		this.itemStockList = itemStockList;
	}
	public String getInsertDate() {
		return insertDate;
	}
	public void setInsertDate(String insertDate) {
		this.insertDate = insertDate;
	}
	public String getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}

}
