package com.syntax.class10;

import java.util.Scanner;

public class ArrayFromScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("How many elements do you want to store in array?");
		
		int size = scan.nextInt();
		
		double[] numbers = new double[size];
		
		for(int i = 0;i<numbers.length; i++) {
			System.out.println("Please enter number for the index " + i);
			numbers[i] =scan.nextDouble();
		}
		double sum=0;
		for (double num:numbers) {
			sum+=num;
		}
		System.out.println("The sum of all: " + sum);

	}

}
