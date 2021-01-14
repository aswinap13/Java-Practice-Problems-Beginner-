package com.itbulls.learnit.aswin.operations;

//change the package if necessary

import java.util.Scanner;

public class PatternPyramid {
	
/* 	Program prints the following pattern depending upon the input user gives :
				* 
				* * 
				* * * 
				* * * * 
				* * * * * 
				* * * * * * 
				* * * * * 
				* * * * 
				* * * 
				* * 
				* 
	 	 	Here the user input = 6    				*/


	public static void main(String[] args) {
		
		System.out.println("Enter number");
		
		Scanner scan=new Scanner(System.in);
		
		int n=scan.nextInt();
		
		//For printing the upper incrementing pattern
		
		for (int i = 1; i < n + 1; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();	
		}
		
		// For printing the lower reducing pattern
		for(int p=0;p<n-1;p++) {
			for(int q=n-1;q>p;q--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
