package org.hw.project.ecommerce;

import java.util.Scanner;

public class customerApp {
	
	static Scanner sc=new Scanner(System.in);
	static customerDao dao=new customerDao();
	static customer cus=new customer();
	
	public static void InsertData() {
		System.out.println("Enter the ID of Emloyee:");
		cus.id=sc.nextInt();
		System.out.println("Enter the Name of Emloyee:");
		cus.name=sc.next();
		System.out.println("Enter the Phone Number of Emloyee:");
		cus.phone=sc.nextLong();

		if(dao.saveCustomer(cus)!=null) {
			System.out.println("\n Data Stored");
		}else {
			System.out.println("\nInavalid data");
		}
	}
	public static void UpdateData() {
		System.out.println("Enter the ID of Emloyee:");
		cus.id=sc.nextInt();
		System.out.println("Enter the new Name of Emloyee to update:");
		cus.name=sc.next();
		if(dao.updateCustomer(cus)!=null) {
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
		cus.id=sc.nextInt();
		dao.deleteCustomer(cus);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) {
			System.out.println("1)Insert data\n2)Update data\n3)Show data\n4)Delete data\n5)Exit\n\nEnter your choice:");
			int n=sc.nextInt();
			switch(n) {
			case 1:
				InsertData();
				System.out.println();
				break;
			case 2:
				UpdateData();
				System.out.println();
				break;
			case 3:
				System.out.println("Stored Data");
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
