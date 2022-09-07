package com.lastproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
//import java.sql.Statement;
import java.util.Scanner;

public class DeleteValue {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con1= DriverManager.getConnection("jdbc:mysql://localhost:3306/lastdatabase","root","root");
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a student id to delete:");
		int id=sc.nextInt();
		PreparedStatement ps = con1.prepareStatement("delete from student where sid="+id);
		for(int i=1;i<=1;i++) {
			ps.executeUpdate();
		}
		sc.close();
}
}
