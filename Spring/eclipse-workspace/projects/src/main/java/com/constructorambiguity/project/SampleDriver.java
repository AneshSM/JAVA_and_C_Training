package com.constructorambiguity.project;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SampleDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext  c1 = new ClassPathXmlApplicationContext("com/constructorambiguity/project/Sample.xml");
		System.out.println(c1.getBean("ghij"));
	}

}
