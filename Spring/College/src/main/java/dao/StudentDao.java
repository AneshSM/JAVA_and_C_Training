package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dto.Student;


public class StudentDao {

  static EntityManagerFactory emf=Persistence.createEntityManagerFactory("");
  static EntityManager em=emf.createEntityManager();
  static EntityTransaction et=em.getTransaction();
  
  public Student saveStudent(Student student)
  {
    return student;
    
  }

  
  
}