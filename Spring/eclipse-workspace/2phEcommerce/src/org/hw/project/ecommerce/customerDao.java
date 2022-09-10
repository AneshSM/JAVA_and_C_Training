package org.hw.project.ecommerce;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class customerDao {
	
	Connection con=databaseConnection.getconnection();
	
	public void getAlldata() {
		String get="select * from customer";
		try {
			PreparedStatement ps=con.prepareStatement(get);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getLong(3));
			}
		}
		catch(SQLException e) {
			e.setNextException(e);
		}
	}
	
	public customer deleteCustomer(customer cus) {
		
		String d="delete from customer where id=?";
		try {
			PreparedStatement ps=con.prepareStatement(d);
			ps.setInt(1, cus.id);
			ps.execute();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return cus;
	}
	
	public customer saveCustomer(customer cus) {
		String insert="insert into customer values(?,?,?)";
		try {
			PreparedStatement ps=con.prepareStatement(insert);
			ps.setInt(1, cus.id);
			ps.setString(2,cus.name);
			ps.setLong(3,cus.phone);
			ps.execute();
			return cus;
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public customer updateCustomer(customer cus) {
		String update="update customer set name=? where id=?";
		
		try {
			PreparedStatement ps=con.prepareStatement(update);
			ps.setInt(2, cus.id);
			ps.setString(1, cus.name);
			ps.execute();
			return cus;
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}
