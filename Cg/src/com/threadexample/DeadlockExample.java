package com.threadexample;

public class DeadlockExample {

	public static void main(String[] args) {
		final String resource1 = "Preyas";
		final String resource2 = "Mishra";
		Thread t1 = new Thread() {
			public void run() {
				synchronized(resource1) {
					System.out.println("Thread1 locked resource 1");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				
				synchronized(resource2) {
					System.out.println("Thread2 locked resource 2");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				}
			}
		};
		Thread t2 = new Thread() {
			public void run() {
				synchronized(resource2) {
					System.out.println("Thread2 locked resource 2");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				
				synchronized(resource1) {
					System.out.println("Thread2 locked resource 1");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			}
		};
		t1.start();
		t2.start();
	}
}
