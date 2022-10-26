package com.ilpexperion.assignment;

import java.util.Arrays;
import java.util.Scanner;

public class QS12 {

	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		int arr[]=new int[5];
		System.out.println("Enter the limit ");  
		 int n=scanner.nextInt();
		System.out.println("Enter the elements of the array: ");  
		for(int i=0; i<n; i++)  
		{     
			arr[i]=scanner.nextInt();  
		}  
		
		 for (int i = 0; i < n; i++) {     
	            for (int j = i+1; j < n; j++) {     
	               if(arr[i] < arr[j]) {    
	                   int temp = arr[i];    
	                   arr[i] = arr[j];    
	                   arr[j] = temp;    
	               }     
	            }     
	        }    
	        

	        
		   
	        System.out.println("Elements of array sorted in descending order: ");    
	        for (int i = 0; i < n; i++)
	        {     
	            System.out.println(arr[i] + " ");    
	        }  
	        
	    }    
}


	
