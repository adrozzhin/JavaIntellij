package com.syntax.reviewclass05;

public class NestedLoops4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 11111 
		 * 22222 
		 * 33333 
		 * 44444 
		 * 55555
		 */
		/*
		 * 54321 
		 * 54321 
		 * 54321 
		 * 54321
		 * 
		 */

		for (int j = 1; j < 6; j++) {
			
			for (int i = 0; i < 5; i++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println("-----");
		for (int i=0;i<5;i++) {
			for (int j=5; j>0;j--) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
