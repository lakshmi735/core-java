package com.dev.app;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns = "/user")
public class StudentServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
	{
		String studentName=req.getParameter("studentName");
		String phoneNumber=req.getParameter("phoneNumber");
		String email=req.getParameter("email");
		PrintWriter wrt=new PrintWriter(res.getWriter());
		
		wrt.print("<html>"
				+"<body>"
				+"<h2>Student Information"+studentName+"</h2>"
				+"</body>"
				+"</html>");
		
		
	}

}
