package com.syntax.class07;

public class HWClass07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sumEven = 0;
		int sumOdd = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				sumEven+=i;
			} else {
				sumOdd+=i;
			}
		}
		System.out.println("Summary of all even numbers from 1 to 100 is " +sumEven);
		System.out.println("Summary of all odd numbers from 1 to 100 is "+sumOdd);
	}

}
