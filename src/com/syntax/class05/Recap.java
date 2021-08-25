package com.syntax.class05;

import java.util.Scanner;

public class Recap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str;
		str = "some value";
		
		Scanner input;
		input=new Scanner(System.in);
		
		int num = input.nextInt();
		System.out.println(num);
		char c = input.next().charAt(0);  //index 0 is the first place. If specify index 1 it will take second character
		System.out.println(c);
		
		str=input.next();
		System.out.println();
		
		input.next(); //able to capture value BEFORE space
		System.out.println(str);
		
		input.nextLine(); //able to capture entire line
		str=input.nextLine();
		System.out.println(str);
		
		
		

	}

}
