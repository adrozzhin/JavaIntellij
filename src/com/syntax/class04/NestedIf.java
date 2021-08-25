package com.syntax.class04;

public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean vaccine = false;
		boolean secondDose = false;

		if (vaccine) { // yes
			System.out.println("Let's check how many doses you got");
			if (secondDose) {
				System.out.println("You are fully vaccinated");
			} else {
				System.out.println("You will need to get 2nd dose");
			}
			System.out.println("End of IF block");

		}
		
		System.out.println("Another example of Nested IF");
		
		/*
		 * every friday is movie day
		 * if it is the 13th --> you want to watch a scary movie
		 */
		
		int day =14;
		boolean isFriday = false;
		
		if(isFriday) {
			System.out.println("I am going to watch a movie");
			
			if (day==13) {
				System.out.println("I am going to watch scary movie");
			} else {
				System.out.println(("I am going to watch whatever is popular"));
			}
		} else {
			System.out.println("I am going to study");
	
		}

		System.out.println("End of the code");
	}

}
