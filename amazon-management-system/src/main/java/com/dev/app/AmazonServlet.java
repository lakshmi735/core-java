package com.dev.app;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns ="/user" )
public class AmazonServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
	{
		String customerName=req.getParameter("customerName");
		String phoneNumber=req.getParameter("phoneNumber");
		String email=req.getParameter("email");
		String address=req.getParameter("address");
		/*PrintWriter wrt=new PrintWriter(res.getWriter());
		
		
		wrt.print("<html>"
				+"<body>"
				+"<h2>amazon customer Information" + " "+customerName+"</h2>"
				+"</body>"
				+"</html>");*/
		req.setAttribute("na", customerName);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("amazon.jsp");
		dispatcher.forward(req, res);


}
}
