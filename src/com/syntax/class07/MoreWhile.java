package com.syntax.class07;

import java.util.Scanner;

public class MoreWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		String name;
		int age;

		int i = 1;

		while (i <= 3) {

			System.out.println("Please enter your name");
			name = scan.next();

			System.out.println("Please enter your age");
			age = scan.nextInt();

			System.out.println(name + " is " + age + " years old");
			i++;
		}
	}

}
