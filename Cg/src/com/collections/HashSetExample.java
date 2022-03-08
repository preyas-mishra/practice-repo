package com.collections;

import java.util.HashSet;
import java.util.LinkedList;

public class HashSetExample {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("Preyas");
		hs.add("Nilesh");
		hs.add("Om");
		hs.add("Preyas");
		System.out.println(hs);
		HashSet<String> hs1 = new HashSet<String>();
		hs1.add("Niraj");
		hs1.addAll(hs);
		System.out.println(hs1);
		LinkedList<String> li = new LinkedList<String>();
		li.add("Suresh");
		li.add("Ramesh");
		li.add("Rakesh");
		hs1.addAll(li);
		System.out.println(hs1);
		System.out.println("Hashset1 size = "+hs1.size());
//		hs1.clear();
//		System.out.println("Hashset1 size = "+hs1.size());
		System.out.println(hs1.containsAll(li));
		hs1.removeIf(element->element.contains("Ramesh"));
		System.out.println(hs1);
		
		}

}
