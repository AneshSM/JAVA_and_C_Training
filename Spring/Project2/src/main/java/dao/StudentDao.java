package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.mysql.cj.protocol.Resultset;

import antlr.collections.List;
import dto.Student;


public class StudentDao {

	static EntityManagerFactory emf=Persistence.createEntityManagerFactory("");
	static EntityManager em=emf.createEntityManager();
	static EntityTransaction et=em.getTransaction();
	
	public Student saveStudent(Student student)
	{
		et.begin();
		em.persist(student);
		et.commit();
		return student;
	}

	public void updateStudent(Integer studentid, String studentmail) {
		// TODO Auto-generated method stub
		Student s= em.find(Student.class, studentid);
		
		et.begin();
		em.merge(studentmail);
		et.commit();
	}
	
	public List<Student> getAllStudent(){
		
		String s="select s from student s";
		
		Query q=em.createQuery(s);
		
		=q.getResultList();
	}
}
