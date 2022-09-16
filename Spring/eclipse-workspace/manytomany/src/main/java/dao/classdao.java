package dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dto.Student;
import dto.Subject;

public class classdao {

	static EntityManagerFactory emf=Persistence.createEntityManagerFactory("mtm");
	static EntityManager em;
	static EntityTransaction et;
	
	public static String saveStudentAndSubject(List<Student> stl) {
		// TODO Auto-generated method stub
		String s="Data added Succesfully";
		
		em=emf.createEntityManager();
		et=em.getTransaction();
		
		List<Student> studebrList=new ArrayList<Student>();
		List<Subject> subjextList=new ArrayList<Subject>();
		
		et.begin();
		
		et.commit();
		
		return s;
	}

}
