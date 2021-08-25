package com.syntax.class06;

import java.util.Scanner;

public class VariableInitialization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * ask user to enter name and age
		 * based on age define who is a user
		 * if age 0-3 - baby
		 * age 3-5 - toddler
		 * age 5-12 kid
		 * age 12-19 - teenager
		 * age 19-65 - adult
		 * age 65+ - senior
		 */
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please enter your name");
		
		String name = in.nextLine();
		
		System.out.println("Please enter your age");
		
		int age = in.nextInt();
		
		String whoAreYou = null;
		
		if (age>=0 && age<3) {
			whoAreYou = "baby";
		} else if (age>=3 && age<5) {
			whoAreYou = "toddler";
		} else if (age>=5 && age<12) {
			whoAreYou = "kid";
		} else if (age>=12 && age<19) {
			whoAreYou = "teenager";
		} else if (age>=19 && age<65) {
			whoAreYou = "adult";
		} else if (age>=65) {
			whoAreYou = "senior";
		}
		
		if (whoAreYou!=null) {
		System.out.println(name + " you are " + whoAreYou);
		}
		
			

	}

}
