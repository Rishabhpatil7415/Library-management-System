package com.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Dao.BookDao;
import com.Dao.UserDao;
import com.model.Admin;
import com.model.Book;
import com.model.User;

/**
 * Servlet implementation class viewController
 */
public class viewController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public viewController() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		   Object role=request.getAttribute("role1");
		  
		   BookDao bookdao=new BookDao();
	       List<Book> book1=bookdao.showBook();
	       request.setAttribute("booklist", book1); 
		   
	       System.out.println(role+"   ...........testing for role");
	      
	       
		   if(role.equals("user")) {
			   RequestDispatcher rd=request.getRequestDispatcher("view1.jsp");  
		       rd.forward(request, response);   
		   }
		   else {
			   RequestDispatcher rd=request.getRequestDispatcher("view.jsp");  
		       rd.forward(request, response);   
		   }
		
	}

}
