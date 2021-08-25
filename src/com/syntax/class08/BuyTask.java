package com.syntax.class08;

import java.util.Scanner;

public class BuyTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double price, change, partOfPrice = 0, accumulatedprice = 0;
		String item;
		Scanner scan = new Scanner(System.in);

		System.out.println("What do you want to buy?");
		item = scan.nextLine();
		System.out.println("How much is it?");
		price = scan.nextDouble();
		System.out.println("Ok. Give me this amount of money");

		while (accumulatedprice < price) {
			
			partOfPrice = scan.nextInt();
			accumulatedprice = accumulatedprice + partOfPrice;
			if (accumulatedprice < price)
			System.out.println("There is " + accumulatedprice + ". You have " + (price-accumulatedprice) + " left to pay");
		}
		change = accumulatedprice-price;
		if (price==accumulatedprice) {
			System.out.println("Thank you for shopping. This is exact amount. Here is your " + item);
		} else {
			System.out.println("Thank you for shopping. Here is your " + item + " and " + change + " change");
		}
	}
}
