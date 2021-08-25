package com.syntax.class06;

import java.util.Scanner;

public class Sale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		String sale;
		double price = 0;
		int discount = 0;
		double finalPrice;
		String item;
		String answer;
		
		System.out.println("What would you like to purchase");
		
		item = scan.nextLine();

		System.out.println("Is there a sale now?");

		sale = scan.nextLine();
		
		//answer = scan.

		if (sale.equals("yes")) {
			System.out.println("What is the price for item?");
			price = scan.nextDouble();
			if (price > 0 && price < 20) {
				discount = 10;
			} else if (price >= 20 && price < 100) {
				discount = 20;
			} else if (price >= 100 && price < 500) {
				discount = 30;
			} else if (price >= 500) {
				discount = 50;
			} else {
				System.out.println("Wrong price input");
			}
		} else {
			System.out.println("I am not going for shopping");
		}
		finalPrice = price - (price * discount / 100);
		
		if (finalPrice!=0) {
			System.out.println("After discount " + discount + "% the price of the " +item + " reduced from $" + price + " to $" + finalPrice);
		}
		

	}

}
