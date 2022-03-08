package com.arrays;

class Product{
	int productId;
	String productName;
	public Product(int productId, String productName) {
		
		this.productId = productId;
		this.productName = productName;
	}
	
	
}

public class ArrayOfObjectsExample {

	public static void main(String[] args) {
		Product[] productArray = new Product[3];
		productArray[0] = new Product(101,"Laptop");
		productArray[1] = new Product(102,"Desktop");
		productArray[2] = new Product(103,"Keyboard");
		System.out.println("--Using For Loop--");
		for(int i=0;i<productArray.length;i++) {
			System.out.println("Product ID = "+productArray[i].productId+" Product Name = "+productArray[i].productName);
		}
		System.out.println("--Using ForEach Loop---");
		for(Product product:productArray) {
			System.out.println("Product ID = "+product.productId+" Product Name = "+product.productName);
		}

	}

}
