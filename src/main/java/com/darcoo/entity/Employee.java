package com.darcoo.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne; 

@Entity
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id; 
	private String name;
	private String gender;
	private int salary; 
	
	@OneToMany(cascade = CasecadeType.All)
	private List<Address> addresses;
	
	public Employee() {
		super();
	}
	
	public Employee(String name, String gender, int salary) {
		super();
		this.name = name;
		this.gender = gender;
		this.salary = salary;
	}
 
	public List<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

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



	
	

}
  
