package com.spring.student;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentTest {
	public static void main(String[] args) {
		
		BeanFactory bmf=new ClassPathXmlApplicationContext("spring.xml");
		
		Student s=(Student)bmf.getBean("StudentId");
		
		
		s.getStudent();	
	}
}
