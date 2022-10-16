package com.CustomerDao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

import com.CustomerObject.Customer;

public class CustomerDao {

	public String SignUp(Customer c) {
		String s="Username Already Exists";
		
		try {
			Customer cus;
			EntityManagerFactory emf=Persistence.createEntityManagerFactory("vikas");
			EntityManager em;
			EntityTransaction et;
			
			em=emf.createEntityManager();
			et=em.getTransaction();
			cus =em.find(Customer.class, c.getCusUsrName());
			if(cus==null) {
				et.begin();
				em.persist(c);
				et.commit();
				s="Saved Successfully";
			}
		}
		catch(PersistenceException e) {
			e.printStackTrace();
		}
		return s;
		
	}
	
	public Customer SigIn(Customer c) {
		try {
			Customer cus;
			EntityManagerFactory emf=Persistence.createEntityManagerFactory("vikas");
			EntityManager em;
			EntityTransaction et;
			
		em=emf.createEntityManager();
		et=em.getTransaction();
		
		cus =em.find(Customer.class, c.getCusUsrName());
		
		if(cus!=null) {
			et.begin();
			em.persist(c);
			et.commit();
		}		}
		catch(PersistenceException e) {
			e.printStackTrace();
		}
		return c;
		
	}
}
