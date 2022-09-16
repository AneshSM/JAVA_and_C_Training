package dto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class EmployeeController {

	public static void mian(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("anesh");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Employee emp=new Employee();
		
		emp.setName("Abcd");
		emp.setEmail("abcd123@gmail.com");
		
		et.begin();
		em.persist(emp);
		et.commit();
		
	}
	
}
