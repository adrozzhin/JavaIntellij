package com.syntax.class05;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the quiz score");
		
		int quiz = scan.nextInt();
		
		System.out.println("Enter the mid term score");
		
		int midterm = scan.nextInt();
		
		System.out.println("Enter the final score");
		
		int finalscore = scan.nextInt();
		
		int average = (quiz + midterm + finalscore)/3;
		
		char grade;
				
		if (average>=90) {
			grade='A';
		} else if (average>=70 && average<90) {
			grade='B';
		} else if (average>=50 && average<70) {
			grade='C';
		} else {
			grade='F';
		}
		System.out.println("With average score = " + average + " your score is " + grade);

	}

}
