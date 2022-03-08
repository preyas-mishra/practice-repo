package com.threadexample;

class FifthThread implements Runnable{
	public void run(){
		for(int i=0;i<5;i++) {
			System.out.println("Fifth thread is running");
			try {
				Thread.sleep(1000);
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
	}
}
class SixthThread implements Runnable{
	public void run(){
		for(int i=0;i<5;i++) {
			System.out.println("Sixth thread is running");
			try {
				Thread.sleep(1000);
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
	}
}

public class ThreadRunnableExample {

	public static void main(String[] args) {
		FifthThread fifththread = new FifthThread();
		SixthThread sixththread = new SixthThread();
		Thread t1 = new Thread(fifththread);
		Thread t2 = new Thread(sixththread);
		t1.start();
		t2.start();
		

	}

}
