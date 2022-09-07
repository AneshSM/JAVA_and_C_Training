package com.comapany.projects;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class yami {
	private static ClassPathXmlApplicationContext c1;

	public static void main(String[] args) {
		c1 = new 
				ClassPathXmlApplicationContext("com/comapany/projects/springConfig.xml");
		System.out.println(c1.getBean("abc"));
	}
}
