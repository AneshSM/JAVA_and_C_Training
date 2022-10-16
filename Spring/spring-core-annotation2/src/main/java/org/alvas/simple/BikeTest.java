package org.alvas.simple;

import org.alvas.MyConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BikeTest {

	public static void main(String[] args) {
		ApplicationContext ac=new AnnotationConfigApplicationContext(MyConfig.class);
		Bike b=(Bike)ac.getBean("myBike");
		b.getBike();
	}
	
}
