package com.syntax.class02;

public class ArithmeticOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * +,-,*,/, %
		 */

		int num1 = 90;
		int num2 = 10;

		// syso + ctrl + space

		System.out.println(num1 + num2);
		System.out.println(num1 - num2);
		System.out.println(num1 * num2);
		System.out.println(num1 / num2);

		int sum = num1 + num2;
		System.out.println(sum);

		int sub = num1 - num2;
		System.out.println(sub);

		double n1 = 2.99;
		double n2 = 3.05;
		
		double total = n1+n2;
		System.out.println(total);

		double resultOfTheDivision = n1/n2;
		System.out.println(resultOfTheDivision);
		
		float f1 = 2.99f;
		float f2= 3.05f;
		
		float floatDivison = f1/f2;
		
		System.out.println(floatDivison);
		
		//modulus %
		
		int number1, number2, mod;
		
		number1=10;
		number2=4;
		
		mod=number1%number2;
		
		System.out.println(mod);
		
		int guess;
		guess = 20+20*2;
		System.out.println(guess);
		
	}

}
