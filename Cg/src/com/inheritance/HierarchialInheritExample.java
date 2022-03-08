package com.inheritance;

class Animal3{
	void eat() {
		System.out.println("Animal is eating");
	}
}

class Dog3 extends Animal3{
	void bark() {
		System.out.println("Dog is barking");
	}
}

class Cat extends Animal3{
	void meow() {
		System.out.println("Cat is meowing");
	}
}
public class HierarchialInheritExample {

	public static void main(String[] args) {
		Dog3 d1 = new Dog3();
		Cat c1 = new Cat();
		d1.eat();
		d1.bark();
		c1.eat();
		c1.meow();
	}

}
