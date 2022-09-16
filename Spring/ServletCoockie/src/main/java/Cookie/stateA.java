package Cookie;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "stateA")
public class stateA extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name=req.getParameter("cname");
		Cookie c=new Cookie("MyName",name);
		RequestDispatcher dispatcher=req.getRequestDispatcher("stateb");
		dispatcher.forward(req, resp);
	}
}
