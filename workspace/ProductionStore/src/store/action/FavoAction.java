package store.action;

import com.opensymphony.xwork2.ActionSupport;

import store.dao.FavoDAO;

public class FavoAction extends ActionSupport {

	private String item;

	public String execute() {

		FavoDAO dao=new FavoDAO();
		dao.addFavoList(item);

		return item;

	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}


}
