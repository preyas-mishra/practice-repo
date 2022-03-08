package com.exceptionhandling;

import java.io.IOException;

public class ExceptionPropagationExample2 {
	void method1() throws IOException{
		throw new IOException();
	}
	void method2() throws IOException{
		method1();
	}
	void method3() {
		try {
			method2();
		}
		catch(Exception e) {
			System.out.println("Exception is handled");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionPropagationExample2 ex = new ExceptionPropagationExample2();
		ex.method3();
	}

}
