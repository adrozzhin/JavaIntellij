package com.syntax.class03;

public class MoreIfExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double a = 30;
		double b = 20;

		if (a == b) {
			System.out.println("Numbers are equal");
		} else {
			System.out.println("Numbers are not equal");

			
			boolean isBreakTime = true;
			
			if (isBreakTime) {
				System.out.println("I am getting my coffee");
			}else {
				System.out.println("I am focusing on the class");
			}
			
			/*
			 * if you are hungry --> I will go eat
			 * 						otherwise I will go have a tea
			 */
			
			boolean isHungry=true;
			
			if (isHungry) {
				System.out.println("I will go eat");
			}else {
				System.out.println("I will go have a tea");
			}
			
		}

	}

}
