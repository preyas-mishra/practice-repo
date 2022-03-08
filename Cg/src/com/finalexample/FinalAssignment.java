package com.finalexample;

class Person{
	final int age = 10;
//	void changeAge() {
//		age+=1;								//Compilation error due to age is final			
//	}
	
	final void display() {
		System.out.println("Age is 10");
	}
}

class Employee extends Person{
	int salary = 20000;
	
//	void display() {
//		System.out.println("Age is 40");			//CE due to display() is final
//	}
}

public class FinalAssignment {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		System.out.println();

	}

}
