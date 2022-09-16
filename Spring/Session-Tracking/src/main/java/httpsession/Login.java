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

@WebServlet(value = "/login")
public class Login extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		HttpSession hs=req.getSession();
		
		String username=req.getParameter("un");
		String password=req.getParameter("pass");
		PrintWriter pw=resp.getWriter();
		if(username.equals("4AL19CS010") && password.equals("12345")) {
			hs.setAttribute("myName", username);
			RequestDispatcher rdisp=req.getRequestDispatcher("/home");
			rdisp.forward(req, resp);
		}
		else {
			pw.write("<htm>"
					+ "	<body>"
					+ "		<h1>"
					+ "			First Login"		
					+ "		</h1>"
					+ "	</body>"
					+ "</html>");
			RequestDispatcher rdisp=req.getRequestDispatcher("login.jsp");
			rdisp.include(req, resp);
		}
	}
}
