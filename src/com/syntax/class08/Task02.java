package com.syntax.class08;

import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		String answer;

		do {
			System.out.println("Apply credit card");
			answer = scan.nextLine();
		} while (!answer.equalsIgnoreCase("yes"));
		System.out.println("Thank you for applying");

	}

}
