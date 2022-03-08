package com.threadexample;

class Account{
	double balanceAmount = 10000;
	synchronized void withdraw (double withdrawAmount) {
		System.out.println("=====Withdraw Process Starts=====");
		System.out.println("Before withdraw->"+balanceAmount);
		if(balanceAmount<withdrawAmount) {
			System.out.println("Insufficient Balance, You have to deposit first");
			try {
				//wait(5000);
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
			balanceAmount = balanceAmount-withdrawAmount;
			System.out.println("After withdraw -> "+balanceAmount);
	}
	
	synchronized void deposit(double depositAmount) {
		System.out.println("======Deposit Process Starts=====");
		System.out.println("Before Deposit-> "+balanceAmount);
		balanceAmount = balanceAmount + depositAmount;
		System.out.println("After Deposit->"+balanceAmount);
		notify();
	}
}

public class InterThreadCommExample {

	public static void main(String[] args) {
		Account ac = new Account();
		new Thread() {
			public void run() {
				ac.withdraw(15000);
			}
		}.start();
		
		new Thread() {
			public void run() {
				ac.deposit(15000);
			}
		}.start();

	}

}
