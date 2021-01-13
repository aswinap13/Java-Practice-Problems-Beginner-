package com.itbulls.learnit.aswin.operations;
import java.util.Scanner;
import java.lang.Math.*;
public class AreaOfTriangle {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		
		System.out.print("Please, enter A side of a triangle: ");
		int A=sc.nextInt();
		System.out.print("Please, enter B side of a triangle: ");
		int B=sc.nextInt();
		System.out.print("Please, enter C side of a triangle: ");
		int C=sc.nextInt();
		
		int p=(A+B+C)/2;
		double d=(p*(p-A)*(p-B)*(p-C));
		if(d>0) 
		{
			double triangleArea=Math.sqrt(d);
			System.out.println("Triangle area is: " + triangleArea);
		}
		else {
			System.out.println("NaN");
		}
}
}

