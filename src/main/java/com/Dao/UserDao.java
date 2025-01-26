package com.Dao;

import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.model.Admin;
import com.model.Book;
import com.model.User;

public class UserDao {

	SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	
	public void addregisterUser(User user) {
	     try {
			 Session session=null;
			 Transaction tx=null;
			 
			 session=sf.openSession();
			 tx=session.beginTransaction();
			 
			 session.save(user);
			 
			 tx.commit();
			 session.close();
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public Boolean getAdmin(Admin admin) {
		 Session session=null;
	     Transaction tx=null;
	     
	     session=sf.openSession();
	     tx=session.beginTransaction();
	     
	     List<Admin> query= session.createQuery("from Admin",Admin.class).list();
	     
	     tx.commit();
	     session.close();
	     for(Admin admin1 :query)
	     {
	    	 if(admin1.getUsername().equals(admin.getUsername()) && admin1.getPassword().equals(admin.getPassword()));
	    	 {
	    		 return true;
	    	 }
	     }
	     
		return false;
	}

	public Boolean getUser(User user) {
		 Session session=null;
	     Transaction tx=null;
	     
	     session=sf.openSession();
	     tx=session.beginTransaction();
	    
	     List<User> query= session.createQuery("from User",User.class).list();
	    
	     tx.commit();
	     session.close();
	     
	     for(User user1 :query)
	     {    
	    	 if(user1.getUsername().equals(user.getUsername()) && user1.getPassword().equals(user.getPassword()))
	    	 {
	    		 return true;
	    	 }
	     }
	     
		return false;
	}

	

	
}
