package com.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(101, "Preyas");
		hm.put(102, "Rakesh");
		hm.put(103, "Prakash");
		hm.put(104, "Preyas");
		System.out.println(hm);
		hm.put(102, "Suresh");
		System.out.println(hm);
		
		hm.putIfAbsent(102, "Kartik");
		hm.putIfAbsent(105, "Rohit");
		System.out.println(hm);
		
		HashMap<Integer,String> hm1 = new HashMap<Integer,String>();
		hm1.put(108, "abc");
		hm1.put(null, null);
		hm.putAll(hm1);
		System.out.println(hm);
		
		for(Map.Entry m : hm.entrySet()) {
			if(m.getValue()=="Preyas") {
			System.out.println(m.getKey()+" == "+m.getValue());
			}
		}
	}

}
