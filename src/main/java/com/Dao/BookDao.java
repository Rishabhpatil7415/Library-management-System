package com.Dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

import com.model.Book;

public class BookDao {
 
	SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	
	public void addBook(Book book) {
		
		    Session session = null;
			Transaction tx=null;
			
			session =sf.openSession();
			tx=session.beginTransaction();  
		
			session.save(book);
			
			tx.commit();
			session.close();
		
		
	}
	
	public void editBook(Book book,int id){
		try {
			Session session=null;
			Transaction tx=null;
		
			session=sf.openSession();
			tx=session.beginTransaction(); 
			
			Query q=session.createQuery("update Book set bookname=:n ,year=:y where bookid=:i");
			q.setParameter("n",book.getBookname());
			q.setParameter("y",book.getYear());
			q.setParameter("i",id);
			int status=q.executeUpdate();
			System.out.println(status);
		
			
			tx.commit();  
			session.close();
			
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
			
	}

	public List<Book> showBook() {
		    try {
				Session session=null;
				Transaction tx=null;
				 Book book=new Book();
				 session=sf.openSession();
				
				    Query<Book> query = session.createQuery("from Book", Book.class);
				    return query.list();
			} catch (HibernateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		   
return null;
		    }
	
	public void deleteBook(int id) {
	   Session session =null;
	   Transaction tx=null;
	   
	   session=sf.openSession();
	   tx=session.beginTransaction(); 
	   Book book=(Book) session.createCriteria(Book.class).add(Restrictions.eq("id",id)).uniqueResult();
	   session.delete(book);
	   tx.commit();
	   session.close();                    
	} 
	
	}


