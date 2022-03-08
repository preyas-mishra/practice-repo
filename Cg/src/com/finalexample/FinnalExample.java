package com.finalexample;

class Father{
	
	int age = 30;
	final void show() {
		System.out.println("My age is 30");
	}
	void display() {
		System.out.println("I am father");
	}
}

final class Son extends Father{
	int age = 6;

//	void show() {										//Compilation error because show() is final in Father	
//		System.out.println("My age is 6");
//	}
	
	void display() {
		System.out.println("I am son");
	}
}

//class Boy extends Son{								//Compilation error because Son class is final
//	
//}

public class FinnalExample {

	public static void main(String[] args) {
		Son son = new Son();
		son.display();
		System.out.println(son.age);

	}

}
