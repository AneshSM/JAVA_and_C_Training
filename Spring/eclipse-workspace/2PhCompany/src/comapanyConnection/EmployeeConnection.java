package comapanyConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class EmployeeConnection {
	public static Connection getConnection() {
		String url="jdbc:mysql://localhost:3308/company";
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
