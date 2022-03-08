/*
 * By using Collections class, we can find out the max and min elements from collection
By using Collections class, we can sort the elements in collection
By using Collection class, we can change normal collection implemented classes synchrnoized.
SynchrnoizedCollection(), SynchrnoizedList(), SynchrnoizedSet(), SynchrnoizedMap()...etc.

*/
package com.collections;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsExample {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Preyas");
		al.add("Nilesh");
		al.add("Om");
		System.out.println(al);
		
		Collections.addAll(al, "NIraj");
		System.out.println(al);
		
		Collections.sort(al);
		System.out.println(al);
		
		Collections.sort(al,Collections.reverseOrder());
		System.out.println(al);
		

	}

}
