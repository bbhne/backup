package ec.phantom.store.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import ec.phantom.store.dao.SearchDAO;
import ec.phantom.store.dto.SearchDTO;

public class SearchAction extends ActionSupport implements SessionAware {

	public Map<String,Object> session;
	private String itemNumber;
	private String itemImage;
	private String itemName;
	private String itemType;
	private String itemPrice;

	public List<SearchDTO> searchList = new ArrayList<SearchDTO>();

	//テキストエリアに入力されたらDAOからsql文を呼び出す? isEmpty?

	public String execute() throws SQLException {

		String result = SUCCESS;
		SearchDAO searchDAO = new SearchDAO();
		searchList = searchDAO.getSearch(itemNumber, itemImage, itemName, itemType,itemPrice);
		return result;

	}



	public List<SearchDTO> getSearchList() {
		return searchList;
	}



	public void setSearchList(List<SearchDTO> searchList) {
		this.searchList = searchList;
	}



	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;

	}



}
