package com.syntax.class08;

public class Dfdfd {

//	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		public String reverse(String input) {

		    if (input == null) {
		        return input;
		    }

		    String output = "";

		    for (int i = input.length() - 1; i >= 0; i--) {
		        output = output + input.charAt(i);
		    }

		    return output;
		}

	}


