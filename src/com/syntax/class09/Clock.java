package com.syntax.class09;

public class Clock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// PRINTING A CLOCK WITH THAT GOES UP TO 23:59

		for (int i = 0; i <= 23; i++) {
			for (int j = 0; j <= 59; j++) {
				if(i<10 && j<10) {
					System.out.println("0" + i + ":0" + j);
				} else if (i<10 && j>=10) {
					System.out.println("0" + i + ":"+ j);
				} else if (i>10 && j<10) {
					System.out.println(i + ":0"+ j);
				} else {
					System.out.println(i + ":"+ j);
				}
				

			}
		}

	}

}
