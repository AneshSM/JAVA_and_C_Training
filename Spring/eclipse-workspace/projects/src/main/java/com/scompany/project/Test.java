package com.scompany.project;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext c1= new ClassPathXmlApplicationContext("com/scompany/project/Employee.xml");
		System.out.println(c1.getBean("xyz"));
	}
}
