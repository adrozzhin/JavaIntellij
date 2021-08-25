package com.syntax.class05;

import java.util.Scanner;

public class Season {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your month of birth");
		
		String month = scan.nextLine();
		
		String season = "";
		
		if (month.equals("December") || month.equals("January") || month.equals("February")) {
			season = "Winter";
		} else if (month.equals("March") || month.equals("April") || month.equals("May")) {
			season = "Spring";
		} else if (month.equals("June") || month.equals("July") || month.equals("August")) {
			season = "Summer";
		} else if (month.equals("September") || month.equals("October") || month.equals("November")) {
			season = "Autumn";
		} else {
			System.out.println("Wrong month name");
		}
		if (!season.isEmpty()) {
			System.out.println("You were born in: " + season);
		}
		
	}

}
