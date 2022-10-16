package org.alvas.service;

import org.alvas.dao.StudentDao;
import org.alvas.dto.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value = "MyServices")
public class StudentService {

	@Autowired
	StudentDao sdao;
	
	public Student saveStudent(Student stud) {
		if(stud.getId()>100)
			return sdao.saveStudent(stud);
		else
		{
			System .out.print("Invalid ID");
			return null;
		}
	}
	
}
