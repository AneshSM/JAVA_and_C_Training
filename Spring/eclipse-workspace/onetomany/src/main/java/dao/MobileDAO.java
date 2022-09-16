package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dto.Mobile;
import dto.Sim;

public class MobileDAO {
	static EntityManagerFactory emf=Persistence.createEntityManagerFactory("otm");
	static EntityManager em;
	static EntityTransaction et;
	static Mobile mbl;
	public static Mobile saveMobile(Mobile m) {

		em=emf.createEntityManager();
		et=em.getTransaction();
		
		et.begin();
		em.persist(m);
		for(Sim s1:m.getList()) {
			em.persist(s1);
		}
		et.commit();
		
		return m;

	}
	
	public static String DeleteByID(int id) {
		String s="Id doesn't exists";
		
		em=emf.createEntityManager();
		et=em.getTransaction();
		mbl=em.find(Mobile.class, id);
		if(mbl!=null) {
		et.begin();
		em.remove(mbl);
		et.commit();
		s="Deleted Succesfully";
		}		
		return s;
	}
	
	public static String GetByID(int id) {
		
		String s = "Id doesn't exists";
		int i=1;
		em=emf.createEntityManager();
		et=em.getTransaction();
		mbl=em.find(Mobile.class, id);
		if(mbl!=null) {
			s="\nMobile Details:\nNmae: "+mbl.getName()+"\tModel: "+mbl.getModel()+"\n\nSim Details\nNumber of Sims: "+mbl.getList().size();
			for(Sim s1:mbl.getList()) {
				s+="\n"+i+++")Sim Provider: "+s1.getProvider()+"\tType: "+s1.getType();
			}
		}
		return s;
	}
}
