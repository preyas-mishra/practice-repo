package com.interfaceexamples;

interface Bank{
	int fixedDeposit();
	int recurringDeposit();
}

class HdfcBank implements Bank{
	public int fixedDeposit() {
		return 5;
	}
	public int recurringDeposit() {
		return 5;
	}
}

class IciciBank implements Bank{
	public int fixedDeposit() {
		return 6;
	}
	public int recurringDeposit() {
		return 6;
	}
}

public class InterfaceExample {

	public static void main(String[] args) {
		Bank bank = new HdfcBank();
		System.out.println(bank.fixedDeposit());
	}

}
