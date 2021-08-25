package com.syntax.class13;

import java.util.Scanner;

public class StudentTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student Michael = new Student();
		Michael.name = "Michael";
		Michael.id = "123";
		Michael.gender = 'M';
		Michael.study();
		Michael.payTuition();
		Michael.school = "Syntax";
		
		Student Anne = new Student();
		
		Anne.name = "Anne Mary";
		Anne.school = "Syntax";
		Anne.tuition = 1000;
		Anne.payTuition();
		Anne.study();
		
		Scanner scan = new Scanner(System.in);
		scan.next();
		

	}

}
