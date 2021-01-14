package com.itbulls.learnit.aswin.operations;
import java.util.Scanner;
public class PatternPyramid {

	public static void main(String[] args) {
		
		System.out.println("Enter number");
		
		Scanner scan=new Scanner(System.in);
		
		int n=scan.nextInt();
		
		for (int i = 0; i < n ; i++) {
			for (int j = 0; j <= i ; j++) {
			  System.out.print("* ");
			}
			System.out.println();
		}
		for(int p=0;p<n-1;p++) {
			for(int q=n-1;q>p;q--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

}
