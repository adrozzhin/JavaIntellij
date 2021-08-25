package com.syntax.class03;

public class IfElseStatementDemo {
	
	/*
	 * shortcut for main:
	 * type main +ctrl+space+enter
	 * 
	 */
	
	public static void main(String[] args) {
		
		/* I have money and I know price
		 * if I have more money --> i'll buy cookies
		 * otherwise I will cry
		 */
		
		System.out.println("Beginning of my programm");
		
		double money=10;
		double $cookie = 5.99;
		if (money>$cookie) {
			System.out.println("I am buing those cookies");
		}
		else { // if false
			System.out.println("I am going to cry");
		}
	}

}
