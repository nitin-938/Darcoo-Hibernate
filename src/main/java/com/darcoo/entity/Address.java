package com.darcoo.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private int h_No;
	private String city,state;
	
	
    @ManyToOne
	private  Employee employee;
	
	public Address() {
		super();
		
	}
		
	public Address( String city, String state) {
		super();
		this.city = city;
		this.state = state;
	}
	
	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	
	public int getH_No() {
		return h_No;
	}

	
	public void setH_No(int h_No) {
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
