package com.collections;

import java.util.ArrayList;
import java.util.Iterator;

class Product{
	String prodName;
	int prodId;
	public Product(String prodName, int prodId) {
		
		this.prodName = prodName;
		this.prodId = prodId;
	}
	
}
public class ArrayListExample2 {

	public static void main(String[] args) {
		Product prod1 = new Product("Laptop",50000);
		Product prod2 = new Product("Desktop",10000);
		ArrayList<Product> arraylist= new ArrayList<Product>();
		arraylist.add(prod1);
		arraylist.add(prod2);
		Iterator it = arraylist.iterator();
		while(it.hasNext()) {
			Product prod = (Product)it.next();
			System.out.println("Product id = "+prod.prodId+" Product Name = "+prod.prodName);
		}
	}

}
