package com.inheritance;

class Father4{
	void method1() {
		System.out.println("Father method1");
	}
}

public class OverrideExample extends Father4{
	public void method1() {
		System.out.println("Child method1");
	}
	public void method2() {
		System.out.println("Child method2");
	}
	public static void main(String[] args) {
		OverrideExample a1 = new OverrideExample();
		a1.method1();
		a1.method2();
		
		//OverrideExample b1 = new Father4(); // Compilation Error
		
		Father4 f2 = new Father4();
			f2.method1();
		//	f2.method2(); //Compilation Error
		
		
		Father4 f1 = new OverrideExample();
		f1.method1();
		// f1.method2(); //Compilation Error
	}

}
