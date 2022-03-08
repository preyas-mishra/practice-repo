package com.exceptionhandling;


public class ExceptionPropagationEx {
	void method1() {
		int data = 30/0;
	}
	void method2() {
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
		ExceptionPropagationEx ex = new ExceptionPropagationEx();
		ex.method3();
	}

}
