package com.ilpexperion.assignment;



import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;



public class Q19_NumberOfDays {



   public static void main(String[] args) {
        // TODO Auto-generated method stub



       
        Scanner scanner = new Scanner(System.in);    
        
        String firstDate="";
        String secondDate="";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");



       System.out.println("Enter the first date:");
        firstDate = scanner.nextLine();
        System.out.println("Enter the second date:");
        secondDate = scanner.nextLine();



       final LocalDate firstLocalDate = LocalDate.parse(firstDate, formatter);
        final LocalDate secondLocalDate = LocalDate.parse(secondDate, formatter);
        final long numberOfDays = ChronoUnit.DAYS.between(firstLocalDate, secondLocalDate);
        System.out.println("Number of days between "+firstDate+" and "+secondDate+" is "+numberOfDays);



   }



}