package com.threadexample;

public class SecondThread implements Runnable {
	public void run(){
		System.out.println("Using runnable interface thread is running");
	}
	public static void main(String[] args) {
		SecondThread s1 = new SecondThread();
		Thread t1 = new Thread(s1);
		t1.start();

	}

}

// implemets runnable is recommended for creating threads compared to extends thread class as still we can
// extend other class properties and methods in to our class
