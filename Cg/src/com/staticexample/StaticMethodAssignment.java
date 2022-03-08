package com.staticexample;

class Person{
	static String city = "Nashik";
	static void changeCity() {
		city = "Pune";
	}
	
	void display() {
		System.out.println("City is "+city);
	}
}

public class StaticMethodAssignment {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.changeCity();
		p1.display();
		System.out.println("City is "+Person.city);
		

	}

}
