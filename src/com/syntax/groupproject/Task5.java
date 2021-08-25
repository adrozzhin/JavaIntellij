package com.syntax.groupproject;

public class Task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Write a java program to check whether a given number is prime or not?

		int x = 5;
		int counter = 0;

		for (int i = 2; i <= x - 1; i++) {
			if (x % i == 0) {
				counter++;
			}
		}
		if (counter != 0) {
			System.out.println(x + " is not a prime number");
		} else {
			System.out.println(x + " is a prime number");
		}
	}

}
