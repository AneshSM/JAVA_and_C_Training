package org.hw.project.ecommerce;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class databaseConnection {
	public static Connection getconnection() {
		String url="jdbc:mysql://localhost:3308/ecommerce";
		String username="root";
		String password="root";
		try {
			Connection con=DriverManager.getConnection(url,username,password);
			return con;
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}
