package com.syntax.reviewclass05;

public class Arrays1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] numbers = new int[5];
		
		for (int i=0;i<5;i++) {
			numbers[i] = i+1;
			//System.out.println(i);
		}
		
		for (int i=0;i<numbers.length;i++) {
			System.out.println(numbers[i]);
		}
		System.out.println("------");
		
		for (int number:numbers) {
			System.out.println(number);
		}
	
		
		

	}

}
