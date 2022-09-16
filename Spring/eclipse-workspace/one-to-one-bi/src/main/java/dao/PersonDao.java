package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dtao.Pan;
import dtao.Person;

public class PersonDao {

	static EntityManagerFactory emf=Persistence.createEntityManagerFactory("");
	static EntityManager em;
	static EntityTransaction et;
	
	public static Person savePerson(Person p, Pan pan) {
		// TODO Auto-generated method stub
		
		em=emf.createEntityManager();
		et=em.getTransaction();
		
		et.begin();
		em.persist(pan);
		em.persist(p);
		et.commit();
		
		return p;
		
	}

}
