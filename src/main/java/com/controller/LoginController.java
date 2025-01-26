package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.Dao.UserDao;
import com.model.Admin;
import com.model.User;

/**
 * Servlet implementation class LoginController
 */
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username =request.getParameter("username");
		String password=request.getParameter("password");
		String role=request.getParameter("role");
    System.out.println(role+" "+"roll is?");
    
			   User user=new User();
			   user.setUsername(username);
			   user.setPassword(password);
			   user.setRole(role);
			   
			   Admin admin=new Admin();
			   admin.setUsername(username);
			   admin.setPassword(password);
			   
			   UserDao userdao=new UserDao();
			 
				   if(role.equals("user"))  {
				   
				   Boolean userpersent=userdao.getUser(user);
					  if(userpersent){
						  request.setAttribute("role1",role);
						   RequestDispatcher rd=request.getRequestDispatcher("/viewController");  
					       rd.forward(request, response);  
					   }
					  else {
						  RequestDispatcher rd=request.getRequestDispatcher("register.jsp");  
					       rd.forward(request, response);   
					  }
			     }
				   else {
						
					     Boolean adminpersent=userdao.getAdmin(admin);
						  if(adminpersent){
							   request.setAttribute("role1",role);
							   RequestDispatcher rd=request.getRequestDispatcher("/viewController");  
						       rd.forward(request, response);  
						   }
						  else {
							  RequestDispatcher rd=request.getRequestDispatcher("index.jsp");  
						       rd.forward(request, response);   
						  }
						  
					   }
		
	}

}
