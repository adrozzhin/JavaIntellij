package com.syntax.reviewclass06;

public class MethodQueryTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodQuery query = new MethodQuery();
		double result = query.getMaximumValue(5, 10);
		System.out.println(result);
		
		query.getMaximumValueWithoutAnyReturn(10, 5);
		

	}

}
