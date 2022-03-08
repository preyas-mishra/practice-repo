package com.collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		TreeSet<String> ts1 = new TreeSet<String>();
		ts1.add("Preyas");
		ts1.add("Ramesh");
		ts1.add("Aadesh");
		ts1.add("Suresh");
		ts1.add("Rakesh");
		System.out.println("Treeset Elements = "+ts1); //Treeset Elements = [Aadesh, Preyas, Rakesh, Ramesh, Suresh]
		System.out.println(ts1.headSet("Preyas"));     //[Aadesh]
		System.out.println(ts1.tailSet("Preyas"));     //[Preyas, Rakesh, Ramesh, Suresh]
		
		// Remove highest element and return that element
		System.out.println("Highest Value = "+ts1.pollFirst());
		System.out.println(ts1);
		
		// Remove lowest element and return that element
		System.out.println("Lowest Value = "+ts1.pollLast());
		System.out.println(ts1);
		// Ascending order
		System.out.println("Ascending order = ");
		Iterator it = ts1.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		//Descending order
		System.out.println("Descending order = ");
		Iterator it1 = ts1.descendingIterator();
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}
	}

}
