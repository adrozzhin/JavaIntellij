package com.syntax.groupproject;

public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Write a program to swap 2 numbers without a temporary variable?

		int a = 25;
		int b = 10;

		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("new int a: " + a);
		System.out.println("new int b: " + b);
	}

}
