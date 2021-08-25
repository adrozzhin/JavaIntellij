package com.syntax.class09;

public class AdvanceLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numbers = {100,20,56,58,44,11};
		
		for (int i=0; i<numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		
		for (int number:numbers) {
			System.out.println(number);
		}
		
		char[] grades = {'A', 'B', 'C', 'D', 'E', 'F', 'G'};
		for(char grade:grades) {
			System.out.print(grade+ " ");
		}
		System.out.println();
		
		for (int i=grades.length-1; i>=0; i--) {
			System.out.print(grades[i] + " ");
		}

	}

}
