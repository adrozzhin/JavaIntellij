package com.syntax.class03;

public class IfElseIfStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * what is the largest number
		 */

		int num1 = 20;
		int num2 = 20;

		if (num1 > num2) {
			System.out.println(num1 + " is larger than " + num2);
		} else if (num1 < num2) {
			System.out.println(num1 + " is smaller than " + num2);
		} else {
			System.out.println(num1 + " is equal to " + num2);
		}

		System.out.println("--------------------------------------------");
		/*
		 * Declare a variable day and then based on the day value provide output such as
		 * if day is equal to 1 --> Today is Monday if day is equal to 1 --> Today is
		 * Tuesday
		 */

		int day = 8;

		if (day == 1) {
			System.out.println("Today is Monday");
		} else if (day == 2) {
			System.out.println("Today is Tuesday");
		} else if (day == 3) {
			System.out.println("Today is Wednesday");
		} else if (day == 4) {
			System.out.println("Today is Thursday");
		} else if (day == 5) {
			System.out.println("Today is Friday");
		} else if (day == 6) {
			System.out.println("Today is Saturday");
		} else if (day == 7) {
			System.out.println("Today is Sunday");
		} else 
			System.out.println("Wrong number");
		

	}

}
