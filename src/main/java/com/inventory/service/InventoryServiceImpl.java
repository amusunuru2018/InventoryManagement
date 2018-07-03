package com.inventory.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.time.DateUtils;

import com.inventory.bean.Item;
import com.inventory.dao.InventoryServiceDao;
import com.inventory.dao.InventoryServiceDaoImpl;

public class InventoryServiceImpl implements InventoryService {

	InventoryServiceDao dao = new InventoryServiceDaoImpl();

	public List<Item> readAllItemsFromDb() throws SQLException {

		List<Item> list = dao.readAllItemsFromDb();

		return list;
	}

	public void calculateExpiryDate(List<Item> list) {

		for (Item item : list) {

			Date expiry = DateUtils.addMonths(item.getMfg_Date(), item.getUsebeforeinmonths());
			item.setExpiryDate(expiry);

		}

	}

	public void removeExpiredItems(List<Item> list) {

		List<Item> temp = new ArrayList<Item>();

		Date currentDate = new Date();

		for (Item item : list) {

			if ((currentDate.compareTo(item.getExpiryDate())) > 0) {

				temp.add(item);
			}
		}

		list.removeAll(temp);
	}

}
