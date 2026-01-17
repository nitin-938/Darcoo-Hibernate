package com.darcoo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "Employee")
public class Employee {
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id; 
	 @Column(name = "e_Name")
	private String name;
	private String   gender;
	private int salary;

	
	public int getId() {
		return id;
	}


	public String getName() {
		return name;
	}


	public String getGender() {
		return gender;
	}


	public int getSalary() {
		return salary;
	}


	public void setId(int id) {
		this.id = id;
	} 


	public void setName(String name) {
		this.name = name;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}

	

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", gender=" + gender + ", salary=" + salary + "]";
	}

	public Employee(String name, String gender, int salary) {
		super();
		this.name = name;
		this.gender = gender;
		this.salary = salary;
	}


	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}


	public void saveEmp(Employee emp) {
		// TODO Auto-generated method stub
		
	}
	
	

}
  