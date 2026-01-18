package com.darcoo.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.MutationQuery;
import org.hibernate.query.Query; 
import com.darcoo.Config.EmpConfiguration;
import com.darcoo.entity.Employee;


public class EmployeeRunner {
	

	public static void main(String[]args) {
		
		Session session = EmpConfiguration.getSessionFactory().openSession();
	    Transaction tx = session.beginTransaction();

	    
//	    MutationQuery namedQuery = session.createNamedMutationQuery("updateAnEmployee");
//	    namedQuery.setParameter("n","Karan");
//	    namedQuery.setParameter("i",5);
//	    namedQuery.executeUpdate();
	    
	    MutationQuery namedQuery = session.createNamedMutationQuery("deleteEmployeeById");
	    namedQuery.setParameter("i",11);
	    namedQuery.executeUpdate();
	
	    
	    Query query1 = session.createQuery("from emp",Employee.class);
	    List list = query1.list();
	    System.out.println(list);

	    tx.commit();
	    session.close();
	    
	   
		
	}	 
}


	


