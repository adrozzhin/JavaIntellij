package com.syntax.class09;

public class HW3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double arr[] = { 14.25, 85.14, 96.57, 78.11 };
		for (int i = arr.length - 1; i >= 0; i--) {
			if (i != 0) {
				System.out.print(arr[i] + ", ");
			} else {
				System.out.print(arr[i]);
			}
		}

	}

}
