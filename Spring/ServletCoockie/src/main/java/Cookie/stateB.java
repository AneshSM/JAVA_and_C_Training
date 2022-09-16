package Cookie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "stateb")
public class stateB extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String str=null;
		Cookie[] cookies=req.getCookies();
		PrintWriter pw=resp.getWriter();
		for(Cookie c:cookies) {
			if(c.getValue()!=null) {
				str="<html>"
						+ "<body>"
						+ "		<h1>"
						+c.getName()
						+" "
						+c.getValue()
						+ "		</h1>"
						+ "</body>"
					+ "</html>";
				pw.append(str);
			}
		}
	}
}
