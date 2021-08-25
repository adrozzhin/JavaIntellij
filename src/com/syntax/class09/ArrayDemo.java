package com.syntax.class09;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 10;
		int [] arr= new int[5];
		
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		System.out.println(arr[2]);
		
		String[] days = new String[7];
		days[0]="Monday";
		days[1]="Tuesday";
		days[2]="Wednesday";
		days[3]="Thursday";
		days[4]="Friday";
		days[5]="Saturday";
		days[6]="Sunday";
	
		System.out.println(days[5]);
		
		days[6] = "Funday";
		
		System.out.println(days[6]);
		
		boolean[] array = new boolean[3];
		
		array[0] = true;
		array[1] = true;
		array[2] = false;
		
		System.out.println(array[1]);
		

	}

}
