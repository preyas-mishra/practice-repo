package com.collections;

import java.util.HashMap;
import java.util.Map;

class ProductData{
	int id;
	String name;
	public ProductData(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
}
public class HashMapExample2 {

	public static void main(String[] args) {
		HashMap<Integer,ProductData>hm = new HashMap<Integer,ProductData>();
		ProductData prod1 = new ProductData(101,"Desktop");
		ProductData prod2 = new ProductData(102,"Laptop");
		ProductData prod3 = new ProductData(103,"Desktop");
		ProductData prod4 = new ProductData(104,"Keyboard");
		
		hm.put(1, prod1);
		hm.put(2, prod2);
		hm.put(3, prod3);
		hm.put(4, prod4);
		
		for(Map.Entry<Integer, ProductData> m:hm.entrySet()) {
			int key = m.getKey(); 
			ProductData prod = m.getValue();
			System.out.println(key);
			System.out.println(prod.id+"==="+prod.name);


	}
	}
}
