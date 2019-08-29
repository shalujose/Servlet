package com.revature.Bankapp.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//response.getWriter().append("LoginServlet");
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		PrintWriter out=response.getWriter();
		out.println("Email : "+email);
		out.println("Password : "+password);
		boolean isValidUser=false;
		try {
			UserDAO userDAO=new UserDAO();
			isValidUser=userDAO.login(email, password);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		if(isValidUser) {
			response.sendRedirect("home.jsp");
			
		}
		else {
			response.sendRedirect("index.jsp?message=Invalid Login Credentials");
		}
	}

	
}
