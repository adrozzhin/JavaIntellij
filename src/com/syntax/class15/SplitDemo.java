package com.syntax.class15;

public class SplitDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "This is Batch 10.Batch 10 is great";
		String[] strArr = str.split(" ");
		
		for (int i=0; i<strArr.length;i++) {
			System.out.println(strArr[i]);
		}
		
		System.out.println("----------------");
		
		
		String[] strArr1 = str.split("[.]");
		for (int j=0; j<strArr1.length;j++) {
			System.out.println(strArr1[j]);
		}
		System.out.println("----------------");
		
		String str3 = "This is Batch";
		String[] strArr3 = str3.split("i");
		
		for (int j=0; j<strArr3.length;j++) {
			System.out.println(strArr3[j]);
		}

	}

}
