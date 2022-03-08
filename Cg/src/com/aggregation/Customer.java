package com.aggregation;

class Address{
	String city;
	String state;
	public Address(String city, String state) {
		
		this.city = city;
		this.state = state;
	}
}


public class Customer {
	int custid;
	String custname;
	Address address;
	
	public Customer(int custid, String custname, Address address) {
		
		this.custid = custid;
		this.custname = custname;
		this.address = address;
	}
	
	public void display() {
		System.out.println("Customer id = "+custid+" Customer Name = "+custname);
		System.out.println("Customer City = "+address.city+" Customer State = "+address.state);
	}
	public static void main(String[] args) {
		Address address = new Address("Nashik","Maharashtra");
		Customer customer = new Customer(101,"Preyas",address);
		customer.display();
	}

}
