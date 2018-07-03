package com.inventroy.app;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.List;

import com.inventory.bean.Cheese;
import com.inventory.bean.Item;
import com.inventory.bean.Milk;
import com.inventory.bean.Wheat;
import com.inventory.service.InventoryService;
import com.inventory.service.InventoryServiceImpl;

public class App {

	public static void main(String[] args) throws SQLException {

		InventoryService service = new InventoryServiceImpl();
		
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");

		List<Item> readlist = service.readAllItemsFromDb();
		
		service.calculateExpiryDate(readlist);

		printItems(sdf, readlist);
		
		service.removeExpiredItems(readlist);
		
		System.out.println("Removing Expired Items**********************************************");
		
		printItems(sdf, readlist);

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	private static void printItems(SimpleDateFormat sdf, List<Item> readlist) {
		for (Item item : readlist) {

			if (item instanceof Cheese) {

				Cheese cheese = (Cheese) item;
				System.out.println(
						item.getId() + " " + item.getDescription() + " " + item.getWeight() + " " + item.getPrice()
								+ " " + item.getMfg_Date() + " " + item.getUsebeforeinmonths() + " " + sdf.format(item.getExpiryDate()) +" "+ cheese.getType()
								+ " " + cheese.getProtein() + " " + cheese.getVitaminB1() + " " + cheese.getFat());
			} else if (item instanceof Milk) {

				Milk milk = (Milk) item;
				System.out.println(item.getId() + " " + item.getDescription() + " " + item.getWeight() + " "
						+ item.getPrice() + " " + item.getMfg_Date() + " " + item.getUsebeforeinmonths() + " "
						+ sdf.format(item.getExpiryDate()) +" "+milk.getFatrate() + " " + milk.getMilktype());
			} else {

				Wheat wheat = (Wheat) item;
				System.out.println(item.getId() + " " + item.getDescription() + " " + item.getWeight() + " "
						+ item.getPrice() + " " + item.getMfg_Date() + " " + item.getUsebeforeinmonths() + " "
						+ sdf.format(item.getExpiryDate()) +" "+ wheat.getWheattype());
			}

		}
	}

}
