package com.syntax.class04;

import java.util.Scanner;

public class AnotherExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter the city");
		String  city = input.nextLine();
		
		System.out.println("Please enter tempperature");
		
		double temp = input.nextDouble();
	
		System.out.println("The temperature in " + city + " is " + temp);
		

	}

}
