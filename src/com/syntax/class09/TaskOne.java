package com.syntax.class09;

public class TaskOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char [] letters = new char[6];
		letters[0] = 'A';
		letters[1] = 'B';
		letters[2] = 'C';
		letters[3] = 'D';
		letters[4] = 'E';
		letters[5] = 'F';
		System.out.println(letters[1]);
		
		System.out.println("---------");
		
		String [] bugbusters = new String [8];
		bugbusters[0] = "Olena";
		bugbusters[1] = "Ayna";
		bugbusters[2] = "Elena";
		bugbusters[3] = "Eugene";
		bugbusters[4] = "Andrei";
		bugbusters[5] = "Serge";
		bugbusters[6] = "Serge C";
		bugbusters[7] = "Maria";
		
		System.out.println(bugbusters[4]);
		
		String[] names = {"Olena", "Ayna", "Elena", "Eugene", "Andrei", "Serge", "Serge C", "Maria"};
		System.out.println(names[7]);
		names[7] = "maria";
		System.out.println(names[7]);

	}

}
