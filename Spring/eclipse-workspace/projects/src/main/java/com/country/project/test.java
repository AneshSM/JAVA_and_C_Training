package com.country.project;

import java.util.Map;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext c1 = new ClassPathXmlApplicationContext("com/country/project/country.xml");
		country c2 = (country)c1.getBean("abcd");
		System.out.println(c2);
		Map<String,String> m1 = c2.getStateandlanguage();
		System.out.println(m1.getClass());
	}

}
