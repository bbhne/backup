package store.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import store.dao.MypageDAO;
import store.dto.MypageDTO;

public class MypageAction extends ActionSupport implements SessionAware {
	public Map<String,Object> session;



	public ArrayList<MypageDTO> myPageList = new ArrayList<MypageDTO>();


	private String deleteFlg;
	private String message;



	public String execute() throws SQLException {
		MypageDAO myPageDAO = new MypageDAO();

		session.put("id", 1);
		session.put("login_user_id", 1);

		if(!session.containsKey("id")) {
			return ERROR;
		}
		if(deleteFlg == null) {
			String item_transaction_id = session.get("id").toString();
			String user_master_id = session.get("login_user_id").toString();
			// 特定ユーザーの購入履歴を取得する
			myPageList =
					myPageDAO.getMyPageUserInfo(item_transaction_id, user_master_id);

			Iterator<MypageDTO> iterator = myPageList.iterator();
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
		MypageDAO myPageDAO = new MypageDAO();
		String item_transaction_id = session.get("id").toString();
		String user_master_id = session.get("login_user_id").toString();

		int res = myPageDAO.buyItemHistoryDelete(item_transaction_id, user_master_id);

		if(res > 0) {
			myPageList = null;
			setMessage("商品情報を正しく削除しました。");
			}else if(res == 0) {
				setMessage("商品情報の削除に失敗しました。");

			}
	}


	public ArrayList<MypageDTO> getMyPageList() {
		return myPageList;
	}


	public void setMyPageList(ArrayList<MypageDTO> myPageList) {
		this.myPageList = myPageList;
	}




	public String getDeleteFlg() {
		return deleteFlg;
	}


	public void setDeleteFlg(String deleteFlg) {
		this.deleteFlg = deleteFlg;
	}

	@Override
	public void setSession(Map<String,Object> session) {
		this.session = session;
	}

	public Map<String, Object> getSession() {
		return session;
	}
	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}


}