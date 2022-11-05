package com.employee.utility;

import com.employee.entity.Address;
import com.employee.entity.Employee;
import com.employee.service.Service;

public class utility {

	public static void main(String[] args) 
	{
		Address address= new Address("Trivandrum");
		Employee employee=new Employee("Anagha","address");
		
		
		Service .createEmployee();
		
		Service.displayEmpDetails();
		

	}

}


















