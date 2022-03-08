package com.stringexample;

public class StringImmutable {

	public static void main(String[] args) {
		String s = "Capgemini";
		String s1 = "India";
		s.concat(s1);
		System.out.println(s);
		
		s = s.concat(s1);
		System.out.println(s);

	}

}
