package com.darcoo.main;

import org.hibernate.Session;


import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.hibernate.query.Query;
import com.darcoo.Config.EmpConfiguration;
import com.darcoo.entity.Employee;


public class EmployeeRunner {
	
	public static void main(String[]args) {
		
		Employee emp1 = new Employee("Anjali","Female",50000,"India");
		Employee emp2= new Employee("shivam","male",520000,"India");
		Employee emp3 = new Employee("Avya","Female",54000,"India");
		Employee emp4 = new Employee("Anuj","male",550000,"India");
		Employee emp5 = new Employee("sumit","male",70000,"India");
		Employee emp6 = new Employee("renu","Female",70000,"India");
		
		
		Session session = EmpConfiguration.getSessionFactory().openSession();
	    Transaction tx = session.beginTransaction();
//	   
//	    session.persist(emp1);
//	    session.persist(emp2);
//	    session.persist(emp3);
//	    session.persist(emp4);
//	    session.persist(emp5);
//	    session.persist(emp6);
//	    tx.commit();
	    
	    Query<Employee>query = session.createQuery("from emp",Employee.class);
//	    
//	   
		System.out.println(query.list());
//		
	}	 
}


	


