package com.threadexample;
class ThirdThread extends Thread{
	
	public void run() {
		for(int i=0;i<5;i++) {
		System.out.println("Third thread is running");
			try {
				Thread.sleep(1000);
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
	}
}
class FourthThread extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
		System.out.println("Fourth thread is running");
		try {
			Thread.sleep(1000);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		}
	}
}
public class ThreadTesting {

	public static void main(String[] args) {
		ThirdThread t1 = new ThirdThread();
		FourthThread t2 = new FourthThread();
		t1.start();
		t2.start();
	}

}
