package ec.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import ec.dto.BuyItemDTO;
import ec.util.DBConnector;

public class BuyItemDAO {

	private DBConnector db = new DBConnector();
	private Connection con = db.getConnection();
	private BuyItemDTO buyItemDTO = new BuyItemDTO();w

	public BuyItemDTO getBuyItemInfo() {

		String sql = "select id, item_name, item_price from item_info_transaction";

		try {
			PreparedStatement ps = con.prepare
		}
	}


}
