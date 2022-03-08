package com.inheritance;
class Animal{
	void eat() {
		System.out.println("Animal is Eating..");
	}
}

class Dog extends Animal{
	void bark() {
		System.out.println("Dog is Barking");
	}
}
public class SingleInheritExample {

	public static void main(String[] args) {
		Dog d1 = new Dog();
		d1.eat();
		d1.bark();

	}

}
