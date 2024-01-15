package com.JavaTutorial15_01_2024;

public class ArrayCoding {

	public static void main(String[] args) {
		
		 // create an array
		   int[] age = {12, 4, 5};
		   
		   // loop through the array
		   // using for loop
		   System.out.println("Using for Loop:");
		   for(int i = 0; i < age.length; i++) {
		     System.out.println(age[i]);
		   }
		   
		   int[] numbers = {2, -9, 0, 5, 12, -25, 22, 9, 8, 12};
		   int sum = 0;
		   Double average;
		   
		   // access all elements using for each loop
		   // add each element in sum
		   for (int number: numbers) {
		     sum += number;
		   }
		  
		   // get the total number of elements
		   int arrayLength = numbers.length;

		   // calculate the average
		   // convert the average from int to double
		   average =  ((double)sum / (double)arrayLength);

		   System.out.println("Sum = " + sum);
		   System.out.println("Average = " + average);
		   
		   

	        // create a 2d array
	        int[][] a = {
	            {1, 2, 3}, 
	            {4, 5, 6, 9}, 
	            {7}, 
	        };
	      
	        // calculate the length of each row
	        System.out.println("Length of row 1: " + a[0].length);
	        System.out.println("Length of row 2: " + a[1].length);
	        System.out.println("Length of row 3: " + a[2].length);

	        
	        int[][] a1 = {
	                {1, -2, 3}, 
	                {-4, -5, 6, 9}, 
	                {7}, 
	            };
	          
	            for (int i = 0; i < a1.length; ++i) {
	                for(int j = 0; j < a1[i].length; ++j) {
	                    System.out.println(a1[i][j]);
	                }
	            }
	            
	            
	}

}
