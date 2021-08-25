package com.syntax.class09;

public class NestedRecap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	for (int i=1; i<=5;i++) {
	//		System.out.println("Loop i");
	//		for (int j=1; j<4; j++) {
	//			System.out.println("Loop j");
	//		}
	//	}
		
		System.out.println("---------Multiplication table -----------");
		
		for (int a=1; a<=10; a++) {
			for (int b=1; b<=10; b++) {
				System.out.println(a + " x " + b + " = " + (a*b));
			}
			System.out.println("--------");
		}

	}

}
