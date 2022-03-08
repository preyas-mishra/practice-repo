package com.interfaceexamples;

interface ProductInfo{
	abstract void abstractMethod();
	default void defaultMethod() {
		System.out.println("Default method implementation");
	}
	static void staticMethod(){
		System.out.println("Static method implementation");
	}
}

class Product1 implements ProductInfo{
	public void abstractMethod() {
		System.out.println("Abstract method implementation");
	}
}


public class InterfaceStaticExample {

	public static void main(String[] args) {
		Product1 product = new Product1();
		product.abstractMethod();
		product.defaultMethod();
		ProductInfo.staticMethod();
	}

}
