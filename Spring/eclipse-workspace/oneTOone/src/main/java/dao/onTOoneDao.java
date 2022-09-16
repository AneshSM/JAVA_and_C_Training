package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import oneTOone.Adhar;
import oneTOone.Person;

public class onTOoneDao {
	
	static EntityManagerFactory emf=Persistence.createEntityManagerFactory("onetoone");
	static EntityManager em;
	static EntityTransaction et;
	static Person p;
	static Adhar a;
	
	public Person savePersonAndAdhar(Person p, Adhar a) {
		// TODO Auto-generated method stub
		
		em=emf.createEntityManager();
		et=em.getTransaction();
		
		et.begin();
		em.persist(p);
		em.persist(a);
		et.commit();
		
		return p;
	}

	public Person getDataById(int id) {
		// TODO Auto-generated method stub
		
		em=emf.createEntityManager();
		et=em.getTransaction();
		p=em.find(Person.class, id);
		
		return p;
	}

	public void delteData(int id) {
		// TODO Auto-generated method stub
		
		em=emf.createEntityManager();
		et=em.getTransaction();
		
		p=em.find(Person.class, id);		
		if(p!=null && a!=null) {
			a=em.find(Adhar.class, p.getA());
			et.begin();
			em.remove(p);
			em.remove(a);
			et.commit();
		}else {
			System.out.println("Provide ID doesn't exists.");
		}
	}
	
	
	
}
