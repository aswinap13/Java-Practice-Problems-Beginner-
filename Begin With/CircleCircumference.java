package com.itbulls.learnit.aswin.operations;

// change pakckage if necessary!

import java.util.Scanner;

public class CircleCircumference {
	
/* program accepts radius of circle as input from the user and calculates the circumference */	
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter circle radius: ");
		
		int radius=sc.nextInt();
		
		double circleCircumference=(double)(2*3.14*radius);

		System.out.println("Circle circumference is: " + circleCircumference);
	}
    
}
