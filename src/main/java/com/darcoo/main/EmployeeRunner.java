package com.darcoo.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.MutationQuery;
import org.hibernate.query.Query; 
import com.darcoo.Config.EmpConfiguration;
import com.darcoo.entity.Employee;


public class EmployeeRunner {
	
	public static void delById(int id , Session session) {
//		HQL delete query
		
		MutationQuery query = session.createMutationQuery("delete from emp where id = 15");
		 query.setParameter("id", id); 
		query.executeUpdate();
	}
	
	public static void main(String[]args) {
		
		Employee emp1 = new Employee("Anjali","Female",50000,"India");
		Employee emp2= new Employee("shivam","male",520000,"India");
		Employee emp3 = new Employee("Avya","Female",54000,"India");
		Employee emp4 = new Employee("Anuj","male",550000,"India");
		Employee emp5 = new Employee("sumit","male",70000,"India");
		Employee emp6 = new Employee("renu","Female",70000,"India");
		Employee emp7 = new Employee("Anjali","Female",50000,"India");
		Employee emp8= new Employee("shivam","male",520000,"India");
		
		
		Session session = EmpConfiguration.getSessionFactory().openSession();
	    Transaction tx = session.beginTransaction();
	    
//	    session.persist(emp1);
//	    session.persist(emp2);
//	    session.persist(emp3);
//	    session.persist(emp4);
//	    session.persist(emp5);
//	    session.persist(emp6);
//	    session.persist(emp7);
//	    session.persist(emp8);
	    
	    	    
	    
//	    1-Example of HQL to get all the records
	    
	    Query<Employee>query = session.createQuery("from emp",Employee.class);
//	    List list = query.list();
//	     
//		System.out.println(list);	
	    
	    
//	    HQL to get record with pagination 
	    
//	    query.setFirstResult(3);
//	    query.setMaxResults(7);
//	    System.out.println(query.list());	
	    
//	    HQl to  get by using named highest word in paragraph
	    
//	     Query q = session.createQuery("select max(name) from emp");
//	     List list = q.list();
//		 System.out.println(list);	
	    
		
//		HQL update query using named paragrph
	    
//	    MutationQuery mutationQuery = session.createMutationQuery("update emp to set name=:n where id =:i");
//	     mutationQuery.setParameter("n", "Pankaj");
//	     mutationQuery.setParameter("i","1");
//	     System.out.println("status: "+ mutationQuery.executeUpdate());	
//	     
	     
//	     by Gender
		    
//		    MutationQuery mutationQuery1 = session.createMutationQuery("update emp to set gender=:n where id =:i");
//		     mutationQuery1.setParameter("n", "Pankaj");
//		     mutationQuery1.setParameter("i","1");
//		     System.out.println("status: "+ mutationQuery.executeUpdate());	
//		     
	    
	 
//	     By Salary
			    
//			    MutationQuery mutationQuery2 = session.createMutationQuery("update emp to set salary=:n where id =:i");
//			     mutationQuery2.setParameter("n", "Male");
//			     mutationQuery2.setParameter("i","1");
//			     System.out.println("status: "+ mutationQuery1.executeUpdate());	

	    
//	    HQL Delete Query
	    
//	    MutationQuery query1 = session.createMutationQuery("delete from emp where id = 17");
//	    query1.executeUpdate();
//	    
	    Query query2 = session.createQuery("from emp",Employee.class);
	    List list = query2.list();
	    System.out.println(list);
	    
	    
	    
		session.persist(emp1);
	    tx.commit();
	    session.close();
	    
	   
		
	}	 
}


	


