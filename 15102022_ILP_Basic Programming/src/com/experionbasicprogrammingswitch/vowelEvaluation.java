package com.experionbasicprogrammingswitch;

import java.util.Scanner;

public class vowelEvaluation {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		char ch;
		System.out.println("Enter a character");
		ch=scanner.next().charAt(0);
		switch(ch)
		{
			case 'a':System.out.println(ch+" is a vowel" );
					break;
			case 'A':System.out.println(ch+" is a vowel" );
			break;
			case 'E':System.out.println(ch+" is a vowel" );
			break;
			case 'e':System.out.println(ch+" is a vowel" );
					break;
			case 'I':System.out.println(ch+" is a vowel" );
			break;
			case 'i':System.out.println(ch+" is a vowel" );
					 break;
			case 'O':System.out.println(ch+" is a vowel" );
			break;		 
			case '0':System.out.println(ch+" is a vowel" );
					 break;
			case 'U':System.out.println(ch+" is a vowel" );
			break;
		    case 'u':System.out.println(ch+" is a vowel" );
					 break;
		    default:System.out.println(ch+ " is not a vowel" );
		}
		
		
		

	}

}
