package store.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import store.dto.MypageDTO;
import store.util.DBConnector;

public class FavoDAO {

	private DBConnector dbConnector = new DBConnector();
	private Connection connection = dbConnector.getConnection();

	public ArrayList<MypageDTO> myPageList = new ArrayList<MypageDTO>();

	public void addFavoList(String item) {


		String sql_item_info_transaction = "select item_transaction_id from item_info_transaction where item_name=?";
		String sql_item_favorite = "INSERT INTO item_favorite (?, user_master_id, insert_date) VALUES(?, ?, ?, ?, ?, ?)";
		String itemTransactionId=null;

		// item_info_transactionテーブルからitem_transaction_idをもってくる
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql_item_info_transaction);
			ResultSet resultSet = preparedStatement.executeQuery();

			if(resultSet.next()) {
				itemTransactionId= resultSet.getString("item_transaction_id");
			}

		}catch(Exception e) {
			e.printStackTrace();
		}


		// item_favoriteテーブルへ登録
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql_item_favorite);
			preparedStatement.setString(1, itemTransactionId);
			preparedStatement.execute();

		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
