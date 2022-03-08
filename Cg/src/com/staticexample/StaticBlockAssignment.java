package com.staticexample;

public class StaticBlockAssignment {
	static int a;
	static {
		a = 200;
		System.out.println("Static block is executed ");
	}
	public static void main(String[] args) {
		System.out.println(StaticBlockAssignment.a);

	}

}
