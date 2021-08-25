package com.syntax.class06;

import java.util.Scanner;

public class HW3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double x, y, result = 0.0;
		char operator;
		String operation = null;
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter first number");
		x = scan.nextDouble();

		System.out.println("Enter ariphmetic operator + or - or * or /");
		operator = scan.next().charAt(0);

		System.out.println("Enter second number");
		y = scan.nextDouble();

		switch (operator) {
		case '+':
			result = x + y;
			operation = "addition";
			break;
		case '-':
			result = x - y;
			operation = "substruction";
			break;
		case '*':
			result = x * y;
			operation = "multiplication";
			break;
		case '/':
			result = x / y;
			operation = "division";
			break;
		default:
			operation = "Wrong ariphmetic operator";
		}
		if (operation.equals("Wrong ariphmetic operator")) {
			System.out.println(operation);
		} else {
		System.out.println("The result of " + operation + " " + x + " and " + y + " is " + result);
		}
	}
}
