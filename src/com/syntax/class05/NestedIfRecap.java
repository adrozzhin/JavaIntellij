package com.syntax.class05;

import java.util.Scanner;

public class NestedIfRecap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan;
		String visa;
		int years;

		scan = new Scanner(System.in);

		System.out.println("Did you get your visa");
		visa = scan.next();

		if (visa.equals("yes")) {
			
			System.out.println("Congratulations, how long is your visa for");
			years = scan.nextInt();

			if (years > 1) {
				System.out.println("cool");
			} else {
				System.out.println("you will come back in 1 year");
			}
		} else {
			System.out.println("come and get visa");
		}
	}

}
