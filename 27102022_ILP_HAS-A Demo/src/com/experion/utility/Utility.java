package com.experion.utility;

import com.experion.entity.Address;
import com.experion.entity.Employee;
import com.experion.service.Service;

public class Utility {

	public static void main(String[] args) {


		Employee employee = Service.createEmployee();
		Service.displayEmployeeDetails(employee);
	}

}



