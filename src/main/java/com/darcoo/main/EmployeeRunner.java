package com.darcoo.main;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.darcoo.Config.EmpConfiguration;
import com.darcoo.entity.Employee;


public class EmployeeRunner {
	
	public static void main(String[]args) {
		
		Employee emp = new Employee("Akash","male",90000);
		
		
		Session session = EmpConfiguration.getSessionFactory().openSession();
	    Transaction tx = session.beginTransaction();
	   
	    session.persist(emp);
	    tx.commit();
	    
		
	}	 
}


	


