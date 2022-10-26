package com.ilpexperion.basicprogramming;

import java.util.Scanner;

public class swapnumberusingtemp {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int firstnum;
		int secondnum;
		int temp;
		System.out.println("Enter first number");
		firstnum=scanner.nextInt();
		System.out.println("Enter second number");
		secondnum=scanner.nextInt();
		temp=firstnum;
		firstnum=secondnum;
		secondnum=temp;
		System.out.println("First number=" +firstnum);
		System.out.println("Second number="+secondnum);

	}

}
