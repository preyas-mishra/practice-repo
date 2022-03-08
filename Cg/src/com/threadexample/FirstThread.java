package com.threadexample;

public class FirstThread extends Thread{

	public void run() {
		System.out.println("First Thread is running");
	}
	public static void main(String[] args) {
		FirstThread f1 = new FirstThread();
		f1.start();

	}

}
