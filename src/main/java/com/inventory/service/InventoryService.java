package com.inventory.service;

import java.sql.SQLException;
import java.util.List;

import com.inventory.bean.Item;

public interface InventoryService {
	
	List<Item> readAllItemsFromDb() throws SQLException;
	
	void calculateExpiryDate(List<Item> list);
	
	void removeExpiredItems(List<Item> list);

}
