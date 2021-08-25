package com.syntax.reviewclass05;

public class NestedLoops2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * ***** ** ** *****
		 */
		for (int j = 0; j < 4; j++) {
			for (int i = 0; i < 5; i++) {
				if (j == 1 || j == 2) {
					if (i > 1) {
						continue;
					}
				}
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
