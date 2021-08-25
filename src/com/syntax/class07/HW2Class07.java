package com.syntax.class07;

import java.util.Scanner;

public class HW2Class07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int price = 0;
		int expectedPrice = 3;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please pay expected amount of money");
		do {
			price = scan.nextInt();
			if (price > expectedPrice) {
				System.out.println("Please give less money");
			} else if (price < expectedPrice) {
				System.out.println("Please give more money");
			}
		} while (price != expectedPrice);

		System.out.println("Please enjoy your candy");

	}

}
