package com.bridgelabz.login;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
@WebServlet("/login")
public class Login extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
       
    public Login() {
        super();
        
    }
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		UserDAOImplementation userDao = new UserDAOImplementation();
		
		PrintWriter out = response.getWriter();
		
		String username = request.getParameter("email");
		String passwordCheck = request.getParameter("password");
		String submitType = request.getParameter("submit");
		System.out.println("submitType = "+submitType);
		boolean userLogin= false;
		
		// Get the username and password from user and check in the database
		Users user = userDao.getFromDatabase(username, passwordCheck);
		try {
			userLogin = userDao.checkUser(username, passwordCheck);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("userLogin "+userLogin);
		
		if(username==null || passwordCheck==null)
		{
			userLogin = false;
			response.sendRedirect("index.jsp");
		}
					
		// if submitType equals login and dB is not empty and username is not null
		if(userLogin)
		{
			response.sendRedirect("Success.jsp");			
		}
		else if(submitType.equals("register"))
		{
			user.setName(request.getParameter("Name"));
			user.setEmail(username);
			user.setPassword(passwordCheck);			
			userDao.insertUserIntoDatabase(user);
			response.sendRedirect("index.jsp");
			
		}
		else 
		{
			request.setAttribute("messageError", "Data not found, need to register first");
			response.sendRedirect("index.jsp");
			
		}
			
	}
}
