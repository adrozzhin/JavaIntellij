package com.syntax.class04;

import java.util.Scanner;

public class ExampleOfScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your name");
		String value = scan.nextLine();
		
		System.out.println("Hello " + value);
		
		System.out.println("Please enter your age");
		
		int age=scan.nextInt();
		
		System.out.println(value + " is " +age + " years old");
		
		
		

	}

}
