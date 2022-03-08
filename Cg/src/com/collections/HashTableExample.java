package com.collections;

import java.util.Hashtable;

public class HashTableExample {

	public static void main(String[] args) {
		Hashtable<Integer,String> ht = new Hashtable<Integer,String>();
		ht.put(101, "Bat");
		ht.put(102, "Ball");
		ht.put(103, "Stumps");
		
		System.out.println(ht);
		ht.putIfAbsent(104, "Gloves");
		System.out.println(ht);
		
		System.out.println("Value of Map id 101 is = "+ht.getOrDefault(101, "Not Found"));
		System.out.println("Value of Map id 105 is = "+ht.getOrDefault(105, "Not Found"));

	}

}
