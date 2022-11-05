package com.experion.entity;

public class Employee {

	private String empName;
	Address address;
	public Employee(String empName, Address address) {
		
		this.empName = empName;
		this.address = address;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
}
