package com.syntax.class03;

import java.util.Scanner;

public class Trainingb4class2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter an integer:");
		
		int  x = scan.nextInt();
		
		int r = x%2;
		
		if (r==0)
			System.out.println(x + " is even");
		else
			System.out.println(x + " is odd");
		
		
		
		
		

	}

}
