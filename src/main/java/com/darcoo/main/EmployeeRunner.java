package com.darcoo.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.darcoo.entity.Employee;


public class EmployeeRunner {
	
	public static void main(String[]args) {
		
		Employee emp = new Employee(1,"vinod","Male",33333);
		
		Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
	    SessionFactory sesionFactory	= cfg.buildSessionFactory();
	    Session session= sesionFactory.openSession();
	    Transaction tx = session.beginTransaction();
	    
	    
	    session.persist(emp);
	    tx.commit();
	    
		
	}	 
}


	


