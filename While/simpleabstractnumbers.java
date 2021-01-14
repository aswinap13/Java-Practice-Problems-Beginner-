package com.itbulls.learnit.aswin.operations;

// simplest way of printing numbers in new line, jsut using inbuilt packages

import java.util.Scanner;

public class abstractnumbers {

	public static void main(String[] args) {
		
		System.out.println("Enter a number");
		
		Scanner scan=new Scanner(System.in);
    
		int int=scan.nextInt(); //Accepts integer
    
		
	/* Accepted integers are passed in to a character array. 
		Using for-each loop prints elements in the array; */
	
		for(char digit: int.toCharArray()){
		    System.out.println(digit);
		}
	}
		
