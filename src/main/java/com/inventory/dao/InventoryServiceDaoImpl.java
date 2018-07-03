package com.inventory.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import com.inventory.Enum.WheatType;
import com.inventory.Enum.MilkType;
import com.inventory.Enum.CheeseType;
import com.inventory.bean.Cheese;
import com.inventory.bean.Item;
import com.inventory.bean.Milk;
import com.inventory.bean.Wheat;

public class InventoryServiceDaoImpl implements InventoryServiceDao{
	
	DatabaseConnection db=new DatabaseConnectionImpl();

	public List<Item> readAllItemsFromDb() throws SQLException {
		
		List<Item> list=new ArrayList<Item>();
		
		Connection con = db.getConnection();
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("select * from cheese_tbl");
		Item item = null;
		
		while(rs.next()) {
			item = new Cheese(rs.getInt(1),rs.getString(2), rs.getFloat(3),rs.getFloat(4)
					 ,rs.getDate(5), rs.getInt(6), CheeseType.valueOf(rs.getString(7)), rs.getDouble(8), rs.getDouble(9), rs.getDouble(10));
			
						
			
			list.add(item);
		}	
		
		ResultSet rs1 = stmt.executeQuery("select * from milk_tbl");
		Item item1 = null;
		
		while(rs1.next()) {
			item1 = new Milk(rs1.getInt(1),rs1.getString(2), rs1.getFloat(3),rs1.getFloat(4)
					 ,rs1.getDate(5), rs1.getInt(6), rs1.getInt(7), MilkType.valueOf(rs1.getString(8)));
			
			list.add(item1);
		}	
		
		ResultSet rs2 = stmt.executeQuery("select * from wheat_tbl");
		Item item2 = null;
		
		while(rs2.next()) {
			item2 = new Wheat(rs2.getInt(1),rs2.getString(2), rs2.getFloat(3),rs2.getFloat(4)
					 ,rs2.getDate(5), rs2.getInt(6), WheatType.valueOf(rs2.getString(7)));
			
			list.add(item2);
		}	
		
		return list;
	}

	

}
