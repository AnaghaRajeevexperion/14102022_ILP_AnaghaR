package lesrnanagha;

import java.util.Scanner;

public class Qstn15 {

	public static void main (String[] args) 
	{  
		Scanner scanner=new Scanner(System.in);
		int arr[]=new int[20];
		System.out.println("Enter the limit ")
		
		;  
		 int limit=scanner.nextInt();
		System.out.println("Enter the elements of the array: ");  
		for(int i=0; i<limit; i++)  
		{     
			arr[i]=scanner.nextInt();  
		}  
        int length = limit;  
        length = removeDuplicateElements(arr, length);
        System.out.println("After removing duplicates if any"); 
         for (int i=0; i<length; i++)  
            System.out.print(arr[i]+" ");  
	}
		public static int removeDuplicateElements(int arr[], int n)
		{  
	        if (n==0 || n==1){  
	            return n;  
	        }  
	        int[] temp = new int[n];  
	        int j = 0;  
	        for (int i=0; i<n-1; i++){  
	            if (arr[i] != arr[i+1]){  
	                temp[j++] = arr[i];  
	            }  
	         }  
	        temp[j++] = arr[n-1];     
	        // Changing original array  
	        for (int i=0; i<j; i++){  
	            arr[i] = temp[i];  
	        }  
	        return j;  
	    }  
	       
	    

	}
