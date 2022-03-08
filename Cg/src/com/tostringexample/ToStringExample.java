package com.tostringexample;

class Product{
	int prodId;
	String prodName;
	int prodPrice;
	public Product(int prodId, String prodName, int prodPrice) {
		
		this.prodId = prodId;
		this.prodName = prodName;
		this.prodPrice = prodPrice;
	}
	
	public String toString() {
		return "Product Name = "+prodName+" Product ID = "+prodId+" Product Price = "+prodPrice;
	}
	
}

public class ToStringExample {

	public static void main(String[] args) {
		Product product = new Product(101,"Desktop",10000);
		Product product1 = new Product(102,"Laptop",50000);
		System.out.println(product.toString());
		System.out.println(product1.toString());
	}

}
