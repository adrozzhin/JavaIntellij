package com.syntax.class10;

public class LargestAndSecond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 4000, 500, 20, 3, 4, 50000 };
		int largest = arr[0];
		int second = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largest) {
				largest = arr[i];
			}
			if (second == largest && second == arr[0]) {
				second = arr[arr.length - 1];
			}
			if (second == largest && second == arr[arr.length - 1]) {
				second = arr[0];
			}
		}
		for (int j = 0; j < arr.length; j++) {
			if (arr[j] < largest && arr[j] > second) {
				second = arr[j];
			}
		}
		System.out.println(largest);
		System.out.println(second);
	}
}
