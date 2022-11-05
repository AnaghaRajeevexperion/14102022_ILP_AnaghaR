package com.experion.service;

import com.experion.entity.Address;
import com.experion.entity.Employee;

public class Service {

	public static Employee createEmployee() {
		Address address = new Address("DNRA 23C","Trivandrum");
		Employee employee = new Employee("Anagha",address);
		
		return employee;
	}

	public static void displayEmployeeDetails(Employee employee) {
		
		System.out.println("Employee Name"+"		"+"House No."+"		"+"City");
		System.out.println(employee.getEmpName()+"		"+employee.getAddress().getHouseNo()+"		"+employee.getAddress().getCity());

	}

}
