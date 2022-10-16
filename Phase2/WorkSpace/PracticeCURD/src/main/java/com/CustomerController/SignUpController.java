package com.CustomerController;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.CustomerDao.CustomerDao;
import com.CustomerObject.Customer;

@WebServlet(value = "/signUpCon")
public class SignUpController extends HttpServlet {
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	Customer cus=new Customer();
	CustomerDao cd= new CustomerDao();	
		cus.setCusName(req.getParameter("cusName"));
		cus.setCusEmail(req.getParameter("cusEmail"));
		cus.setCusUsrName(req.getParameter("cusUsrName"));
		cus.setCusPassword(req.getParameter("cusPassw"));
		cus.setCusPhNo(Long.parseLong(req.getParameter("cusPhNo")));
		
		String res=cd.SignUp(cus);
		
		PrintWriter pw=resp.getWriter();
		
		pw.write("<html>"
				+ "	<body>"
				+ "		<h1>"
				+res
				+ "		</h1>"
				+ "	</body>"
				+ "</html>");
		
		RequestDispatcher reqdis=req.getRequestDispatcher("signUp.jsp");
		reqdis.include(req, resp);
		
	}
}
