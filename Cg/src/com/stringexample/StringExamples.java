package com.stringexample;

public class StringExamples {

	public static void main(String[] args) {
		char ch[] = {'P','R','E','Y','A','S'};
		String s1 = new String(ch);
		System.out.println(s1);
		
		String s2 = " Capgemini";
		System.out.println(s2);
		
		String s3 = new String("Capgemini");
		System.out.println(s3);
		
		String s4 = "";
		
		System.out.println("Length = "+s1.length());
		System.out.println("Uppercase = "+s1.toUpperCase());
		System.out.println("Lowecase = "+s1.toLowerCase());
		
		System.out.println(s2.length());
		System.out.println(s2.trim().length());
		System.out.println(s1.charAt(3));
		
		System.out.println("String concat = "+s1.concat(s3));
		System.out.println("String equals = "+s1.equals(s3));
		System.out.println("String contains = "+s1.contains("REY"));
		System.out.println("String substring = "+s1.substring(3, 5));
		System.out.println("String startswith = "+s1.startsWith("P"));
		System.out.println("String is empty = "+s1.isEmpty());
		System.out.println("String empty = "+s4.isEmpty());
		System.out.println("String indes of g = "+s3.indexOf("g"));

	}

}
