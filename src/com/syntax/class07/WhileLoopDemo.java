package com.syntax.class07;

public class WhileLoopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 0;

		while (i < 1) {
			System.out.println("Hello");
			i++;
		}
		int a = 1;
		while (a <= 2) {
			System.out.println(a);
			a++;
		}

		int var = 100;

		while (var <= 101) {
			System.out.println(var + " ");
			var++;
		}

		int num = 10;
		while (num >= 1) {
			System.out.println(num);
			num--;
		}

		int n = 1;

		while (n < 21) {
			System.out.println(n);
			n += 2;
		}

		n = 1;
		while (n < 21) {
			if (n % 2 != 0) {
				System.out.println(n);
			}
			n++;
		}

	}

}
