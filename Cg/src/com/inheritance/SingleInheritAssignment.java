package com.inheritance;

class GrandFather{
	void eat() {
		System.out.println("Grandfather is eating");
	}
}

class Father extends GrandFather{
	void watch() {
		System.out.println("Father is Watching TV");
	}
}

public class SingleInheritAssignment {

	public static void main(String[] args) {
		Father father = new Father();
		father.eat();
		father.watch();

	}

}
