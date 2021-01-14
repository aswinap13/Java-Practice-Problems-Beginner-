package com.itbulls.learnit.aswin.operations;

//change package if necessary!

import java.math.*;

//math package for pi

public class pi {
	
/* program prints value of pi as shown as following	
	3.1
	3.14
	3.146
	.....
	
*/

	public static void main(String[] args) {
		
		System.out.println("double : "+ String.format("%.1f", Math.PI));
		System.out.println("double : "+ String.format("%.2f", Math.PI));
		System.out.println("double : "+ String.format("%.3f", Math.PI));
		System.out.println("double : "+ String.format("%.4f", Math.PI));
		System.out.println("double : "+ String.format("%.5f", Math.PI));
	}

}
