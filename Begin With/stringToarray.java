package com.itbulls.learnit.aswin.operations;
import java.util.Scanner;
public class stringToarray {

	public static void main(String[] args) {
		System.out.println("Enter any text");
		Scanner sc= new Scanner(System.in);
		String s= sc.next();
		char[] ch=s.toCharArray();
		for (char c : ch) { 
            System.out.print(c); 
        } 
	}

}
