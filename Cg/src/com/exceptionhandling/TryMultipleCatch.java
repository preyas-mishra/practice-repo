package com.exceptionhandling;

public class TryMultipleCatch {

	public static void main(String[] args) {
		int array[] = new int[4];
		try {
			System.out.println(array[5]);
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception occurs");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException occurs");
		}
		catch(NullPointerException e) {
			System.out.println("Null Pointer Exception");
		}

	}

}
