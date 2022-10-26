package com.experion.assignment;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Q19_NumberOfDays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//**************** Throwing DateTimeParseException ******************//

		Scanner scanner = new Scanner(System.in);	
	
        String firstDate="";
        String secondDate="";

        System.out.println("Enter the first date:");
        firstDate = scanner.nextLine();
        System.out.println("Enter the second date:");
        secondDate = scanner.nextLine();
       
    
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/mm/yyyy");
        LocalDate firstLocalDate = LocalDate.parse(firstDate, formatter);
        LocalDate secondLocalDate = LocalDate.parse(secondDate, formatter);
        
//        System.out.println(firstLocalDate);
//        System.out.println(secondLocalDate);

        long numberOfDays = Duration.between(firstLocalDate, secondLocalDate).toDays();
        System.out.println("Number of days between "+firstDate+"and "+secondDate+"is "+numberOfDays);
	}

}
