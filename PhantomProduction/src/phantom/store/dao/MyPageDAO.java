package phantom.store.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import phantom.store.dto.MyPageDTO;

public class MyPageDAO extends ActionSupport implements SessionAware {

	public Map<String,Object> session;

	private MyPageDAO myPageDAO = new MyPageDAO();

	public ArrayList<MyPageDTO> myPageList = new ArrayList<MyPageDTO>();

	private String deleteFlg;
	private String message;

	public String execute() throws SQLException {

		if(!session.containsKey("account_id")) {
			return ERROR;
		}
		if(deleteFlg == null) {
			String transaction_number = session.get("id").toString();
			String account_id = session.get("account_id").toString();

			myPageList = myPageDAO.getMyPageUserInfo(transaction_number,account_id);

			Iterator<MyPageDTO> iterator = myPageList.iterator();
			if(!(iterator.hasNext())) {
				myPageList = null;
			}
		}else if(deleteFlg.equals("1")) {
			delete();
		}
		String result = SUCCESS;
		return result;
	}

	public void delete() throws SQLException {
		String transaction_id = session.get("id").toString();
		String account_id = session.get("account_id").toString();

		int res = myPageDAO.buyItemHistoryDelete(transaction_id,account_id);

		if(res > 0)

	}

}
