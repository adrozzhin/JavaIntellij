package com.syntax.class04;

public class Mortgage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double rate = 2.5;
		int price = 100000;

		if (rate <= 4.5) {
			System.out.println("Go and buy a house");

			if (price > 200000) {
				System.out.println("Take a loan");
			} else {
				System.out.println("Pay in cash");
			}
		} else {
			System.out.println("Wait for a better rate");

		}

	}

}
