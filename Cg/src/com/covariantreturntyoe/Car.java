package com.covariantreturntyoe;

public class Car extends Vehicle {
	Car getObject() {
		System.out.println("Subclass method");
		return new Car();
	}
}
