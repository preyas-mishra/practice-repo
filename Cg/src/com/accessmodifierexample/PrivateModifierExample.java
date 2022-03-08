package com.accessmodifierexample;

class Customer{
	private int age = 21;
	private Customer(){
		
	}
	
	private void customerInfo() {
		System.out.println("Age is "+age);
	}
}

public class PrivateModifierExample {
	void display() {
		System.out.println("I am in accessmodifierexample package & PrivateModifierExample class");
	}
	public static void main(String[] args) {
		//Customer cust = new Customer(); //Compilation error due to private
		
		//cust.age; 					//Compilation error due to private
		//cust.customerInfo(); 			//Compilation error due to private
	}

}
