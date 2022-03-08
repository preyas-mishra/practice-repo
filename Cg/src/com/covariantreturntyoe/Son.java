package com.covariantreturntyoe;

public class Son extends Father{
	Son getObject() {
		System.out.println("Son class");
		return new Son();
	}
}
