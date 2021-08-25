package com.syntax.class02;

public class IdentifiersExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//RULES:
				/*
				 * Identifiers - name we give to classes, variables and methods
				 * Keywords can not be used as Identifiers
				 * Identifiers can not start with number
				 * Identifiers cannot start with special character except: _ AND $
				 */
		char singletter = 's';
				
		//boolean new=true; do not use keyworld to name your variables
		
		//int 1num=100; //error
		
		int num1=100;
		
		boolean _boo=true;
		double $price=2.99;
		//byte ^b=1; --> error
		
		//Preferences
		/* follow camel casing
		 * Java Classes should start with upper case and follow camel casing
		 * Variables and Methods in Java should start with lowercase and follow camel casing
		 * 
		 * 
		 */
		
		short thisIsMyShortNumber = 10;
		System.out.println(thisIsMyShortNumber);
		
		
		
		
		
	}

}
