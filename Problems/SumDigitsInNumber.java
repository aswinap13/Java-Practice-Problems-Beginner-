package com.itbulls.learnit.aswin.operations;

import java.util.Scanner;

public class SumDigitsInNumber {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter integer: ");
		int number = sc.nextInt();
		
		int sumOfDigits = sumDigitsInNumber(number);
		System.out.println(sumOfDigits);
	}

	public static int sumDigitsInNumber(int number) {
		int num=Math.abs(number); 
		int sum=0;
		int rem=0;
		
		while(num>0){
		    rem=num%10;
		    sum=sum+rem;
		    num=num/10;
		}
		return sum;
	}
}