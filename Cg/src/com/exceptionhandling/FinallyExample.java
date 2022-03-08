package com.exceptionhandling;

public class FinallyExample {

	public static void main(String[] args) {
		int firstNumber = 10;
		int secondNumber = 0;
		int result;
		try {
			result = firstNumber/secondNumber;
			System.out.println(result);          //This line never run if secondNumber is 0
		}
		catch(ArithmeticException e) {
			System.out.println(e);
			//e.printStackTrace();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("This block will always execute");
		}
		

	}

}
