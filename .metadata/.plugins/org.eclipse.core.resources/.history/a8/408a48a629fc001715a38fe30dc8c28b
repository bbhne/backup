package ec.zahura.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import ec.zahura.dto.FavoriteDTO;
import ec.zahura.dto.MyPageDTO;
import ec.zahura.util.DBConnector;

public class FavoriteDAO {




	private String itemName;

//	public MyPageDTO selectItemTtransaction(String itemName){
//		String itemTransactionId = null;
//		//String itemName = null;
//		// item_info_transactionテーブルからitem_transaction_idをもってくる
//
//		////////////////////////////////////////////////////////
//		String sql_item_info_transaction = "SELECT * FROM item_info_transaction where item_name = ?";
//		try {
//
//			PreparedStatement preparedStatement = connection.prepareStatement(sql_item_info_transaction);
//			preparedStatement.setString(1, itemName);
//			ResultSet resultSet = preparedStatement.executeQuery();
//
//			//リストにつめる
//			while(resultSet.next()) {
//				MyPageDTO dto = new MyPageDTO();
//				dto.setId(resultSet.getString("id"));
//				dto.setItemName(resultSet.getString("item_name"));
//				dto.setItemImage(resultSet.getString("item_image"));
//
//				favoList.add(dto);
//			}
//
//	if(resultSet.next()) {
//				itemTransactionId = resultSet.getString("id");
//				itemName = resultSet.getString("item_name");
//			}
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//	}


	public List<FavoriteDTO> selectFavoriteItem(String userMasterId){
		DBConnector db = new DBConnector();
		Connection connection = db.getConnection();
		List<FavoriteDTO> favoriteList = new ArrayList<FavoriteDTO>();
	try {
			String sql = "select * from item_info_transaction, item_favorite where item_favorite.item_transaction_id=item_info_transaction.id and item_favorite.user_master_id = ?";
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1,userMasterId);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				FavoriteDTO dto = new FavoriteDTO();
				dto.setId(rs.getString("item_favorite.id"));
				dto.setItemName(rs.getString("item_info_transaction.item_name"));
				dto.setItemImage(rs.getString("item_info_transaction.item_image"));
				dto.setItemTransactionId(rs.getString("item_favorite.item_transaction_id"));
				dto.setItemPrice(rs.getString("item_info_transaction.item_price"));
				dto.setUserMasterId(userMasterId);
				favoriteList.add(dto);

//
//				select item_favorite.id, item_info_transaction.item_name, item_info_transaction.item_image, item_favorite.item_transaction_id, item_info_transaction,id, item_info_transaction.item_price, item_favorite.user_master_id from item_info_transaction, item_favorite where item_favorite.item_transaction_id=item_info_transaction.id;
//
//				select * from item_info_transaction, item_favorite where item_favorite.item_transaction_id=item_info_transaction.id;
//
//
//				private String id;
//				private String itemName;
//				private String itemImage;
//				private String itemTransactionId;
//				private String itemPrice;
//				private String count;
//				private String checkList;
//				private String itemStock;
//				private String pay;
//				private String userMasterId;
//
//
//				dto.setItemName(rs.getString("item_name"));
//				favoList.add(dto);
			}
////

		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	return favoriteList;


	}

	/**
	 * お気に入り登録
	 * @param itemTransactionId
	 * @param userMasterId
	 * @return
	 */
	public int insertFavoriteItem(String itemTransactionId,String userMasterId){
		DBConnector db = new DBConnector();
		Connection connection = db.getConnection();
		// item_favoriteテーブルへ登録

		int count = 0;
		try {
			String sql = "INSERT INTO item_favorite(item_transaction_id, user_master_id, insert_date) VALUES(?,?,NOW())";
			PreparedStatement ps = connection.prepareStatement(sql);
					System.out.println("item_transaction_id:"+itemTransactionId);
					ps.setString(1, itemTransactionId);
					ps.setString(2, userMasterId);
			count = ps.executeUpdate();
					System.out.println("お気に入り："+count+"件登録しました");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return count;
	}

//
	public List<MyPageDTO> favoList(String item, String itemName, String itemTransaction) {
		DBConnector dbConnector = new DBConnector();
		Connection connection = dbConnector.getConnection();
		String itemTransactionId = null;
		List<MyPageDTO> favoList = new ArrayList<MyPageDTO>();
//		String itemName = null;

		// item_info_transactionテーブルからitem_transaction_idをもってくる

		String sql_item_info_transaction = "SELECT * FROM item_info_transaction where item_name = ?";
		try {

			PreparedStatement preparedStatement = connection.prepareStatement(sql_item_info_transaction);
			preparedStatement.setString(1, itemName);
			ResultSet resultSet = preparedStatement.executeQuery();

			//リストにつめる
			while(resultSet.next()) {
				MyPageDTO dto = new MyPageDTO();
				dto.setItemName(resultSet.getString("item_name"));
				favoList.add(dto);
			}

	if(resultSet.next()) {
				itemTransactionId = resultSet.getString("id");
				itemName = resultSet.getString("item_name");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}


		// item_favoriteテーブルへ登録

		try {
			String sql_item_favorite = "INSERT INTO item_favorite(user_master_id,item_name, insert_date) VALUES(?,?, NOW())";
			PreparedStatement preparedStatement = connection.prepareStatement(sql_item_favorite);
					System.out.println("item_transaction_id:"+itemTransactionId);
			preparedStatement.setString(1,itemTransactionId);
			preparedStatement.setString(2, itemName);

			int count = preparedStatement.executeUpdate();
					System.out.println(count+"件更新");


			String sql_item_favorite_select = "SELECT * FROM item_favorite where user_master_id = ?";
			PreparedStatement preparedStatementSelect = connection.prepareStatement(sql_item_favorite_select);
					System.out.println("item_transaction_id:"+itemTransactionId);
			preparedStatementSelect.setString(1,itemTransactionId);
		ResultSet resultSetSelect = preparedStatementSelect.executeQuery();
			while(resultSetSelect.next()) {
				MyPageDTO dto = new MyPageDTO();
				dto.setItemName(resultSetSelect.getString("item_name"));
				favoList.add(dto);
			}
////

	}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return favoList;

	}

}


