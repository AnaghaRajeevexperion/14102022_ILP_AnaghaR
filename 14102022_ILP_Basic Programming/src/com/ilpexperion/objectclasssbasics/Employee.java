package com.ilpexperion.objectclasssbasics;

public class Employee {
	String employeeName="Anagha";
	int employeeAge=23;
	char employeeGender='F';
	double employeeCgpa= 8.6;
	
	public void displayEmployeeDetails()
	{
		System.out.println("***********Welcome to ILP Program**********");
		System.out.println("Name" +"    " + "Age" +"    " +"Gender" +"   " +"CGPA");
		System.out.println(employeeName + "  "+ employeeAge +"      "+ employeeGender + "        "+employeeCgpa);
	}
}
