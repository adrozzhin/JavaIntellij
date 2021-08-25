package com.syntax.class04;

import java.util.Scanner;

public class HWDMV {
	public static void main(String[] args) {
		
		Scanner license = new Scanner(System.in);
		
		System.out.println("Enter customer's age");
		
		int age = license.nextInt();
		
		if (age>=18) {
			System.out.println("Issue the driver license");
		} else {
			System.out.println("Customer have to get the learners permit");
		}
	}

}
