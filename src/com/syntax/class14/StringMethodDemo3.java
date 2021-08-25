package com.syntax.class14;

public class StringMethodDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String longStr = "This class is easy";
		System.out.println(longStr.endsWith("y"));
		System.out.println(longStr.endsWith("easy"));
		System.out.println(longStr.endsWith("is easy"));
		System.out.println("------------");
		
		System.out.println(longStr.contains("class"));
		System.out.println("------------");
		longStr = "blabla";
		System.out.println(longStr.equals("Blabla"));
		System.out.println(longStr.equalsIgnoreCase("Blabla"));
		System.out.println("------------");
		System.out.println(longStr.charAt(0));
		System.out.println(longStr.charAt(1));
		System.out.println(longStr.charAt(2));
		System.out.println("------------");
		System.out.println(longStr.indexOf("l"));
		System.out.println(longStr.indexOf("a"));
		System.out.println(longStr.indexOf("b"));
		System.out.println(longStr.indexOf("f"));
		System.out.println(longStr.indexOf("b", longStr.indexOf("b") +1));
		System.out.println("------------");
		System.out.println(longStr.substring(2));
		System.out.println(longStr.substring(0, 3));

	}

}
