package com.itbulls.learnit.aswin.operations;

public class adguest {

	public static void main(String[] args) {
		String inputArguments= String.join(",", args);
		String adminin="--admin";
		String guestin="--guest";
		if(inputArguments.contains(adminin)&& inputArguments.contains(guestin))
			System.out.println("Please select either admin or guest for this program");
		else if(inputArguments.contains(adminin))
			System.out.println("Helo Admin");
		else if(inputArguments.contains(guestin))
			System.out.println("Helo GUest");
		else
			System.out.println("NULL");
		
	}

}
