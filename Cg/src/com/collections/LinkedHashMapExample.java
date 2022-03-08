package com.collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {

	public static void main(String[] args) {
		LinkedHashMap<Integer,String> lhm = new LinkedHashMap<Integer,String>();
		lhm.put(101, "Michael");
		lhm.put(102, "Corleone");
		lhm.put(103, "Vitto");
		System.out.println(lhm);
		lhm.putIfAbsent(104, "Sonny");
		System.out.println(lhm);
		System.out.println(lhm.get(102));
		
		for(Map.Entry<Integer, String> m: lhm.entrySet()) {
			System.out.println(m.getKey()+"---"+m.getValue());
		}

	}

}
