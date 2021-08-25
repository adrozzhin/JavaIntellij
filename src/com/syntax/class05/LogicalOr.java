package com.syntax.class05;

import java.util.Scanner;

public class LogicalOr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * define a day
		 * if day is Monday or Friday --> No class
		 * if day is Tuesday or Wednesday --> manual class
		 * if day is Thursday -> review class
		 * if day is Saturday or Sunday
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("What day is today?");
		
		String day = scan.nextLine();
		
		if (day.equals("Monday") || day.equals("Friday")) {
			System.out.println("We have no class at Syntax");
		} else if (day.equals("Tuesday") || day.equals("Wednesday")) {
			System.out.println("Today is Manual class");
		} else if (day.equals("Thursday")) {
			System.out.println("Today is Review class");
		} else if (day.equals("Saturday") || day.equals("Sunday")) {
			System.out.println("Today is Java class");
		} else {
			System.out.println("Wrong input");
		}

	}

}
