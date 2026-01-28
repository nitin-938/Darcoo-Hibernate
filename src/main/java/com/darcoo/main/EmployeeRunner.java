package com.darcoo.main;


import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.Transaction;
import com.darcoo.Config.EmpConfiguration;
import com.darcoo.entity.Address;
import com.darcoo.entity.Employee;

public class EmployeeRunner {
	
	public static void main(String args[]) {

//		Employee emp1 = new Employee(); 
//		emp1.setName("Amit");
//		emp1.setGender("Male");
//		emp1.setSalary(50000);
//		
//		Address add1 = new Address();
//		add1.setCity("Noida");
//		add1.setState("UP");
//		
//		Address add2 = new Address();
//		add2.setCity("Mumbai");
//		add2.setState("Maharastra");
//		
//		Address add3 = new Address();
//		add3.setCity("Prayagraj");
//		add3.setState("UP");
//	 
//		ArrayList<Address> listOfAddresses = new ArrayList<>();
//		listOfAddresses.add(add1);
//		listOfAddresses.add(add2);		
//		listOfAddresses.add(add3);
		
		
//		emp1.setAddresses(listOfAddresses);
		
		Session session = EmpConfiguration.getSessionFactory().openSession();
//  	    Transaction tx = session.beginTransaction();
	    
//	    session.persist(add1);
//	    session.persist(add2);
//	    session.persist(add3);
//	    session.persist(emp1);
//	    tx.commit();
	  
	    Employee employee= session.find(Employee.class, 1);
	    System.out.println(employee);
	    System.out.println(employee.getAddresses()   );
	}	 
}


	


