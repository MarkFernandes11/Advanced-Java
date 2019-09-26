package com.data;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DatabaseData
 */
@WebServlet("/DatabaseData")
public class DatabaseData extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DatabaseData() {
        super();

    }

	@SuppressWarnings("static-access")
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		UserData data = new UserData();
		
		
		@SuppressWarnings("unchecked")
		List<User> userList = data.userData();
		
		/*
		 * for(User u : userList) { System.out.println(u.getName()); }
		 */
		System.out.println(userList.size()+" "+userList);
		
		request.setAttribute("userlist", userList);
		
		//request.getRequestDispatcher("Welcome.jsp").forward(request, response);
		
		response.sendRedirect("Welcome.jsp");
	}

}











