package com.syntax.class13;

public class Student {
	
	String name;
	String id;
	char gender;
	double tuition;
	String school;
	
	void study() {
		System.out.println(name + " studies in " + school);
	}
	void payTuition () {
		System.out.println(name + " pay " + tuition);
	}

}
