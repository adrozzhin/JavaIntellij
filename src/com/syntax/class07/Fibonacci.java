package com.syntax.class07;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i;
		int x = 0;
		int y = 1;
		int z = 1;

		for (i = 0; i <= 10; i++) {

			System.out.println(x);
			x=y;
			y=z;
			z=x+y;
		}

	}
}
