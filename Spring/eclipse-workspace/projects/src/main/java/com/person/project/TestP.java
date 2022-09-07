package com.person.project;

//import java.util.Map;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.country.project.country;

public class TestP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext c1= new ClassPathXmlApplicationContext("com/person/project/person.xml");
		System.out.println(c1);
	}

}
