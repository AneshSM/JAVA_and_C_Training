package dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dto.Mobile;
import dto.Sim;

public class MobileController {
 
	static Scanner sc=new Scanner(System.in);
	static Mobile mbl;
	static Sim s;
	
	public static void main(String[] args) {
		 
		while(true) {
			System.out.println("\n1)Add data\n2)Get Mobile data\n3)Remove Mobile Data\n5)Exit\nEnter your choice");
			int ch=sc.nextInt();
			switch(ch) {
				case 1:
					mbl=new Mobile();
					System.out.println("Enter the Mobile Details");
					mbl.setName(sc.next());
					mbl.setModel(sc.next());
					System.out.println("Enter the number of Sims");
					int n=sc.nextInt();
					List<Sim> al=new ArrayList<Sim>();
					while(n>0) {
						s=new Sim();
						System.out.println("\nEnter the Sim type:");
						s.setType(sc.next());
						System.out.println("Enter the Sim provider name:");
						s.setProvider(sc.next());
						al.add(s);
						n--;
					}
					mbl.setList(al);
					MobileDAO.saveMobile(mbl);
					break;
				case 2:
					System.out.println("Enter the Mobile ID:");
					int gid =sc.nextInt();
					System.out.println(MobileDAO.GetByID(gid));
					break;
				case 3:
					System.out.println("Enter the Mobile ID:");
					int did =sc.nextInt();
					System.out.println(MobileDAO.DeleteByID(did));
					break;
				case 5:
					System.exit(0);
				default:System.out.println("Invalid choice");
			}
		}
		
	}
}
