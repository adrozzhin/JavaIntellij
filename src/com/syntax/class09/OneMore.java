package com.syntax.class09;

public class OneMore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i=0; i<=3; i++) {
			System.out.println("Outer loop " + i);
			for (int j=0; j<3; j++) {
				System.out.println("Inner loop " + j);
			}
			
			System.out.println("------");
		}
		


	}

}
