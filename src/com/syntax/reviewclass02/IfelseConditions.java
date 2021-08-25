package com.syntax.reviewclass02;

import java.util.Scanner;

public class IfelseConditions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String storeduserName = "Andrei";
		String storedPassword = "pass123";
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your UserName");
		String userName = scan.nextLine();
		System.out.println("Please enter your Password");
		String password = scan.nextLine();
		if (storeduserName.equals(userName)) {

			System.out.println("Correct username");
			if (storedPassword.equals(password)) {
				System.out.println("Password is correct");
			} else {
				System.out.println("Username is correct but password is not");

			}
		} else {
			System.out.println("Username is not correct");
		}

	}

}
