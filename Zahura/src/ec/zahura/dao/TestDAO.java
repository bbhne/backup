package ec.zahura.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import ec.zahura.dto.TestDTO;
import ec.zahura.util.DBConnector;

public class TestDAO {

	public String id;
	public String itemName;
	public String itemPrice;

	private List<TestDTO> testList = new ArrayList<TestDTO>();

	private DBConnector dbConnector = new DBConnector();
	private Connection connection = dbConnector.getConnection();

	String sql ="SELEST id,item_name,item_price FROM item_info_transaction";

	public List<TestDTO> testitem(String id,String itemName,String itemPrice) {
		TestDTO test = new TestDTO();
		try {

			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();

			if(resultSet.next()) {
				test.setId(resultSet.getString("id"));
				test.setItemName(resultSet.getString("item_name"));
				test.setItemPrice(resultSet.getString("item_price"));
				testList.add(test);
System.out.println(id);
System.out.println(itemName);
System.out.println(itemPrice);
			}

		}catch(SQLException e) {
			e.printStackTrace();
		}
		return testList;


	}

	public List<TestDTO> getTestList() {
		return testList;
	}

	public void setTestList(List<TestDTO> testList) {
		this.testList = testList;
	}
}