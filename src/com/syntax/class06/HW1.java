package com.syntax.class06;

import java.util.Scanner;

public class HW1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your home country");
		String country = scan.nextLine();
		String language = null;

		
		switch (country) {
		
		case "USA":
			language="English";
			break;
		case "Russia":
			language="Russian";
			break;
		case "Germany":
			language="German";
			break;
		case "France":
			language="French";
			break;
		default:
			language="Invalid";
		}
		if (!(language.equals("Invalid"))) {
		System.out.println("Your native language is " + language);
	}
	}
}
