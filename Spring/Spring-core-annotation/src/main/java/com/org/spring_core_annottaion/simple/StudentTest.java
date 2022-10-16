package com.org.spring_core_annottaion.simple;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentTest {
	public static void main(String[] args) {
		ConfigurableApplicationContext cap=new ClassPathXmlApplicationContext("annotation.xml");
		Student s=(Student) cap.getBean("myStudent");
		s.getStudent();
	}
}
