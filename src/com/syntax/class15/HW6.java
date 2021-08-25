package com.syntax.class15;

import java.util.Arrays;

public class HW6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// How would you check if String is palindrome or not?

		String str = "This is a palindrome palindrome a is This";

		String arr[] = str.split(" ");
		String arrRev[] = new String[arr.length];

		for (int i = arr.length - 1; i >= 0; i--) {
			arrRev[(arr.length - 1) - i] = arr[i];
		}

		if (Arrays.equals(arr, arrRev)) {
			System.out.println("String '" + str + "' is a polindrome");
		} else {
			System.out.println("String '" + str + "' is NOT a polindrome");
		}

	}

}
