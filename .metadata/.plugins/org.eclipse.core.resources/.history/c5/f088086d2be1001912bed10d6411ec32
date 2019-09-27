package com.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegistrationServlet
 */
@WebServlet("/RegistrationServlet")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public RegistrationServlet() {
        super();
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		UserRegistration userReg = new UserRegistration();
		
		System.out.println("check");
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String firstname = request.getParameter("firstname");
		String lastname = request.getParameter("lastname");
		String email = request.getParameter("email");
		String contactNumber = request.getParameter("contactNumber");
		String password = request.getParameter("password");
		//System.out.println(firstname);
		//System.out.println(lastname);
		//System.out.println("check");
		boolean status = UserRegistration.RegisterUser(firstname,lastname,email,contactNumber,password);
		System.out.println(status);
		if(status)
		{
			response.sendRedirect("login.jsp");
		}
		else
		{
			response.sendRedirect("register.jsp");
		}
		
	}

}

//String confirmPassword = request.getParameter("confirmPassword");

//user.setFirstname(firstname);
//user.setLastname(lastname);
//user.setEmail(email);
//user.setContactNumber(contactNumber);
//user.setPassword(password);		
//userReg.RegisterUser(user);