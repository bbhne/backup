package ec.zahura.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import ec.zahura.dto.SearchDTO;
import ec.zahura.util.DBConnector;

public class SearchDAO {

	private ArrayList<SearchDTO> searchList = new ArrayList<SearchDTO>();


	String sql_head_search = "SELECT * FROM item_info_transaction WHERE item_name LIKE %?%";//←これつかう



	public List<SearchDTO> getSearch(String itemName) throws SQLException {
		DBConnector dbConnector = new DBConnector();
		Connection connection = dbConnector.getConnection();


		String sql = "SELECT item_name FROM item_info_transaction";

//item_nameぜんぶ
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();

			while(resultSet.next()) {
				SearchDTO searchDTO = new SearchDTO();
				searchDTO.setItemName(resultSet.getString("item_name"));
				searchList.add(searchDTO);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			connection.close();
		}
		return searchList;
	}

	public List<SearchDTO> getSearch2(String itemId) throws SQLException {
		DBConnector dbConnector = new DBConnector();
		Connection connection = dbConnector.getConnection();

		String sql = "SELECT id FROM item_info_transaction";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();

			while(resultSet.next()) {
				SearchDTO searchDTO2 = new SearchDTO();
				searchDTO2.setItemId(resultSet.getString("id"));
				searchList.add(searchDTO2);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			connection.close();
		}
		return searchList;
	}

	public List<SearchDTO> getSearch3(String itemImage) throws SQLException {
		DBConnector dbConnector = new DBConnector();
		Connection connection = dbConnector.getConnection();

		String sql = "SELECT item_image FROM item_info_transaction";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();

			while(resultSet.next()) {
				SearchDTO searchDTO3 = new SearchDTO();
				searchDTO3.setItemImage(resultSet.getString("item_image"));
				searchList.add(searchDTO3);}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			connection.close();
		}
		return searchList;
	}

	public List<SearchDTO> getSearch4(String id,String item_name,String item_image) throws SQLException {
		DBConnector dbConnector = new DBConnector();
		Connection connection = dbConnector.getConnection();

		String sql = "SELECT * FROM item_info_transaction";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();

			while(resultSet.next()) {
				SearchDTO searchDTO4 = new SearchDTO();
				searchDTO4.setItemId(resultSet.getString("id"));
				searchDTO4.setItemName(resultSet.getString("item_name"));
				searchDTO4.setItemImage(resultSet.getString("item_image"));
				searchList.add(searchDTO4);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			connection.close();
		}
		return searchList;
	}

//item_nameかしらもじ


}
