package com.exceptionhandling;

public class ExceptionHandlingExample {

	public static void main(String[] args) {
		int firstNumber = 10;
		int secondNumber = 0;
		try {
		int result = firstNumber/secondNumber;
		}catch(ArithmeticException e) {
			System.out.println(e);
		}
		System.out.println("Remaining lines of code");

	}

}
