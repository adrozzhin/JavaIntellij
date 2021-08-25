package com.syntax.class03;

public class WhatHappens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// int i=1.99; error

		int i = (int) 1.99; // narrowing or explicit casting
		System.out.println(i);

		double d = 1000; // widening or implicit casting
		System.out.println(d);

		byte b = (byte) 128;
		System.out.println(b);

		int num = 20;
		int num1 = 3;

		System.out.println(num / num1);

		double num2 = 20;
		double num3 = 3;

		System.out.println(num2 / num3);
		
		int n1 = 20;
		int n2 = 3;	
		double dd = n1 / n2;
		System.out.println(dd);
		
		// Operators in Java:
		//= assignment
		//+ - * / % arithmetic operators
		//relational operators
	

	}

}
