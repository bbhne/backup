package ec.phantom.store.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import ec.phantom.store.dto.SearchDTO;

public class BuyItemDetailAction extends ActionSupport implements SessionAware{
	public Map<String,Object> session;
	private String itemNumber;
	private String itemImage;
	private String itemName;
	private String itemType;
	private String itemPrice;

//
//	<s:hidden name="itemName" value="%{itemName}"/>
//	<s:hidden name="itemType" value="%{itemType}"/>
//	<s:hidden name="itemPrice" value="%{itemPrice}"/>
//	<s:hidden name="itemNumber" value="%{itemNumber}"/>


//	<p><s:property value="itemName"/></p>
//	<s:property value="itemType"/><br>
//	<s:property value="itemPrice"/><br>
//
//	 <s:hidden value="itemNumber"/>
//	<s:hidden value="pay"/>

//
//	<s:if test="errorMessage != ''">
//	<s:property value="errorMessage" escape="false"/>
//	</s:if>
//
//	<s:form action="BuyItemAction">
//	<table>
//
//	<tr>
//	<td><s:property value="session.buyItem_name"/></td>
//	</tr>
//		<tr>
//		<td><s:property value="session.buyItem_price"/></td>
//

	public List<SearchDTO> searchList = new ArrayList<SearchDTO>();

	public String execute(){
		String result=ERROR;
		System.out.println("BuyItemDetailAction--------------");
		session.put("buyItem_name", itemName);
		session.put("buyItem_price", itemPrice);

		result=SUCCESS;
		return result;

	}
	public Map<String, Object> getSession() {
		return session;
	}
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
	public String getItemNumber() {
		return itemNumber;
	}
	public void setItemNumber(String itemNumber) {
		this.itemNumber = itemNumber;
	}
	public String getItemImage() {
		return itemImage;
	}
	public void setItemImage(String itemImage) {
		this.itemImage = itemImage;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getItemType() {
		return itemType;
	}
	public void setItemType(String itemType) {
		this.itemType = itemType;
	}
	public String getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(String itemPrice) {
		this.itemPrice = itemPrice;
	}
	public List<SearchDTO> getSearchList() {
		return searchList;
	}
	public void setSearchList(List<SearchDTO> searchList) {
		this.searchList = searchList;
	}


}