package com.ilpexperion.assignment;

import java.util.Scanner;

public class QS16 {

	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a string");
		String str = new String();
		str=scanner.nextLine();
		char ch,rech;
		
	      System.out.println("Sentence = "+str);
	      System.out.println("Enter a character to be replaced");  
	      ch=scanner.next().charAt(0);
	      System.out.println("Enter replaced character");  
	      rech=scanner.next().charAt(0);
	      System.out.println("Updated sentence = "+str.replace(ch, rech));
	}

}
