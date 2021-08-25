package com.syntax.class13HW;

public class Grade {
	
	char getGrade(double score) {
		
		if (score >= 90) {
			return 'A';
		} else if (score >= 80 && score < 90) {
			return 'B';
		} else if (score >= 70 && score < 80) {
			return 'C';
		} else if (score >= 50 && score < 70) {
			return 'D';
		} else  {
			return 'F';
		
	}
	} 
}
