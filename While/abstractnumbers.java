package com.itbulls.learnit.aswin.operations;

//change package if necessary!

import java.util.Scanner;

public class abstractnumbers {
	
/* Program starts and asks user to enter integer number
	Program prints each digit from the new line */
	

	public static void main(String[] args) {
		
		System.out.println("Enter a number");
		
		Scanner scan=new Scanner(System.in);
		
		int n=scan.nextInt();
		
		int reverse=0,digit=0;
		int m=n;
		
		//To reverse the given integer
		
		while(m>0) {
			digit=m%10;
			reverse=reverse*10+digit;
			m=m/10;
		}
		
		m=reverse;
		digit=0;
		
		//To print the numbers, each one in seperate lines
		
		while(m>0) {
			digit=m%10;
			System.out.println(digit);
			m=m/10;
		}
		
		
	}

}
