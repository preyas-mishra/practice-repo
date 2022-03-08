package com.threadexample;

class TableCreation{
	void printTable(int n) {
		
		synchronized(this) {
			System.out.println("First Line");
		for(int i=1;i<=5;i++) {
			System.out.println(n+"X"+i+"="+n*i);
		}
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("100th line");
		}
		
	}
}

class MyThread1 extends Thread{
	TableCreation t;
	MyThread1(TableCreation t){
		this.t = t;
	}
	public void run() {
		t.printTable(2);
	}
}
class MyThread2 extends Thread{
	TableCreation t;
	MyThread2(TableCreation t){
		this.t = t;
	}
	public void run() {
		t.printTable(3);
	}
}

public class SynchronizedExample {

	public static void main(String[] args) {
		TableCreation t = new TableCreation();
		MyThread1 mt1 = new MyThread1(t);
		MyThread2 mt2 = new MyThread2(t);
		mt1.start();
		mt2.start();
	}

}
