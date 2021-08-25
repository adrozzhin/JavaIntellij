package com.syntax.class06;

import java.util.Scanner;

public class SwitchAndScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in;
		String country, traditionalFood = null;
		in=new Scanner(System.in);
		
		System.out.println("Where are you from");
		country = in.nextLine();
		
		switch(country) { 
		
		case "USA":
			traditionalFood="Burger";
			break;
		case "Afganistan":
			traditionalFood="qabeli palaw";
			break;
		}
		System.out.println(traditionalFood);
			
		

	}

}
