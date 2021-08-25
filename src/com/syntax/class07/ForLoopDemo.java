package com.syntax.class07;

public class ForLoopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i=1; i<=5; i++ ) {
			System.out.println("Hello");
		}
		
		for (int i=1; i<=10; i++) {
			System.out.println(i);
		}
		for (int i=20; i>=10; i--) {
			System.out.println(i);
		}
		
		for (int i=10; i<=100; i+=2) {
			System.out.print(i + " ");
		}
		for (int i= 10; i<=100; i++) {
			if (i%2==0) {
				System.out.println(i + " ");
			}
		}

	}

}
