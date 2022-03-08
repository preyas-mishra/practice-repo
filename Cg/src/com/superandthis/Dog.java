package com.superandthis;

public class Dog extends Animal{
	
	String type = "German";
	Dog(){
		super();
		this.type = type;
		System.out.println("Dog constructor");
	}
	
	void display() {
		System.out.println("I am dog class");
	}
	void printmsg() {
		System.out.println("Parent animal class type = "+super.type);
		System.out.println("Child animal class type = "+this.type);
	}
	
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.display();
		dog.printmsg();

	}

}
