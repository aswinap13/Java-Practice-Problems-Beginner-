package com.itbulls.learnit.aswin.operations;

//change package if necessary!

public class adminguest{

/* program accepts arguments from user(either admin or guest) and act accordingly */	
	
	public static void main(String[] args) {
		
		String inputArguments= String.join(",", args);
		String adminin="--admin";
		String guestin="--guest";
		
		if(inputArguments.contains(adminin)&& inputArguments.contains(guestin))
			System.out.println("Please select either admin or guest for this program");
		else if(inputArguments.contains(adminin))
			System.out.println("Helo Admin");
		else if(inputArguments.contains(guestin))
			System.out.println("Helo Guest");
		else
			System.out.println("NULL");
		
	}

}
