package com.syntax.class04;

import java.util.Scanner;

public class Trainingb4class01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("What is your first name?");
		String name = scan.next();
		
		System.out.println("What is your age?");
		int age = scan.nextInt ();
		
		System.out.println("What car do you own?");
		String quote = scan.next();
		quote = quote + scan.nextLine();
		
		System.out.println("Thank you " + name +", you are " + age + " years old" );
		System.out.println("And you own " + quote);
		
		
		
		
		
		
		
		
		

	}

}
