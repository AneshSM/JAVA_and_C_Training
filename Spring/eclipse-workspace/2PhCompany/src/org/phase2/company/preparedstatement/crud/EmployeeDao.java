	package org.phase2.company.preparedstatement.crud;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import comapanyConnection.EmployeeConnection;

public class EmployeeDao {

	Connection connection=EmployeeConnection.getConnection();

	
	public void getAlldata(){
		String get="select * from employee";
		try {
			PreparedStatement ps=connection.prepareStatement(get);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getDouble(4));
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public Employee deleteEmployee(Employee emp) {
		
		String delete="delete from employee where id=?";
		try {
			PreparedStatement ps=connection.prepareStatement(delete);
			ps.setInt(1, emp.id);
			ps.execute();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return emp;
	}
	
	public Employee saveEmployee(Employee emp) {
		String insert="insert into employee values(?,?,?,?);";
		try {
				PreparedStatement ps=connection.prepareStatement(insert);
				ps.setInt(1, emp.id);
				ps.setString(2, emp.name);
				ps.setString(3,emp.email);
				ps.setDouble(4, emp.salary);
				ps.execute();
		}
		catch(SQLException e) {
				e.printStackTrace();
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return emp;
	}
	public Employee updateEmployee(Employee emp) {		
		String update="update employee set name=? where id=?";
		
		try {
			PreparedStatement ps=connection.prepareStatement(update);
			ps.setInt(2, emp.id);
			ps.setString(1,emp.name);
			ps.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return emp;
	}
}
