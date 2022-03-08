package com.interfaceexamples;

interface Person{
	void m1();
	void m2();
	void m3();
	void m4();
}

abstract class Man implements Person {
	public void m1() {
		System.out.println("Method 1");
	}
}

class Boy extends Man{
	public void m2() {
		System.out.println("Method 2");
	}
	public void m3() {
		System.out.println("Method 3");
	}
	public void m4() {
		System.out.println("Method 4");
	}
	
}

public class InterfaceAbstract {

	public static void main(String[] args) {
		Person person = new Boy();
		person.m1();
		person.m2();

	}

}
