package com.syntax.class08;

public class BeforeLesson2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numbers = { 10, 20, 30, 40, 50 };
		
		for (int i=0; i < numbers.length; i++) {
			
			if (numbers[i] == 30) {
				break;
			}
			System.out.println(numbers[i]);
		}

	}

}
