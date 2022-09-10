package org.phase2.company.preparedstatement.crud;

import java.util.Scanner;

public class EmployeeApp {
	
	static Scanner sc=new Scanner(System.in);
	static EmployeeDao dao=new EmployeeDao();
	static Employee emp=new Employee();
	
	public static void InsertData() {
		System.out.println("Enter the ID of Emloyee:");
		emp.id=sc.nextInt();
		System.out.println("Enter the Name of Emloyee:");
		emp.name=sc.next();
		System.out.println("Enter the Email of Emloyee:");
		emp.email=sc.next();
		System.out.println("Enter the Salary of Emloyee:");
		emp.salary=sc.nextDouble();
		
		if(dao.saveEmployee(emp)!=null) {
			System.out.println("\n Data Stored");
		}else {
			System.out.println("\nInavalid data");
		}
	}
	public static void UpdateData() {
		System.out.println("Enter the ID of Emloyee:");
		emp.id=sc.nextInt();
		System.out.println("Enter the new Name of Emloyee to update:");
		emp.name=sc.next();
		if(dao.updateEmployee(emp)!=null) {
			System.out.println("\nData Updated");
		}else {
			System.out.println("\nInvalid data");
		}
	}
	public static void ShowData() {
		dao.getAlldata();
		System.out.println();
	}
	public static void DeleteData() {
		System.out.println("Enter the Id of Employee to delete the data:");
		emp.id=sc.nextInt();
		dao.deleteEmployee(emp);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) {	
			System.out.println("1)Insert data\n 2)Update data\n3)Show data\n4)Delete data\n5)Exit\n\nEnter your Choice:");
			int n=sc.nextInt();
			switch(n){
				case 1:
					InsertData();
					System.out.println();
					break;
				case 2:
					UpdateData();
					System.out.println();
					break;
				case 3:
					System.out.println("Store Data");
					ShowData();
					System.out.println();
					break;
				case 4:
					DeleteData();
					System.out.println("Data Deleted\n");
					break;
				case 5:
					System.out.println("Exited!!");
					System.exit(0);
					break;
				default:System.out.println("Invalid choice");
			}
		}
	}

}
