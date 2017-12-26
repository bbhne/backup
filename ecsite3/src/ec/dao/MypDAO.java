package ec.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import ec.dto.MypDTO;
import ec.util.DBConnector;

public class MypDAO {

	private DBConnector db = new DBConnector();
	private Connection con = db.getConnection();

	public ArrayList<MypDTO> getMypUserInfo(String item_transaction_id,String user_master_id)
		throws SQLException {

		ArrayList<MypDTO> mypDTO = new ArrayList<MypDTO>();

		String sql = "select ubit.id,iit.item_name,ubit.total_price,ubit.total_count,ubit.pay,ubit.insert_date from user_buy_item_transaction ubit left join item_info_transaction iit on ubit.item_transaction_id = iit.id where ubit.item_transaction_id = ? and ubit.user_master_id = ? order by insert_date desc";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, item_transaction_id);
			ps.setString(2, user_master_id);

			ResultSet rs = ps.executeQuery();

			while(rs.next()) {
				MypDTO dto = new MypDTO();
				dto.setId(rs.getString("id"));
				dto.setItemName(rs.getString("item_name"));
				dto.setTotalPrice(rs.getString("totalprice"));
				dto.setTotalCount(rs.getString("total_count"));
				dto.setPayment(rs.getString("pay"));
				dto.setInsert_date(rs.getString("insert_date"));
				mypDTO.add(dto);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			con.close();
		}
		return mypDTO;
	}

	public int buyItemHistoryDelete(String item_transaction_id,String user_master_id) throws SQLException {

		String sql = "delete from user_buy_item_transaction where item_transaction_id = ? and user_master_id = ?";

		PreparedStatement ps;
		int rs = 0;
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, item_transaction_id);
			ps.setString(2, user_master_id);

			rs = ps.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			con.close();
		}
		return rs;
	}
}
