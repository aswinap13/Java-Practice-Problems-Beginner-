package com.itbulls.learnit.aswin.operations;
import java.util.Scanner;
public class AmountOfWords {

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