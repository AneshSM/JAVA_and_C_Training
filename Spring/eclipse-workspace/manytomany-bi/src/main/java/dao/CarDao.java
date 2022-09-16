package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dto.Car;
import dto.Feature;

public class CarDao {

	static EntityManagerFactory emf=Persistence.createEntityManagerFactory("mtm-bi");
	static EntityManager em;
	static EntityTransaction et;
	
	public static List<Car> saveCarDetails(List<Car> clist,List<Feature> flist) {
		
		em=emf.createEntityManager();
		et=em.getTransaction();
		
		et.begin();
		
		for(Car c:clist) {
			em.persist(c);
		}
		
		for(Feature f:flist) {
			em.persist(f);
		}
		
		et.commit();
		
		return clist;
	}
	
}
