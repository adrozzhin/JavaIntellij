package com.syntax.class10;

public class LargestAndSecond4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = { 8888888, 1, 20, 3, 4, 50000 };
		
		int largest =arr[0];
		int second = arr[0];
		
		for (int i=0;i<arr.length;i++) {
			if (arr[i]>largest) {
				second=largest;
				largest=arr[i];
			} else if (arr[i]>second) {
				second = arr[i];
			}
			
		}
		System.out.println("Largest: " + largest);
		System.out.println("Second: " + second);

	}

}
