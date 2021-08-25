package com.syntax.groupproject;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Create a 2D array of integer values. Print the sum of all numbers.

		int arr[][] = { { -1, 10, -15 }, { 5, 8, 1 }, { -11, 50, 8, 55 } };
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				sum = sum + arr[i][j];
			}
		}
		System.out.println("Summary of all numbers in array: " + sum);

	}

}
