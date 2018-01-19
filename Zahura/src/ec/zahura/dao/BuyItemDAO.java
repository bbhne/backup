package ec.zahura.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import ec.zahura.dto.BuyItemDTO;
import ec.zahura.util.DBConnector;

public class BuyItemDAO {

	private List<BuyItemDTO> buyItemList = new ArrayList<BuyItemDTO>();

	/**
	 * 商品情報取得メソッド
	 *
	 * @return BuyItemDTO
	 */
	public BuyItemDTO getBuyItemInfo() {
		DBConnector dbConnector = new DBConnector();
		Connection connection = dbConnector.getConnection();
		BuyItemDTO buyItemDTO = new BuyItemDTO();
//item_image今日いじりました↓
		String sql = "SELECT id,item_name,item_image,item_price FROM item_info_transaction";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();

			if(resultSet.next()) {
				buyItemDTO.setItemTransactionId(resultSet.getString("id"));
				buyItemDTO.setItemName(resultSet.getString("item_name"));
				buyItemDTO.setItemImage(resultSet.getString("item_image"));
				buyItemDTO.setItemPrice(resultSet.getString("item_price"));
				System.out.println(buyItemDTO.getItemTransactionId());
				System.out.println(buyItemDTO.getItemName());
				System.out.println(buyItemDTO.getItemImage());
				System.out.println(buyItemDTO.getItemPrice());
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return buyItemDTO;
	}


	/**
	 * 商品情報リスト取得メソッド
	 *
	 * @return BuyItemList
	 */
	public List<BuyItemDTO> getBuyItemList() {
		DBConnector dbConnector = new DBConnector();
		Connection connection = dbConnector.getConnection();
		//item_image今日いじりました↓
		String sql = "SELECT * FROM item_info_transaction";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();

			while(resultSet.next()) {
				BuyItemDTO buyItemDTO = new BuyItemDTO();
				buyItemDTO.setId(resultSet.getString("id"));
				buyItemDTO.setItemTransactionId(resultSet.getString("id"));
				buyItemDTO.setItemName(resultSet.getString("item_name"));
				buyItemDTO.setItemImage(resultSet.getString("item_image"));
				buyItemDTO.setItemPrice(resultSet.getString("item_price"));
				buyItemDTO.setItemStock(resultSet.getString("item_stock"));

				ArrayList<String> itemStockList=new ArrayList<String>();
				int itemStock=Integer.parseInt(resultSet.getString("item_stock"));
				for(int i=0;i<itemStock;i++){
					itemStockList.add(i,String.valueOf(i+1));
				}
				buyItemDTO.setItemStockList(itemStockList);

				buyItemDTO.setInsertDate(resultSet.getString("insert_date"));
				buyItemDTO.setUpdateDate(resultSet.getString("update_date"));
				System.out.println("----------BuyItemDAO");
				System.out.println(buyItemDTO.getItemTransactionId());
				System.out.println(buyItemDTO.getItemName());
				System.out.println(buyItemDTO.getItemImage());
				System.out.println(buyItemDTO.getItemPrice());
				System.out.println(buyItemDTO.getItemStock());
				System.out.println(buyItemDTO.getInsertDate());
				System.out.println(buyItemDTO.getUpdateDate());
				System.out.println("--------------------");
				buyItemList.add(buyItemDTO);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return buyItemList;
	}
}
