package com.collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		LinkedList<String> li = new LinkedList<String>();
		li.add("Preyas");
		li.add("Om");
		li.add("Niraj");
		
		System.out.println("Actual LinkedList = "+li);
		li.add(1, "Nilesh");
		System.out.println("Linkedlist after adding to first place = "+li);
		li.addFirst("Smith");													// Similar to li.offerFirst()	
																		//.addFirst() throws an (unchecked) exception,
																			//.offerFirst() returns boolean
		System.out.println("LinkedList after inserting element at front = "+li);
		li.addLast("Warner");													// Similar to li.offerLast()
		System.out.println("LinkedList after inserting element at Last = "+li);
		
		//li.pop();   Removes first element from LinkedList
		//li.peek();  Fetch the first element from LinkedList 	
		//li.poll();  Removes and returns the first element from LinkedList
		//li.pollFirst();
		//li.pollLast();
		
		System.out.println(li);
		Iterator<String>it = li.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
