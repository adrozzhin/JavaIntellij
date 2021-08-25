package com.syntax.class05;

import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter day number");

		int d = scan.nextInt();

		if (d >= 1 && d <=5) {
			System.out.println("It is a weekday");
		} else if (d >= 6 && d <=7) {
			System.out.println("It is a weekend");
		} else {
			System.out.println("Wrong input");
		}

	}

}
