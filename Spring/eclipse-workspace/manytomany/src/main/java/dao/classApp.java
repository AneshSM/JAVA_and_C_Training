package dao;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dto.Student;
import dto.Subject;

public class classApp {

	static Scanner sc=new Scanner(System.in);
	static Student stu;
	static Subject sbj;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		while(true) {
			
			System.out.println("Enter your choice:");
			int ch=sc.nextInt();
			
			switch(ch) {
				case 1:
	
					List<Subject> sbjl=new ArrayList<Subject>();
					List<Student> stl=new ArrayList<Student>();
					
					System.out.println("\nEnter Details:\nEnter the Number of Students:");
					int sn=sc.nextInt();
					for(int i=0;i<sn;i++) {
						stu=new Student();
						System.out.println("Enter Student name:");
						stu.setSname(sc.next());
						System.out.println("Enter the number of Subjects");
						int n=sc.nextInt();
						for(int j=0;j<n;j++) {
							sbj=new Subject();
							sbj.setSbjname(sc.next());
							sbjl.add(sbj);
						}
						stu.setSbjlist(sbjl);
						stl.add(stu);
					}
					classdao.saveStudentAndSubject(stl);
					break;
				case 5:
					System.exit(0);
				default:
					System.out.println("Invalid Choice");
			}
		}
		
	}

}
