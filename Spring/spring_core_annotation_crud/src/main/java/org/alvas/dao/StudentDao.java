package org.alvas.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.alvas.dto.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StudentDao {

	@Autowired
	Student s;
	
	@Autowired
	EntityManagerFactory emf;
	@Autowired
	EntityManager em;
	@Autowired
	EntityTransaction et;
	
	public Student saveStudent(Student stud) {
		
		em=emf.createEntityManager();
		et=em.getTransaction();
		
		et.begin();
		em.persist(stud);
		et.commit();
		
		return s;
		
	}
}
