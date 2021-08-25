package com.syntax.class04;

public class Donor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int age = 18;
		int weight = 180;

		if (age >= 18) {
			if (weight >= 110) {
				System.out.println("You are eligible to donate blood");
			} else {
				System.out.println("You have to weight more than 110 lb");
			}

		} else {
			System.out.println("You are under 18 and not eligible to donate a blood");
		}

	}

}
