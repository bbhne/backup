package ec.zahura.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import ec.zahura.util.DBConnector;
//import ec.zahura.util.DateUtil;

public class BuyItemCompleteDAO {

	/**
	 * 商品購入情報登録メソッド
	 *
	 * @param item_transaction_id
	 * @param user_master_id
	 * @param total_price
	 * @param total_count
	 * @param pay
	 * @throws SQLException
	 */

	public int buyItemInfo(String item_transaction_id,String user_master_id,String total_price,String total_count,String pay)
	throws SQLException {

		DBConnector dbConnector = new DBConnector();
		Connection connection = dbConnector.getConnection();
	//	DateUtil dateUtil = new DateUtil();
		String sql = "INSERT INTO user_buy_item_transaction(item_transaction_id,total_price,total_count,user_master_id,pay,insert_date) VALUES(?,?,?,?,?,NOW())";

		int count=0;
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1,item_transaction_id);
			preparedStatement.setString(2,user_master_id);
			preparedStatement.setString(3,total_price);
			preparedStatement.setString(4,total_count);
			preparedStatement.setString(5,pay);


			preparedStatement.execute();
			//count=preparedStatement.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			connection.close();
		}
		return count;
	}
}
