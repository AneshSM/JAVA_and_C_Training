package com.servlet.student.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.servlet.student.dao.StudentDao;
import com.servlet.student.dto.Student;

public class StudentUpdateController1 extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		Integer id=Integer.parseInt(req.getParameter("id"));
		
		Student stud=StudentDao.getById(id);
		
		if(stud!=null) {
			RequestDispatcher rdisp=req.getRequestDispatcher("");
			
		}else {
			
		}
		
	}
}
