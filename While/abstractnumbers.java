package com.itbulls.learnit.aswin.operations;

import java.util.Scanner;

public class abstractnumbers {

	public static void main(String[] args) {
		
		System.out.println("Enter a number");
		
		Scanner scan=new Scanner(System.in);
		
		int n=scan.nextInt();
		
		int reverse=0,digit=0;
		int m=n;
		
		while(m>0) {
			digit=m%10;
			reverse=reverse*10+digit;
			m=m/10;
		}
		
		m=reverse;
		digit=0;
		
		while(m>0) {
			digit=m%10;
			System.out.println(digit);
			m=m/10;
		}
		
		
	}

}
