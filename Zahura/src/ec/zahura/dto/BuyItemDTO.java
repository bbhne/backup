package ec.zahura.dto;

import java.util.ArrayList;

public class BuyItemDTO {

	public int id;
	public String itemName;
	public String itemImage;
	public String itemPrice;
	public String itemStock;
	public ArrayList<String> itemStockList=new ArrayList<String>();
	public String insertDate;
	public String updateDate;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
