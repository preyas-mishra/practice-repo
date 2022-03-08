package com.covariantreturntyoe;

public class Father {
	Father getObject() {
		System.out.println("Father class ");
		return new Father();
	}
}
