package com.syntax.class04;

import java.util.Scanner;

public class HWTemperature {
	public static void main(String[] args) {
		
		Scanner check = new Scanner(System.in);
		
		System.out.println("Enter the city");
		
		String city = check.nextLine();
		
		System.out.println("Enter the temperature in Fahrenheit");
		
		double temp = check.nextInt();
		
		double tempinc = (temp - 32) * 5/9;
		
		System.out.println("The temperature in " + city + " is " + tempinc + " °C" );
		
		
	}

}
