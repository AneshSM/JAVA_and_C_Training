package dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dto.Branch;
import dto.Student;

public class CollegeApp {
	
	static Scanner sc=new Scanner(System.in);
	static Student s;
	static Branch b;
	static List<Student> slist;
	
	public static void main(String[] args) {
		
		while(true) {
			System.out.println("Enter your choice:");
			int ch=sc.nextInt();
			switch(ch) {
				case 1:
					
					b=new Branch();
					
					System.out.println("Enter the college details:\nEnter the Branch name:");
					b.setBname(sc.next());
					
					System.out.println("Enter the number of students:");
					int n=sc.nextInt();
					
					slist=new ArrayList<Student>();
					
					for(int i=0;i<n;i++) {
						s=new Student();
						System.out.println("Enter the student name");
						s.setSnmae(sc.next());
						slist.add(s);
					}
					
					b.setSlist(slist);
					s.setB(b);
					
					CollegeDao.saveData(s);
					
					break;
				
				case 5:
					System.exit(0);
					
				default:
					System.out.println("Invalid choice");
			}
		}
		
	}
}
