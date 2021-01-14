package com.itbulls.learnit.aswin.operations;

//change package if necessary

import java.util.Scanner;
public class AmountOfWords {
	
/* program calculates the number of words in a string input by the user */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter any text: ");
		
		String string=sc.nextLine();
	
	    int amountOfWords=getWordsAmount(string);
	
		System.out.println("Amount of words in your text: " + amountOfWords);
	}

	private static int getWordsAmount(String text) {
		String str[]=text.split("");
		return str.length;
	}
}

/* 
 Consider the below code! it don't use array or any additional conversions - this is the simplified one of above code

public class AmountOfWords {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter any text: ");
		String userInput = sc.nextLine();
		
		int amountOfWords = getWordsAmount(userInput);
		System.out.println("Amount of words in your text: " + amountOfWords);
	}

	public static int getWordsAmount(String text) {
		return text.split("[\\p{P}\\s]+").length;
	}
}
*/
