package com.syntax.class05;

public class LogicalEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean understandJava = true;
		boolean enjoy = true;

		if (understandJava && enjoy) {
			System.out.println("That is awesome");
		} else {
			System.out.println("Please try to spend more time studying");
		}

		/*
		 * declare a number if number is larger than 1 and smaller than 10 -->10 -->
		 * SMALL if number is larger than 10 and smaller than 100 --> MEDIUM if number
		 * is larger than 100 and smaller than 1000 --> LARGE
		 */

		int num = 0;

		if (num > 0) {
			if (num >= 1 && num < 10) {
				System.out.println("Number is small");
			} else if (num >= 10 && num < 100) {
				System.out.println("Number is medium");
			} else if (num >= 100 && num < 1000) {
				System.out.println("Number is large");
			} else {
				System.out.println("Number is huge");
			}
		} else {
			System.out.println("number is either 0 or negative");
		}
	}

}
