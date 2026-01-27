package com.darcoo.main;

import org.hibernate.Session;
import org.hibernate.Transaction;
import com.darcoo.Config.EmpConfiguration;
import com.darcoo.entity.Address;
import com.darcoo.entity.Employee;

public class EmployeeRunner {
	
	public static void main(String args[]) {
		
//		Employee emp1 = new Employee("Milan","Male",8865);
//		Address add1 = new Address ("GZD","UP");
	
		Employee emp1 = new Employee();
		emp1.setName("Amit");
		emp1.setGender("Male");
		emp1.setSalary(50000);
		
		Address add1 = new Address();
		add1.setCity("Noida");
		add1.setState("UP");
		add1.setEmployee(emp1);
		
		emp1.setAddress(add1);
		
		
		Session session = EmpConfiguration.getSessionFactory().openSession();
	    Transaction tx = session.beginTransaction();
	    session.persist(add1);
	    session.persist(emp1);
	    tx.commit();
	  
	    Employee employee = session.find(Employee.class,1);
		System.out.println(employee);
		System.out.println(employee.getAddress());
		
		Address address = session.find(Address.class,1);
		System.out.println(address);
		System.out.println(address.getEmployee());
	    
//	    Query<Employee> query= session("from emp",Employee.class);
//	    System.out.println(query.list());
	
	    
	}   
		
}	 



	


