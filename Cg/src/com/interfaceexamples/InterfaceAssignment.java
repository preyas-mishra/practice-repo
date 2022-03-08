package com.interfaceexamples;

interface Product{
	int productPrice();
	int productId();
}

class Mobile implements Product{
	public int productPrice() {
		return 10000;
	}
	public int productId() {
		return 201;
	}
}
class Desktop implements Product{
	public int productPrice() {
		return 50000;
	}
	public int productId() {
		return 101;
	}
}
public class InterfaceAssignment {

	public static void main(String[] args) {
		Product product = new Mobile();
		System.out.println(product.productPrice());

	}

}
