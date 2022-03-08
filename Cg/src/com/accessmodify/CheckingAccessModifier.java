package com.accessmodify;

class A{
	protected void method1() {
		System.out.println("Hello");
	}
}
 class B extends A{
	 public void method1() {
		 System.out.println("World");
	 }
 }


public class CheckingAccessModifier {

	public static void main(String[] args) {
		B b = new B();
		b.method1();

	}

}
