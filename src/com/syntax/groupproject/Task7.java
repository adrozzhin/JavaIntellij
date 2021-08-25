package com.syntax.groupproject;

public class Task7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Maximum and minimum number in the array?

		int[] arr = { 4000, 5000, -20000, 3, 4, 50 };
		int max = arr[0];
		int min = arr[1];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			} else if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("Max value: " + max);
		System.out.println("Main value: " + min);
	}
}
