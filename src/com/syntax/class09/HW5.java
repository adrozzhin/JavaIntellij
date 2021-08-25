package com.syntax.class09;

public class HW5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {-52, 48, -8812, -1196, 999, -123};
		int largest=arr[0];
		for (int i=0; i<arr.length; i++) {
			if (arr[i]>largest) {
				largest = arr[i];
			} 
		}
		System.out.println(largest);

	}

}
