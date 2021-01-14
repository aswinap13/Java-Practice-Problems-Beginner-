package com.itbulls.learnit.aswin.operations;

import java.util.Scanner;

public class abstractnumbers {

	public static void main(String[] args) {
		
		System.out.println("Enter a number");
		
		Scanner scan=new Scanner(System.in);
    
    int int=scan.nextInt();
    
    for(char digit: int.toCharArray()){
    System.out.println(digit);
    }
		
