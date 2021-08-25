package com.syntax.class06;

import java.util.Scanner;

public class HW3_V2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		double x,y,result = 0;
		char operator;
		String operation = null;
		
		System.out.println("Enter first number");
		x = scan.nextDouble();

		System.out.println("Enter ariphmetic operator + or - or * or /");
		operator = scan.next().charAt(0);

		System.out.println("Enter second number");
		y = scan.nextDouble();
		
		if (operator=='+' || operator=='-' || operator=='*' || operator=='/') {
			if (operator=='+') {
				result = x+y;
				operation = "addition";
			} else if (operator=='-') {
				result = x-y;
				operation = "substruction";
			} else if (operator=='*') {
				result = x*y;
				operation = "multiplication";
			} else if (operator=='/') {
				result = x/y;
				operation = "division";
			}
			System.out.println("The result of " + operation + " " + x + " and " + y + " is " + result);
		} else {
			System.out.println("Wrong ariphmetic operator");
		}	
	}
}
