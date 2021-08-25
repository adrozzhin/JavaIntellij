package com.syntax.class06;

import java.util.Scanner;

public class repl_35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String loan, eligibility = null;
		int creditScore;
		System.out.println("Do you need a loan?");
		Scanner scan = new Scanner(System.in);
		loan = scan.nextLine();

		if (loan.equals("yes")) {
		  System.out.println("What is your credit score?");
		  creditScore= scan.nextInt();

		  if (creditScore<600) {
		    eligibility="Not eligible";
		  } else if (creditScore >=600 && creditScore<700) {
		    eligibility="Maybe eligible";
		  } else if (creditScore >=700 && creditScore<800) {
		    eligibility="Eligible";
		  } else {
		    eligibility="Definitely eligible";
		  }
		  } else if (loan.equals("no")) {
		  eligibility="Uknown";
		} else {
		  System.out.println("Wrong answer");
		}
		System.out.println("The eligibility is " + eligibility);
		}

	}


