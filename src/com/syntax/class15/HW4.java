package com.syntax.class15;

public class HW4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//How would you reverse a String character by character?
		
		String str = "This is a string variable";
		String rev = "";
		
		for (int i = str.length()-1;i>=0;i--) {
			rev = rev + str.charAt(i);
		}
		
		System.out.println(rev);

	}

}
