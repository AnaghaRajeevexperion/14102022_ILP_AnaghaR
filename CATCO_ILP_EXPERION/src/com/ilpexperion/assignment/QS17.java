package com.ilpexperion.assignment;

import java.util.Scanner;

public class QS17
{

	public static void main(String[] args) 
	{
		String str;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a string");
		str=scanner.nextLine();
		 
        int count = 1;
 
        for (int i = 0; i < str.length() - 1; i++)
        {
            if ((str.charAt(i) == ' ') && (str.charAt(i + 1) != ' '))
            {
                count++;
            }
        }
        System.out.println("Number of words in the string : " + count);
    }

}


