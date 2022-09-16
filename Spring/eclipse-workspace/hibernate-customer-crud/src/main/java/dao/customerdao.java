package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import dto.customer;

public class customerdao {
	
	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernate-customer-crud");
	static EntityManager em=emf.createEntityManager();
	static EntityTransaction et=em.getTransaction();

	public static customer saveCustomer(customer c) {

		if (c != null) {
			
			et.begin();
			em.persist(c);
			et.commit();
			System.out.println("---------------Data Stored---------------");

		} else {

			System.out.println("_______please set the data in customer");

		}
		return c;
	}
	
	public static customer deleteCustomer(int id ) {
				
		customer c=em.find(customer.class, id);
		et.begin();
		em.remove(c);
		et.commit();
		
		return c;
	}
	
	public static customer updateCustomer(customer c,int id) {
		
		customer c1=em.find(customer.class, id);
		if(c1!=null) {
			if(c!=null) {
				c1.setEmail(c.getEmail());
				et.begin();
				em.merge(c1);
				et.commit();
			}
			else {
				System.out.println("_______please set the data to be updated in customer");				
			}
		}else {
			System.out.println("Customer Id:"+id+"doesn't exist");
		}
	
		return c;
	}
	
	public static List<customer> displayData() {
		String q ="select c from customer c";

		Query Q=em.createQuery(q);
		List<customer> l=Q.getResultList();
		return l;
	}
	
	public static customer getDataByID(customer c) {
		c=em.find(customer.class, c.getId());
		return c;
	}
}
