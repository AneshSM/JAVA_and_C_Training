package dao;

import java.util.List;
import java.util.Scanner;

import dto.customer;

public class customerApp {

	static Scanner sc = new Scanner(System.in);
	static customer c;
	static boolean state = true;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		while (state) {

			System.out.println(
					"\n\n1)Add Data\n2)Delete data\n3)Update data\n4)Display data\n5)Get specific data\n6)Exit\nEnter your choice:");
			int ch = sc.nextInt(), id;
			String name, email;
			long PhNo;

			switch (ch) {
				case 1:
					c = new customer();
					System.out.println("Enter the Customer Name:");
					name = sc.next();
					System.out.println("Enter the Customer Email:");
					email = sc.next();
					System.out.println("Enter the Customer Phone Number");
					PhNo = sc.nextLong();
	
					c.setName(name);
					c.setEmail(email);
					c.setPhone(PhNo);
	
					customerdao.saveCustomer(c);
					System.out.println("Data strored");
					break;
				case 2:
	
					System.out.println("Enter the Customer Id:");
					id = sc.nextInt();
	
					customerdao.deleteCustomer(id);
					System.out.println("Data removed");
					break;
				case 3:
					System.out.println("Enter the Customer Id:");
					id = sc.nextInt();
	
					c = new customer();
					;
	
					System.out.println("Enter the Customer Email:");
					email = sc.next();
	
					c.setEmail(email);
					customerdao.updateCustomer(c, id);
					System.out.println("Data updated sucessfully");
					break;
	
				case 4:
					List<customer> l = customerdao.displayData();
					for (customer c : l) {
						System.out.println("\nName:" + c.getName() + "\tEmail:" + c.getEmail() + "\tPhone Number:"
								+ c.getPhone() + "\n");
					}
	
					break;
	
				case 5:
					System.out.println("Enter the Customer Id:");
					id = sc.nextInt();
					c = new customer();
					;
					c.setId(id);
					c = customerdao.getDataByID(c);
					System.out.println(
							"\nName:" + c.getName() + "\tEmail:" + c.getEmail() + "\tPhone Number:" + c.getPhone() + "\n");
					break;
					
				case 6:
					System.exit(0);
					break;
	
				default:
					System.out.println("Invalid choice");
			}

		}
	}

}
