package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Dao.UserDao;
import com.model.User;

/**
 * Servlet implementation class registerController
 */
public class registerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public registerController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	      doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String role=request.getParameter("role");
		String username=request.getParameter("username");
		String password=request.getParameter("password");
	    int mobile=Integer.parseInt(request.getParameter("mobile"));
		String address=request.getParameter("address");
		
		System.out.println("register page"+" "+role);
		
		User user=new User(username,password,mobile,address,role);
		
		UserDao userdao=new UserDao();
		userdao.addregisterUser(user);
		System.out.println("register successfully...");
		
		RequestDispatcher rd=request.getRequestDispatcher("/index.jsp");  
	    rd.forward(request, response);  
	}

}
