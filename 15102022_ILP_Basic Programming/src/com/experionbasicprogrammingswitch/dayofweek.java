package com.experionbasicprogrammingswitch;

import java.util.Scanner;

public class dayofweek {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number;
		System.out.println("Enter a number ");
		number=scanner.nextInt();
		switch (number){
		case 1:System.out.println("MONDAY" );
				break;
		case 2:System.out.println("TUESDAY" );
				break;
		case 3:System.out.println("WEDNESDAY" );
				break;				
		case 4:System.out.println("THURSDAY" );
				break;
	    case 5:System.out.println("FRIDAY" );
				break;
	    case 6:System.out.println("SATURDAY" );
			    break;					
	    case 7:System.out.println("SUNDAY" );
				break;
	    default:System.out.println("INVALID CHOICE" );
		
		}
	}

}
