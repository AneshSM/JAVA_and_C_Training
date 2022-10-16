package org.alvas.controller;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.alvas.Myconfig;
import org.alvas.dto.Student;
import org.alvas.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StudentController {
	@Autowired
	static Student s;
	@Autowired
	static StudentService sServ;
	@Autowired 
	static EntityManagerFactory emf;
	
	public static void main(String[] args) {
		emf=Persistence.createEntityManagerFactory("myStudent");
		
		ApplicationContext ac=new AnnotationConfigApplicationContext(Myconfig.class);
		
		sServ=(StudentService) ac.getBean("MyServices");
		s=(Student) ac.getBean("myStudent");
		
		s.setId(101);
		s.setName("Abcd");
		s.setEmail("abcd@gmail.com");
		
		sServ.saveStudent(s);
	}
}
