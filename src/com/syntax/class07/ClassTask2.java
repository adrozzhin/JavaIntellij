package com.syntax.class07;

public class ClassTask2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("----------Task 1----------------");

		for (int i = 1; i <= 100; i++) {
			System.out.print(i + " ");
		}

		System.out.println("----------Task 2----------------");

		for (int i = 100; i >= 1; i--) {
			System.out.println(i + " ");
		}

		System.out.println("----------Task 3----------------");

		for (int i = 20; i >= 1; i--) {
			if (i % 2 == 0) {
				System.out.println(i + " ");
			}
		}

		System.out.println("----------Task 3_v2----------------");

		for (int i = 20; i >= 1; i -= 2) {
			System.out.println(i + " ");
		}
		
		System.out.println("----------Task 4----------------");

		for (int i = 20; i <= 50; i++) {
			if (i % 2 != 0) {
				System.out.println(i + " ");
			}
		}

		System.out.println("----------Task 4_v2----------------");

		for (int i = 21; i <= 50; i += 2) {
			System.out.println(i + " ");
		}
	}

}
