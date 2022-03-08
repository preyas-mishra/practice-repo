package com.abstractclass;

abstract class Bank{
	abstract double getFixedDeposit();
	double getReccuringDeposit(){
		return 4.0;
	}
}

class IciciBank extends Bank{
	double getFixedDeposit() {
		return 5.0;
	}
	
	double getReccuringDeposit() {
		return 5.5;
	}
}

class HdfcBank extends Bank{
	double getFixedDeposit() {
		return 6.0;
	}
	
	double getReccuringDeposit() {
		return 6.5;
	}
}

class KotakBank extends Bank{
	double getFixedDeposit() {
		return 7.0;
	}
	
	double getReccuringDeposit() {
		return 7.5;
	}
}

public class AbstractClassAssignment {

	public static void main(String[] args) {
		Bank bank = new KotakBank();
		System.out.println(bank.getFixedDeposit());
		System.out.println(bank.getReccuringDeposit());
		
		Bank bank1 = new IciciBank();
		System.out.println(bank1.getFixedDeposit());
	}

}
