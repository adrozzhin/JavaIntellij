package com.syntax.class04;

public class AnotherNestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean isCompleted = true;
		int score = 65;

		if (isCompleted) {
			System.out.println("Let's check your grade");
			if (score > 90) {
				System.out.println("A student");
			} else if (score > 80) {
				System.out.println("B student");
			} else if (score > 70) {
				System.out.println("C student");
			} else {
				System.out.println("Please study more before test");
			}

		} else {
			System.out.println("You should have taken a class");

		}

	}

}
