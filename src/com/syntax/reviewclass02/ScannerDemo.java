package com.syntax.reviewclass02;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number");
		int number=scan.nextInt();
		System.out.println("Enter name");
		String name=scan.next();
		//use next instead of nextline because pressing "Enter" after entering number recognised as a input and is putting in bufer. and putting in next scanner
		System.out.println(name + number);

	}

}
