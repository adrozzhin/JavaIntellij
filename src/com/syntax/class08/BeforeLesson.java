package com.syntax.class08;

public class BeforeLesson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 0; i < 5; i++) {
			System.out.println("Cold");
		}

		System.out.println("----------");

		String[] colors = { "Red", "Blue", "Green" };

		for (int i = 0; i < 3; i++) {
			System.out.println(colors[i]);
		}
		System.out.println("----------");

		String[][] fancyColors = { { "Red", "Blue", "Green" }, { "Black", "Yellow", "Orange" } };

		for (int row = 0; row < 2; row++) {
			for (int column = 0; column < 3; column++) {
				System.out.println(fancyColors[row][column]);
			}
		}
		System.out.println("----------");
		
		for (int i = 0; i<5; i ++) {
			for (int j = 0; j<10; j ++) {
				System.out.println("i: " + i + ", j:" + j);
			}
		}
	}
}
