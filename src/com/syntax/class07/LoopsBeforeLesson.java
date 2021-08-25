package com.syntax.class07;

public class LoopsBeforeLesson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub'

		int x = 0;
		int y = 1;
		int z = x+y;

		for (x = 0; x <= 100; x=y+z) {
			y=x+z;
			z=x+y;
			
			System.out.println(x);
			System.out.println(y);
			System.out.println(z);
		}
	}
}
