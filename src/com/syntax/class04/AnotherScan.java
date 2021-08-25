package com.syntax.class04;

import java.util.Scanner;

public class AnotherScan {

	/*
	 * next() - is used to capture a String value before space nextLine() - is used
	 * to capture String value (full line including spaces)
	 */

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// capture first and last name

		System.out.println("Please enter your name");

		String name = input.nextLine();

		System.out.println("Please enter your last name");

		String lastName = input.nextLine();

		System.out.println("Please enter your counrty");

		String country = input.next();

		System.out.println("Nice to meet you " + name + " " + lastName + " from " + country);

	}

}
