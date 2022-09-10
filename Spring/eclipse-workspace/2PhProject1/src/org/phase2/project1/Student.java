package org.phase2.project1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Student {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url="jdbc:mysql://localhost:3308/ph2project1";
			String username="root";
			String password="root";
			try {
				Connection  con=DriverManager.getConnection(url,username,password);
				//System.out.println(con);
				
				//String createDB="create database ph2project1";
//				String createTL="create table Student(id int(11)primary key,name varchar(20),marks int(11))";
				//String insert="insert into Student values(2,\"Bcd\",50)";
				//String update="update Student set marks=100 where id=2";
//				String retrive="select *from Student";
//				String delete="delete from Student where id=2 ";
				Statement s1=con.createStatement();
//				int r2=s1.executeUpdate(delete);
//				ResultSet r=s1.executeQuery(retrive);
//				while(r.next()) {
//					System.out.println(r.getInt(1)+" "+r.getString(2)+" "+r.getInt(3));
//				}
				
			}
			catch(SQLException se) {
				System.out.println(se);
			}
		}
		catch(ClassNotFoundException e) {
			System.out.println(e);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
