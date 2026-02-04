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
//		Employee emp2 = new Employee(); 
//		emp2.setName("Shivam");
//		emp2.setGender("Male");
//		emp2.setSalary(70000);
//		
//		Employee emp3 = new Employee(); 
//		emp3.setName("Avya");
//		emp3.setGender("Female");
//		emp3.setSalary(50000);
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
//		
//		ArrayList<Employee> listOfEmployees = new ArrayList<>();
//		listOfEmployees.add(emp1);
//		listOfEmployees.add(emp2);		
//		listOfEmployees.add(emp3);
//		
//		emp1.setAddresses(listOfAddresses);
//		emp2.setAddresses(listOfAddresses);
//		emp3.setAddresses(listOfAddresses);
//		
//		add1.setEmployee(listOfEmployees);
//		add2.setEmployee(listOfEmployees);
//		add3.setEmployee(listOfEmployees);
		
		
		Session session = EmpConfiguration.getSessionFactory().openSession();
  	    Transaction tx = session.beginTransaction();
//	    
//	    session.persist(add1);
//	    session.persist(add2);
//	    session.persist(add3);
//	   
//
//	    session.persist(emp1);
//	    session.persist(emp2);
//	    session.persist(emp3);
	   
//	    tx.commit();
//	    session.close();

	    Employee employee= session.find(Employee.class, 1);
	    System.out.println(employee);
    System.out.println(employee.getAddresses());
	}	 
}


	


