package com.syntax.class08;

import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int start, end;
		int sumEven = 0;
		int sumOdd = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the start of the range");
		start = scan.nextInt();
		System.out.println("Please enter the end of the range");
		end = scan.nextInt();

		for (int i = start; i <= end; i++) {
			if (i % 2 == 0) {
				sumEven += i;
			} else {
				sumOdd += i;
			}
		}
		System.out.println("Summary of all even numbers from " + start + " to " + end + " is " + sumEven);
		System.out.println("Summary of all odd numbers from " + start + " to " + end + " is " + sumOdd);
	}
}
