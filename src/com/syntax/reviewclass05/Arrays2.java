package com.syntax.reviewclass05;

import java.util.Scanner;

public class Arrays2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the size of the array");
		int size = scanner.nextInt();
		int [] numbers = new int[size];
		for (int i=0; i<size; i++) {
			System.out.println("Please enter the numbers");
			numbers[i] = scanner.nextInt();
		}
		System.out.println("----------------");
		
		for (int i=0;i<size;i++) {
			System.out.println(numbers[i]);
		}
	}

}
