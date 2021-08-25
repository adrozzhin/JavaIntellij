package com.syntax.reviewclass05;

public class NestedLoops3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 12345 12345 12345 12345
		 */
		for (int j = 10; j < 14; j++) {
			for (int i = 1; i < 10; i++) {
				if (j==11 && i==5) {
					continue;
				}
				System.out.print(i);
			}
			System.out.println();
		}

	}

}
