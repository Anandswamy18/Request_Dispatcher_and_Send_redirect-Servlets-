package request_dispatcher;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/rd")
public class ClassA extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		
		String name=req.getParameter("name");
		System.out.println("Class a name is"+" "+ name);
		
//		PrintWriter pout=res.getWriter();
//		pout.print("<a href='b'>click here<a/>");
		
		
		 RequestDispatcher rd =req.getRequestDispatcher("b");
		 rd.forward(req, res);
		
		
		
		
		
	}
	

}
