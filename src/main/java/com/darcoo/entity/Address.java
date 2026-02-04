package com.darcoo.entity;


import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;


@Entity
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private int h_No;
	private String city,state;

	@ManyToMany
	private List<Employee>employee;
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
		
	public Address( String city, String state) {
		super();
		this.city = city;
		this.state = state;
	}

	
	public int getH_No() {
		return h_No;
	}

	public List<Employee> getEmployee() {
		return employee;
	}

	public void setH_No(int h_No) {
		this.h_No = h_No;
	}

	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}

	public int geth_No() {
		return h_No;
	}


	public void seth_No(int h_no) {
		this.h_No = h_No;
	}

	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	@Override
	public String toString() {
		return "Address [h_no=" + h_No + ", city=" + city + ", state=" + state +  "]";
	}

	

	

	
}
