package dao;

import java.util.Scanner;

import oneTOone.Adhar;
import oneTOone.Person;

public class PAcontroller {
	
	static Person p;
	static Adhar a;
	static onTOoneDao o;
	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		while(true) {
			System.out.println("\n1)Save Person and Adhar details\n2)Retrive data through Id\n3)Delete data through Id\n4)Display\n5)Exit\nEnter your choice:");
			int ch=sc.nextInt(),id;
			
			switch(ch) {
				
				case 1:
					p=new Person();
					a=new Adhar();
					o=new onTOoneDao();
					
					a.setaNum(sc.nextLong());
					a.setAddress(sc.next());
					p.setName(sc.next());
					p.setEmail(sc.next());
					p.setA(a);
					
					o.savePersonAndAdhar(p,a);
					
					break;
				
				case 2:
					System.out.println("Enter the Id to retrive the Data");
					id=sc.nextInt();
					o=new onTOoneDao();
					p=o.getDataById(id);
					a=p.getA();
					System.out.println("\nName:"+p.getName()+"\nEmail:"+p.getEmail()+"\nAdhar Number:"+a.getaNum()+"\nAddress:"+a.getAddress());
					break;
					
				case 3:
					System.out.println("Enter the Id to delete the Data");
					id=sc.nextInt();
					o=new onTOoneDao();
					o.delteData(id);
					System.out.println("Data removed");
					break;
					
				case 5:
					System.exit(0);
					break;
					
				default:
					System.out.println("Ivalid choice");
					
			}
		}
		
	}

}
