package ec.zahura.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import ec.zahura.dao.SearchDAO;
import ec.zahura.dto.SearchDTO;

public class SearchAction extends ActionSupport implements SessionAware {

	public Map<String,Object> session;
	private String itemName;
	private String itemId;
	private String itemImage;


	public List<SearchDTO> searchList = new ArrayList<SearchDTO>();

	//テキストエリアに入力されたらDAOからsql文を呼び出す? isEmpty?

	public String execute() throws SQLException {

		String result = SUCCESS;
		SearchDAO searchDAO = new SearchDAO();
		searchList = searchDAO.getSearch(itemName);
		searchList = searchDAO.getSearch2(itemId);
		searchList = searchDAO.getSearch3(itemImage);
		searchList = searchDAO.getSearch4(itemId, itemName, itemImage);
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
