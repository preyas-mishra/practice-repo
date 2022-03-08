package com.collections;

import java.util.Iterator;
import java.util.TreeSet;

class ProductInfo implements Comparable<ProductInfo>{
	int id;
	String name;
	public ProductInfo(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public int compareTo(ProductInfo prod) {
		if(id>prod.id) {
			return 1;
		}
		else if(id<prod.id) {
			return -1;
		}
		else {
			return 0;
		}
	}
	
}
public class TreeSetExample2 {

	public static void main(String[] args) {
		ProductInfo prod1 = new ProductInfo(103,"Laptop");
		ProductInfo prod2 = new ProductInfo(101,"Desktop");
		ProductInfo prod3 = new ProductInfo(102,"Keyboard");
		
		TreeSet<ProductInfo> ts = new TreeSet<ProductInfo>();
		ts.add(prod1);
		ts.add(prod2);
		ts.add(prod3);
		Iterator it = ts.iterator();
		while(it.hasNext()) {
			ProductInfo prod = (ProductInfo)it.next();
			System.out.println("Product ID = "+prod.id+" Product Name = "+prod.name);
		}

	}

}
