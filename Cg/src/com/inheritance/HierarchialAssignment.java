package com.inheritance;

class GrandFather2{
	void eat() {
		System.out.println("Grandfather is eating");
	}
}

class Father2 extends GrandFather2{
	void watch() {
		System.out.println("Father is watching TV");
	}
}

class Uncle extends GrandFather2{
	void watch() {
		System.out.println("Uncle is Watching TV");
	}
}
public class HierarchialAssignment {

	public static void main(String[] args) {
		Father2 father = new Father2();
		father.eat();
		father.watch();
		Uncle uncle = new Uncle();
		uncle.eat();
		uncle.watch();

	}

}
