package com.syntax.class06;

import java.util.Scanner;

public class HW2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your grade");
		char grade = scan.next().charAt(0);
		String expl;

		switch (grade) {
		case 'A':
			expl = "Excellent";
			break;
		case 'B':
			expl = "Good";
			break;
		case 'C':
			expl = "Average";
			break;
		case 'D':
			expl = "Bad";
			break;
		default:
			expl = "Not Acceptable";
		}
		System.out.println("The user's grade is " + grade + " and this is " + expl + " grade");
	}
}
