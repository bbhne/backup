package ikinuki.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import ikinuki.util.DBConnector;

public class FavoDAO {

	private DBConnector dbConnector = new DBConnector();

	private Connection connection = dbConnector.getConnection();

	String sql_item_transaction = "SELECT itemId ,itemName";
	String sql_item_favorite = "INSERT INTO item_favorite(itemId, itemName) VALUES(?,?)";


	/**
	 * favo-touroku-method
	 */

	public void itemFavoTable(String itemId, String itemName) throws SQLException {

		try {
			PreparedStatement prepare = connection.prepareStatement(sql);
			prepare.setString(1, "itemId");
			prepare.setString(2, "itemName");

			prepare.execute();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			connection.close();
		}

	}

}
