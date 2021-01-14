package com.itbulls.learnit.aswin.operations;

//change package if necessary!

import java.util.Arrays;
import java.util.Scanner;
public class FindMaxInt {
	
/* program accepts number of inputs from the user and returns the maximum of it */	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter integer numbers separated by space: ");
	
	   String numbers=sc.nextLine(); //scanning the numbers in to string
	   String numberstring[]=numbers.split(" "); // converting string to string array  [split is to split the string at special points delimitter which is mentioned inside]
		
	   int[] intArray=new int[numberstring.length]; //converting the string array into an integer array
		
	   for(int i=0;i<numberstring.length;i++) {
		   intArray[i]=Integer.parseInt(numberstring[i]);
	   }
	   
	   int maxInt=findMaxIntInArray(intArray);
	
		System.out.println("*** Initial Array ***");
		System.out.println(Arrays.toString(intArray));
		System.out.println("*** Max number in array ***");
		System.out.println(maxInt);
	}

	
	public static int findMaxIntInArray(int[] intArray) {
		
		//finding maximum among the array
		
		int maxInt=0;
		for(int i=0;i<intArray.length;i++)
		{
			if(maxInt<intArray[i]) {
				maxInt=intArray[i];
			}
		}
		return maxInt;
	}
}

	
