package com.covariantreturntyoe;

public class Vehicle {
	Vehicle getObject() {
		System.out.println("Base class method");
		return new Vehicle();
	}
}
