package com.mainproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.SQLSyntaxErrorException;
import java.sql.Statement;
import java.util.Scanner;

public class Company {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc=new Scanner(System.in);
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","root");
			Statement s=con.createStatement();
			s.executeUpdate("create database Company");
		} 
		catch (SQLException e) {
			// TODO: handle exception
			System.out.println(e);
			try {
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Company","root","root");
				Statement s=con.createStatement();
				s.executeUpdate("create table employee(eid int,ename varchar(20),age int,salary double)");
			} 
			catch (SQLSyntaxErrorException e2) {
				System.out.println(e2);
				
			}			
		}

	}
}
