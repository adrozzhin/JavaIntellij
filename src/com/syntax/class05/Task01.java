package com.syntax.class05;

import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your height");
		
		int h = scan.nextInt();
		
		if (h<60) {
			System.out.println("Short");
		}else if (h>=60 && h <=72) {
			System.out.println("Medium");
		} else if (h>72) {
			System.out.println("Tall");
		}

	}

}
