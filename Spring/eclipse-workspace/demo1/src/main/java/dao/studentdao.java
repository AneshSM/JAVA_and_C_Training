package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dto.student;

public class studentdao {
	static EntityManagerFactory emf=Persistence.createEntityManagerFactory("amesh");
	static EntityManager em=emf.createEntityManager();
	static EntityTransaction et=em.getTransaction();
	public void saveData(student s) {
		et.begin();
		em.persist(s);
		et.commit();
		System.out.println("Data saved");
	}
	
	public void deleteData(int id) {
		student s=em.find(student.class, id);
		et.begin();
		em.remove(s);
		et.commit();
		System.out.println("Data deleted");
	}
	public void getById(int id) {
		student s=em.find(student.class, id);
			System.out.println(s.getName()+" "+s.getEmail()+" "+s.getPhone());
		}
	public void update(int id,int age) {
		student s=em.find(student.class, id);
		et.begin();
		s.setId(id);
		em.merge(s);
		et.commit();
		System.out.println("Data Updated");
	}
	
}
