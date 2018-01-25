package phantom.store.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import phantom.store.dao.MyPageDAO;
import phantom.store.dto.MyPageDTO;

public class MyPageAction extends ActionSupport implements SessionAware {

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
			String user_account_id = session.get("account_id").toString();
			String user_pass = session.get("user_pass").toString();

			myPageList = myPageDAO.getMyPageUserInfo(user_account_id,user_pass);

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
		String user_account_id = session.get("account_id").toString();
		String user_pass = session.get("login_id").toString();

		int res = myPageDAO.buyItemHistoryDelete(user_account_id,user_pass);

		if(res > 0) {
			myPageList = null;
			setMessage("商品情報を正しく削除しました");
		}else if(res == 0) {
			setMessage("商品情報の削除に失敗しました");
		}
	}

	public String getDeleteFlg() {
		return deleteFlg;
	}
	public void setDeleteFlg(String deleteFlg) {
		this.deleteFlg = deleteFlg;
	}

	@Override
	public void setSession(Map<String,Object> session) {
		this.session =session;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}



}
