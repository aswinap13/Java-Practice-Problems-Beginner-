package com.itbulls.learnit.aswin.operations;
import java.util.*;
public class switching {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter desired task");
		String s=scan.next();
		 switch(s) {
		 case "login":
			 System.out.println("Please, enter your username");
			 break;
		 case "sign_up":
			 System.out.println("Welcome!");
			 break;
		 case "terminate_program":
			 System.out.println("Thank you! Good bye!");
			 break;
		 case "main_menu":
			 System.out.println("Main menu");
			 break;
		 case "about_app":
			 System.out.println("This app is created by me with support of ®IT-Bulls.com");
			 break;
		 default:
		 System.out.println("Please, enter one of these values: login, sign_up, terminate_program, main_menu, about_app");
		 break;
		 }
	}

}
