package ec.phantom.store.dto;

public class BuyItemDTO {

	public int itemTransactionId;

	public String itemName;

	public String itemPrice;


	public int getItemTransactionId() {
		return itemTransactionId;
	}

	public void setItemTransactionId(int itemTransactionId) {
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


}
