package com.inventory.dao;

import java.sql.Connection;

public interface DatabaseConnection {
	
	Connection getConnection();
	
	void closeConnection();

}
