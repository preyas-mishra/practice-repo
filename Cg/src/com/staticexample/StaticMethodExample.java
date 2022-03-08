package com.staticexample;

class StaticExample1{
	static int age1 = 20;
}

public class StaticMethodExample {
	static int age = 30;
	String name = "Preyas";
	
	public static void display() {
		System.out.println("Static method");
	}
	public static void main(String[] args) {
		System.out.println(StaticExample1.age1);

	}

}
