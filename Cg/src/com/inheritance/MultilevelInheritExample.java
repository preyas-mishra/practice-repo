package com.inheritance;

class Animal1{
	void eat() {
		System.out.println("Animal is eating");
	}
}

class Dog1 extends Animal1{
	void bark() {
		System.out.println("Dog is barking");
	}
}

class Tommy extends Dog1{
	void play() {
		System.out.println("Tommy is playing");
	}
}

public class MultilevelInheritExample {

	public static void main(String[] args) {
		Tommy t1 = new Tommy();
		t1.eat();
		t1.bark();
		t1.play();

	}

}
