package com.itbulls.learnit.aswin.operations;
import java.util.Scanner;
public class EmptyRectangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter height of rectangle: ");
		int height = sc.nextInt();
		System.out.print("Please, enter width of rectangle: ");
		int width = sc.nextInt();
		
		drawRectangle(height, width);
	}

	public static void drawRectangle(int height, int width) {
		for(int i=1;i<height+1;i++){
		    for(int j=1;j<width+1;j++){
		        if((i==1) || (i==height)){
		            System.out.print("+");
		        }
		        else{
		            if((j==1)|| (j==width)) {
		            	System.out.print("+");}
		            else {
		            	System.out.print(" ");
		            }
		        }
		    }
		    System.out.println();
		}
	}

}

