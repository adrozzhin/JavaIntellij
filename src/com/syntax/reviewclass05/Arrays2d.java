package com.syntax.reviewclass05;

public class Arrays2d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][] numbers = new int [2][];
		int []row1 = new int[5];
		int []row2=new int [10];
		numbers[0] = row1;
		numbers[1] = row2;
		
		for (int i=0;i<numbers.length;i++) {
			for (int j=0;j<numbers[i].length;j++) {
				System.out.print(numbers[i][j] + " ");
			}
			System.out.println();
		}

	}

}
