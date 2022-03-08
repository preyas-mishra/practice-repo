package com.abstractclass;

abstract class Car{
	Car(){
		System.out.println("Object is created");
	}
	
	void changeGear() {
		System.out.println("Change the gear");
	}
	
	abstract void run();
}

class KiaCar extends Car{
	void run() {
		System.out.println("Kia car is running");
	}
}

public class AbstractClassExample {

	public static void main(String[] args) {
		KiaCar car = new KiaCar();
		car.run();
		car.changeGear();

	}

}
