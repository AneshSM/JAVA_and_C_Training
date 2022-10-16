package com.org.spring_core_annottaion.variable;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {
	public static void main(String[] args) {
	
		ConfigurableApplicationContext cac=new ClassPathXmlApplicationContext("annotation.xml");
		User u=(User)cac.getBean("myUser");
		u.getUser();
	}
}
