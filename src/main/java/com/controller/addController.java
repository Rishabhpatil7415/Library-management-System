package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Dao.BookDao;
import com.model.Book;

/**
 * Servlet implementation class BookDao
 */
public class addController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    /**
     * Default constructor. 
     */
    public addController() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request,response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	   String booname=request.getParameter("bookname");
	   int year=Integer.parseInt(request.getParameter("year"));
	   request.setAttribute("role1","Admin");
       BookDao bookdao=new BookDao();
       Book book=new Book();
       book.setBookname(booname);
       book.setYear(year);
       
       bookdao.addBook(book);
	    
       RequestDispatcher rd=request.getRequestDispatcher("viewController");  
       rd.forward(request, response);
       
	}

}
