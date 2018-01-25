package phantom.store.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import phantom.store.util.DBConnector;

public class UserCreateCompleteDAO {

	private DBConnector dbConnector = new DBConnector();
	private Connection connection = dbConnector.getConnection();

	private String sql = "INSERT INTO user_table (account_id,user_name,user_pass,user_mail) VALUES(?,?,?,?)";

	public void createUser(String accountId,String userName,String userPass,String userMail) throws SQLException {

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, accountId);
			preparedStatement.setString(2, userName);
			preparedStatement.setString(3, userPass);
			preparedStatement.setString(4, userMail);

			preparedStatement.executeQuery();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			connection.close();
		}


	}

}
