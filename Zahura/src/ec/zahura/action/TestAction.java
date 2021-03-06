package ec.zahura.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import ec.zahura.dto.TestDTO;

public class TestAction extends ActionSupport implements SessionAware {
	String result = ERROR;
	private String id;
	private String itemName;
	private String itemPrice;

	private List<TestDTO> testList = new ArrayList<TestDTO>();
	private Map<String,Object> session;

	public String execute() {
		System.out.println(itemName);

		if(testList == null) {
			System.out.println("nul");
			return ERROR;
		}

		TestDTO dto = new TestDTO();
		dto.setId(id.toString());
		dto.setItemName(itemName.toString());
		dto.setItemPrice(itemPrice.toString());
		testList.add(dto);

		session.put("testList",testList);

		result = SUCCESS;
		return result;
	}



	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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

	public List<TestDTO> getTestList() {
		return testList;
	}
	public void setTestList(List<TestDTO> testList) {
		this.testList = testList;
	}


	public Map<String,Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;

	}

}
