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
 * Servlet implementation class editController
 */
public class editController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public editController() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		   int bookid=Integer.parseInt(request.getParameter("bookid"));
		   String bookname=request.getParameter("bookname");
		   int year=Integer.parseInt(request.getParameter("year"));
		  
		   
		   request.setAttribute("role1","Admin");

	       BookDao bookdao=new BookDao();
	       Book book=new Book();
	       book.setBookid(bookid);
	       book.setBookname(bookname);
	       book.setYear(year);
	       
	   
		   System.out.println(bookid+"       is null?"+book.getYear());
		
		   bookdao.editBook(book,bookid);
		
		   RequestDispatcher rd=request.getRequestDispatcher("/viewController");  
	       rd.forward(request, response);
	}

}
