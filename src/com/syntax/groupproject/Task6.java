package com.syntax.groupproject;

public class Task6 {
	
	public static void main(String[] args) {
		
	
	// Write a Java Program to print the first 10 numbers of Fibonacci series.
	
	int i;
	int x = 1;
	int y = 1;
	int z = 2;

	for (i = 0; i <= 10; i++) {

		System.out.println(x);
		x=y;
		y=z;
		z=x+y;
	}
}
}

