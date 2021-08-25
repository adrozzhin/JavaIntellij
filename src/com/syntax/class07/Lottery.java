package com.syntax.class07;

import java.util.Scanner;

public class Lottery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in;
		int secretNumber, userNumber;
		secretNumber = 15;

		in = new Scanner(System.in);

		do {
			System.out.println("Please guess my secret number");
			userNumber = in.nextInt();
		} while (userNumber != secretNumber);
		
		System.out.println("Congratulations, you got it!");

	}

}
