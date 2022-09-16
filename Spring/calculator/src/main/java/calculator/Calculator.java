package calculator;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Calculator extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String op1=req.getParameter("op1");
		String op2=req.getParameter("op2");
		
		String c="";
		
		if(req.getParameter("add")!=null) {
			 c+=Integer.parseInt(op1)+Integer.parseInt(op2);
		}
		else if(req.getParameter("sub")!=null) {
			 c+=Integer.parseInt(op1)-Integer.parseInt(op2);
		}
		else if(req.getParameter("mul")!=null) {
			 c+=Integer.parseInt(op1)*Integer.parseInt(op2);
		}
		else if(req.getParameter("div")!=null) {
			if(Integer.parseInt(op2)==0)
					c+="not possible";
			else {
				c+=(double)(Integer.parseInt(op1)/Integer.parseInt(op2));
			}
		}
		else
			c+="Operands are needed.";
		
		op1="<html>\r\n"
				+ "<body>"
					+ "<table>\r\n"
					+ "		<caption>VALUE</caption>\r\n"
					+ "		<tr>\r\n"
					+ "			<th rowspan=\"3\" colspan=\"4\">"
									+ "<p >"
										+c
									+"</p>"
					+ "</th>\r\n"
					+ "		</tr>\r\n"
					+ "		</table>"
				+ "</body>\r\n"
			+ "</html>";
		
		PrintWriter pw=res.getWriter();
		pw.append(op1);
		
	}
}
