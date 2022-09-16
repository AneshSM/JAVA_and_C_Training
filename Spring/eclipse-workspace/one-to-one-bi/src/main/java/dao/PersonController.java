package dao;

import dtao.Pan;
import dtao.Person;
import java.util.Scanner;

public class PersonController {
	
	static Scanner sc=new Scanner(System.in);
	static PersonDao pdao;
	static Person p;
	static Pan  pan;
	
	public static void main(String[] args) {
	
		while(true) {
			System.out.println("Enter your choice");
			int ch=sc.nextInt();
			switch(ch) {
			case 1:
				pdao=new PersonDao();
				p=new Person();
				pan=new Pan();
				
				pan.setPanNum(sc.next());
				pan.setPanaddress(sc.next());
				
				p.setPemail(sc.next());
				p.setPemail(sc.next());
				p.setP(pan);
				
				PersonDao.savePerson(p,pan);
				
				break;
			case 5:
				System.exit(0);
			default:
				System.out.println("Invalid choice");
			}
		}
	}
}
