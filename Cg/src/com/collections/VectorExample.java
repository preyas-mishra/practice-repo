package com.collections;

import java.util.Enumeration;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		Vector<String> v = new Vector<String>();
		v.add("Preyas");
		v.addElement("Nilesh");
		v.addElement("Om");
		v.add("Niraj");
		System.out.println("Actual Vector = "+v);
		v.remove("Om");
		System.out.println("Vector after deletion = "+v);
		Enumeration<String> e = v.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
	}

}
