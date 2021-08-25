package com.syntax.class10;

public class Array2d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a;
		int[] b;
		
		//creatind 2d array
		int[][] c = new int[3][4];
		//1 row
		c[0][0] = 11;
		c[0][1] = 12;
		c[0][2] = 13;
		c[0][3] = 14;
		//2 row
		c[1][0] = 20;
		c[1][1] = 30;
		c[1][2] = 40;
		c[1][3] = 50;
		//3 row
		c[2][0] = 100;
		c[2][1] = 200;
		c[2][2] = 300;
		c[2][3] = 400;
		
		System.out.println(c[1][3]);
		System.out.println(c[2][1]);

	}

}
