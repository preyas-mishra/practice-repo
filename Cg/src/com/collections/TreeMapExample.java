package com.collections;

import java.util.Iterator;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		TreeMap<Integer, String> tm = new TreeMap<Integer,String>();
		tm.put(1, "Preyas");
		tm.put(2, "Lewis");
		tm.put(3, "Max");
		System.out.println(tm);
		System.out.println(tm.headMap(2));
		System.out.println(tm);
		System.out.println(tm.tailMap(2));
		System.out.println(tm);
		// Remove highest element and return that element
		System.out.println("Highest Value = "+tm.pollFirstEntry());
		System.out.println(tm);
				
		// Remove lowest element and return that element
		System.out.println("Lowest Value = "+tm.pollLastEntry());
		System.out.println(tm);
		
		
	}

}
