package com.polymorphism;

class Bank{
	double getFixedDeposit() {
		return 4.0;
	}
	
	double getReDeposit() {
		return 4.0;
	}
}

class IciciBank extends Bank{
	double fixedDeposit() {
		return 5.0;
	}
	
	double reDeposit() {
		return 5.5;
	}
}

class HdfcBank extends Bank{
	double getFixedDeposit() {
		return 6.0;
	}
	
	double getReDeposit() {
		return 6.5;
	}
}

class KotakBank extends Bank{
	double getFixedDeposit() {
		return 7.0;
	}
	
	double getReDeposit() {
		return 7.5;
	}
}

public class BankInfo {

	public static void main(String[] args) {
	HdfcBank hdfcbank = new HdfcBank();
	System.out.println(hdfcbank.getFixedDeposit());
	IciciBank icicibank = new IciciBank();
	System.out.println(icicibank.getReDeposit());
	KotakBank kotakbank = new KotakBank();
	System.out.println(kotakbank.getFixedDeposit());
	}

}
