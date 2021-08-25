package com.syntax.class10;

public class BeforeClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// lottery ticket

		int[][] lotteryCard = { { 20, 15, 22 }, { 8, 78, 11 }, { 1, 27, 99 } };

		int[][] lotteryCard2 = new int[3][3];
		lotteryCard2[0][0] = 20;
		lotteryCard2[0][1] = 30;
		lotteryCard2[0][2] = 40;
		lotteryCard2[1][0] = 50;
		lotteryCard2[1][1] = 60;
		lotteryCard2[1][2] = 70;
		lotteryCard2[2][0] = 80;
		lotteryCard2[2][1] = 90;
		lotteryCard2[2][2] = 100;

		// [row][column}

		System.out.println(lotteryCard[1][0]);
		System.out.println("-----------");
		for (int i = 0; i < 3.; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(lotteryCard[i][j] + " ");
			}
		}

	}

}
