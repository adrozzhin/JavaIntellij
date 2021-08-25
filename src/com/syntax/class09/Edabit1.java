package com.syntax.class09;

import java.util.Scanner;

public class Edabit1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		double price=1000;
		double discount =30;
		double newprice=0;
		double discountamount=0;
		//System.out.println("Enter price");
		//price = scan.nextDouble();
		//System.out.println("Enter discount");
		//discount = scan.nextDouble();
		
		newprice = price - ((discount/100)*price);
		System.out.println(newprice);
		
		
	
		

	}

}
