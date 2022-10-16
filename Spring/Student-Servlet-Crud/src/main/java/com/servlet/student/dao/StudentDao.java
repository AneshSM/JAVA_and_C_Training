package com.servlet.student.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.servlet.student.dto.Student;

public class StudentDao {
Student s = new Student();
static EntityManagerFactory emf =  Persistence.createEntityManagerFactory("vikas");
static EntityManager em ;
static EntityTransaction et;
public Student saveStudent(Student student) {
	em = emf.createEntityManager();
	et = em.getTransaction();
	
	et.begin();
	em.persist(student);
	et.commit();
	
	return student;
	
}
public Student updateStudent(int id,String email) {
	em = emf.createEntityManager();
	et = em.getTransaction();
	Student s = em.find(Student.class, id);
	//Student s2 = em.find(Student.class, s.getStudId());
	s.setStudEmail(email);
	et.begin();
	em.merge(s);
	et.commit();
	return s;
	
}
public Student deleteStudent(int id) {
	em = emf.createEntityManager();
	et = em.getTransaction();
	Student s = em.find(Student.class, id);
	//Student s2 = em.find(Student.class, s.getStudId());
	et.begin();
	em.remove(s);
	et.commit();
	return s;	
}
public List<Student> getAllData() {
	em = emf.createEntityManager();
	String select = "Select s from Student s";
	Query query = em.createQuery(select);
	List<Student> list = query.getResultList();
	
	return list;
	
}
public static Student getById(int id) {
	em = emf.createEntityManager();
	Student s = em.find(Student.class, id);
	return s;
}
}
