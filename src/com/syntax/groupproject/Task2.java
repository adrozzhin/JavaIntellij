package com.syntax.groupproject;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Create a 2D array or integer type where you will store odd and even numbers.
		// Develop a program which will identify/print the even numbers only.

		int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 22, 11, 33 } };
		System.out.println("Here are even numbers from array: ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] % 2 == 0) {
					System.out.println(arr[i][j]);
				}
			}
		}

	}

}
