package httpsession;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(value = "/home")
public class Home extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		HttpSession hs=req.getSession();
		PrintWriter pw=resp.getWriter();
		
		if(hs.getAttribute("myName")!=null) {
			
			RequestDispatcher rdisp=req.getRequestDispatcher("home.jsp");
			rdisp.forward(req, resp);
		}else {		
			pw.write("<html>"
					+ "<body>"
					+ "	<h1>"
					+ "		Login First"
					+ "	</h1>"
					+ "</body>"
					+ "</html>");
			RequestDispatcher rdisp=req.getRequestDispatcher("");
			rdisp.forward(req, resp);
		}
		
	}
}
