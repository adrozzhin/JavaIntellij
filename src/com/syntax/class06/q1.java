package com.syntax.class06;

public class q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double discount;
		char code = 'A' ;

		switch ( code ) {
		case 'A':
		discount = 0.0;

		case 'B':
		discount = 0.1;

		case 'C':
		discount = 0.2;

		default:
		discount = 0.3;
		}
		System.out.println(discount);
	}
}
