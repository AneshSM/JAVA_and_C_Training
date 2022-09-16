package controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dao.CarDao;
import dto.Car;
import dto.Feature;

public class CarController {

	static Scanner sc=new Scanner(System.in);
	static Car c;
	static Feature f;
	static List<Car> cList;
	static List<Feature> fList;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		while(true) {
			System.out.println("Enter your choice:");
			int ch=sc.nextInt();
			switch(ch) {
			case 1:
				cList=new ArrayList<Car>();
				fList=new ArrayList<Feature>();
				System.out.println("Enter the number of car:");
				int cn=sc.nextInt();
				for(int i=0;i<cn;i++) {
					c=new Car();
					System.out.println("Enter the Car Name:");
					c.setCarName(sc.next());
					System.out.println("Enter the Car Price:");
					c.setCarPrice(sc.nextDouble());
					System.out.println("Enter the number of Feature:");
					int fn=sc.nextInt();
					for(int j=0;j<fn;j++) {
						f=new Feature();
						System.out.println("Enter the Feature Name:");
						f.setFeatureName(sc.next());
						f.setCarList(cList);
						fList.add(f);
					}
					c.setFeatureList(fList);
					cList.add(c);
				}
				
				CarDao.saveCarDetails(cList, fList);
				
				break;
			case 5:
				System.exit(0);
			default:
				System.out.println("Invalid Choice");
			}
		}
		
	}

}
