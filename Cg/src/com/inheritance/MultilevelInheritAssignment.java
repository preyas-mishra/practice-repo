package com.inheritance;

class GrandFather1{
	void eat() {
		System.out.println("Grandfather is eating");
	}
}
class Father1 extends GrandFather1{
	void watch() {
		System.out.println("Father is watching TV");
	}
}

class Son extends Father1{
	void play() {
		System.out.println("Son is playing");
	}
}
public class MultilevelInheritAssignment {

	public static void main(String[] args) {
		Son s1 = new Son();
		s1.eat();
		s1.watch();
		s1.play();

	}

}
