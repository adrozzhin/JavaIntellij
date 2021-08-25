package com.syntax.class14;

public class MethodsTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {10,10,10,10};
		Methods method = new Methods();
		arr = method.doubleTheArray(arr);
		
		for (int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
