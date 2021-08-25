package com.syntax.class04;

import java.util.Scanner;

public class HWLoan {
	
	public static void main(String[] args) {
		
		Scanner check = new Scanner(System.in);
		
		System.out.println("Enter the loan amount");
		
		int loan = check.nextInt();
		
		if (loan<=200000) {
			System.out.println("Loan is approved");
		} else {
			System.out.println("Loan is declined");
		}
		
	}

}
