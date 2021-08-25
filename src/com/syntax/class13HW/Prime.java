package com.syntax.class13HW;

public class Prime {
	
	//Write a method to return whether given number is prime or not?
	
	void isPrime (int a) {
		int counter = 0;
		for (int i=2;i<a;i++) {
			if (a%i==0) {
				counter++;
			}
		}
		if (counter==0) {
			System.out.println(a + " is a Prime number");
		} else {
			System.out.println(a + " is NOT a Prime number");
		}
	}

}
