package Student;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;

public class Student extends GenericServlet {
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		
		System.out.println(name);
		System.out.println(email);
		
		String html=" <html>"
						+ "<body>"
							+ "<h1>"
									+name
									+"<br> "
									+email
							+ "</h1>"
						+ "</body>"
					+ "</html> ";
		
		PrintWriter pw=res.getWriter();
		pw.append(html);
	
	}
}
