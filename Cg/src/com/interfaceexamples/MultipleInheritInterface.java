package com.interfaceexamples;

interface LGMonitor{
	void work();
	void lgPrice();
}

interface SamsungMonitor{
	void work();
	void samsungPrice();
}

public class MultipleInheritInterface implements LGMonitor,SamsungMonitor{
	
	public void work() {
		System.out.println("Monitor is working");
	}
	public void lgPrice() {
		System.out.println("LG Monitor price = 20000");
	}
	public void samsungPrice() {
		System.out.println("Samsung Monitor Price = 15000");
	}
	public static void main(String[] args) {
		MultipleInheritInterface multiple = new MultipleInheritInterface();
		multiple.work();
		multiple.lgPrice();
		multiple.samsungPrice();
	}

}
