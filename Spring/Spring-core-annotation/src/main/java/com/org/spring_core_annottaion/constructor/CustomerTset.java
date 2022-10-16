package com.org.spring_core_annottaion.constructor;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomerTset {
	public static void main(String[] args) {
	
		ConfigurableApplicationContext cac=new ClassPathXmlApplicationContext("annotation.xml");
		Customer c=(Customer)cac.getBean("myCustomer");
		c.print(); 
	
	}
}
