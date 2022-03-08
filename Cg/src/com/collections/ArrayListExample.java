package com.collections;

import java.util.ArrayList;
import java.util.List;


public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Preyas");
		al.add("Prashant");
		al.add("Mishra");
		System.out.println(al);
		for(String element:al) {
			System.out.println(element);
		}
		System.out.println("Element at index 2 is = "+al.get(2));
		System.out.println("Does arraylist contains Preyas = "+al.contains("Preyas"));
		System.out.println("Array list is empty = "+al.isEmpty());
		System.out.println("Size of array = "+al.size());

}
}
