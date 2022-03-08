package com.polymorphism;
class Mobile{
	void work() {
		System.out.println("Mobile is working");
	}
}

class SamsungMobile extends Mobile{
	void work() {
		System.out.println("Samsung mobile is working");
	}
}
public class OverrideExample {

	public static void main(String[] args) {
		SamsungMobile s1 = new SamsungMobile();
		s1.work();

	}

}
