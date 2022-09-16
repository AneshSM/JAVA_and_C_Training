package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dto.Branch;
import dto.Student;

public class CollegeDao {
	
	static EntityManagerFactory emf=Persistence.createEntityManagerFactory("mto");
	static EntityManager em;
	static EntityTransaction et;
	
	public static Student saveData(Student s2) {
		// TODO Auto-generated method stub
		
		em=emf.createEntityManager();
		et=em.getTransaction();

		et.begin();
		em.persist(s2.getB());
		for(Student s:s2.getB().getSlist())
			em.persist(s);
		et.commit();
		
		return s2;
	}
	
	

}
