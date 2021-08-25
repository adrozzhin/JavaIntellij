package com.syntax.class04;

public class Diploma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean diploma = true;
		double gpa = 3.4;

		if (diploma) {
			System.out.println("Congratulations");

			if (gpa >= 3.5) {
				System.out.println("You are eligible for schoolarship");
			} else {
				System.out.println("You should have studied harder");
			}

		} else {
			System.out.println("Please get your degree");
		}

	}

}
