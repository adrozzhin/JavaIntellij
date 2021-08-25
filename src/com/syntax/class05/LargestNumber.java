package com.syntax.class05;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		System.out.println("Please enter 3 distinct numbers");

		int x = input.nextInt();
		int y = input.nextInt();
		int z = input.nextInt();
		int largest;
		
		if (!(x == y && y ==z)) {
			if (x > y) {
				if (x > z) {
					largest = x;
				} else {
					largest = z;
				}
			} else {
				if (z > y) {
					largest = z;
				} else {
					largest = y;
				}
			}
			System.out.println("The largest number is " + largest);
		}
		
		

		

	}

}
