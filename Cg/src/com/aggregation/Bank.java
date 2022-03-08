package com.aggregation;

class Customer1{
	String custFirstName;
	String custLastName;
	int custId;
	
	public Customer1(String custFirstName,String custLastName, int custId) {
		
		this.custFirstName = custFirstName;
		this.custLastName = custLastName;
		this.custId = custId;
	}
	
}

public class Bank {
	int bankId;
	String bankName;
	int accountNo;
	Customer1 customer;
	public Bank(int bankId, String bankName, int accountNo, Customer1 customer) {
		super();
		this.bankId = bankId;
		this.bankName = bankName;
		this.accountNo = accountNo;
		this.customer = customer;
	}
	
	public void display() {
		System.out.println("Customer First Name = "+ customer.custFirstName+"\nCustomer Last Name = "+ customer.custLastName+"\nCustomer Id = "+customer.custId);
		System.out.println("\nBank ID = "+bankId+ "\nBank Name = "+bankName+"\nAccount no = "+accountNo);
	}

	public static void main(String[] args) {
		Customer1 customer = new Customer1("Preyas","Mishra", 201);
		Bank bank = new Bank(1001,"Bank of Baroda",12345,customer);
		bank.display();
	}

}
