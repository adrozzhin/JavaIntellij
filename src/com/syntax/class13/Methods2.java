package com.syntax.class13;

public class Methods2 {
	
	double getMax(double num1, double num2) {
		
		if (num1>num2) {
			return num1;
		} else {
			return num2;
		}
	}
	
	void getMaxWithOutReturn(double num1,double num2) {
		if (num1>num2) {
			System.out.println(num1);
		} else {
			System.out.println(num2);
		}
	}

}
