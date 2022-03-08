package com.regexexamples;
import java.util.regex.*;
public class RegexExample {

	public static void main(String[] args) {
		System.out.println(Pattern.matches("[0-9]{10}", "9478104710488"));
		System.out.println(Pattern.matches("[0-9]{10,13}", "9478104710488"));
		System.out.println(Pattern.matches("\\d{10}", "9478104710488"));
		System.out.println(Pattern.matches("[0-9]{10,}", "9478104710488"));
		
		System.out.println(Pattern.matches("[capgemini]", "k"));
		System.out.println(Pattern.matches("[capgemini]", "g"));
		
		System.out.println(Pattern.matches("[a-z]*", "preyas"));
//		System.out.println(Pattern.matches("[0-9]{10,}", "9478104710488"));
//		System.out.println(Pattern.matches("[0-9]{10,}", "9478104710488"));
//		
//		System.out.println(Pattern.matches("[0-9]{10,}", "9478104710488"));
//		
		

	}

}
