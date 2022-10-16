package com.servlet.student.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.servlet.student.dao.StudentDao;
import com.servlet.student.dto.Student;

public class StudentUpdateController2 extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Student stud=new Student();
		
		stud.setStudId(Integer.parseInt(req.getParameter("sid")));
		stud.setStudName(req.getParameter("sname"));
		stud.setStudEmail(req.getParameter("smail"));
		
		StudentDao studDao=new StudentDao();
		
		studDao.updateStudent(0, getServletInfo());
		
	}
}
