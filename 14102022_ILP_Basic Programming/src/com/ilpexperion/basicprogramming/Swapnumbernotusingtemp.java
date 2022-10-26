package com.ilpexperion.basicprogramming;

import java.util.Scanner;

public class Swapnumbernotusingtemp {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int firstnum;
		int secondnum;
		System.out.println("Enter first number");
		firstnum=scanner.nextInt();
		System.out.println("Enter second number");
		secondnum=scanner.nextInt();
		firstnum=firstnum+secondnum;
		secondnum=firstnum-secondnum;
		firstnum=firstnum-secondnum;
		System.out.println("First number=" +firstnum);
		System.out.println("Second number="+secondnum);

	}

}
