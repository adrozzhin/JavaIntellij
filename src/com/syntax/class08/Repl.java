package com.syntax.class08;

import java.util.Scanner;

public class Repl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int size;
		System.out.println("Enter the size");
		size = scan.nextInt();
		for (int i = 1; i <= size; i++) {
			for (int j = 1; j <= size; j++) {
				if (j==1 || j==size || i==1 || i==size) {
					System.out.print("$");
				} else 
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
