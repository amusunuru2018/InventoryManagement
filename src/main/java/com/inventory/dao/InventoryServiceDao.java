package com.inventory.dao;

import java.sql.SQLException;
import java.util.List;

import com.inventory.bean.Item;

public interface InventoryServiceDao {
	
	List<Item> readAllItemsFromDb() throws SQLException;

}
