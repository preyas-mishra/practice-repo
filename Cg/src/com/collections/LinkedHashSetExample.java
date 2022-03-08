package com.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetExample {

	public static void main(String[] args) {
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		lhs.add("Preyas");
		lhs.add("Ramesh");
		lhs.add("Rakesh");
		lhs.add("Suresh");
		
		System.out.println(lhs);
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("abc");
		al.add("xyz");
		al.add("pqr");
		lhs.addAll(al);
		System.out.println(lhs);
		
		//System.out.println(lhs.toString());
		Iterator it = lhs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
