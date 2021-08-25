package com.syntax.class14;

import java.util.Scanner;

public class BabyNameTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BabyName name = new BabyName();
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter Mom's first name");
		String momsName = scan.next();
		System.out.println("Please enter Dad's first name");
		String dadsName = scan.next();
		System.out.println("Please enter baby's gender");
		String gender = scan.next();
		
		System.out.println("Suggested name for baby is: " + name.nameCreator(momsName, dadsName, gender));
	
		
	}

}
