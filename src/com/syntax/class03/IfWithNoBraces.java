package com.syntax.class03;

public class IfWithNoBraces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double temp = 33;

		if (temp < 32) {
			System.out.println("Water will freeze with temperature " + temp);
		} else {
			System.out.println("Water will NOT freeze with temperature " + temp);
			System.out.println("Because it is warm outside");
			
			// when IF statement is used without {} then JAVA allows only 1 statement for each block
			// meaning 1 line for if block and 1 block for else block ONLY
		}
	}

}
