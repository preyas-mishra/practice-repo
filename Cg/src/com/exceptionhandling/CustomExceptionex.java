package com.exceptionhandling;

public class CustomExceptionex  {
	static void vote(int age) throws InvalidAgeException{
		if(age<18) {
			throw new InvalidAgeException("Age is less than 18");
		}
		else {
			System.out.println("Age is okay");
		}
	}
	public static void main(String[] args) {

		try {
			vote(8);
		}
		catch(Exception e) {
			System.out.println("Error is occured due to = "+e);
		}

	}

}
