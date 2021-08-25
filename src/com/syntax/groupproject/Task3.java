package com.syntax.groupproject;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Create a 2D array of integers.
		// Develop a program which will calculate the sum of even and odd numbers for
		// that array.

		int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int sumEven = 0, sumOdd = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] % 2 == 0) {
					sumEven = sumEven + arr[i][j];
				} else {
					sumOdd = sumOdd + arr[i][j];
				}
			}
		}
		System.out.println("The summary of even integers: " + sumEven);
		System.out.println("The summary of odd integers: " + sumOdd);

	}

}
