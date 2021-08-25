package com.syntax.class04;

import java.util.Scanner;

public class repl31_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		    Scanner input = new Scanner(System.in);
		    
		    boolean isSunny;

		    System.out.println ("Is it sunny outside?");

		    String answer = input.nextLine();
		   
		    if (answer.equals("yes")) {
		    	if (answer.equals("yes")) {
			    	isSunny = true;
			    } else {
			    	isSunny = false;
			    }
			    if (isSunny) {
			      System.out.println ("It is a sunny day, I should go somewhere!");
			      System.out.println ("What is the temperature outside?");
			      int temp = input.nextInt();
			      if (temp>85) {
			        System.out.println ("I am going to the beach");
			      } else {
			        System.out.println ("I am going to the park");
			      }
			    } else {
			      System.out.println ("I stay home and practice Java");
			    }
		    } else if (answer.equals("no")) {
		    	System.out.println();
		    }
	}
		  }

	

