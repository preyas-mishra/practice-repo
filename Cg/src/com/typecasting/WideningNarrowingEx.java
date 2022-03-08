package com.typecasting;

public class WideningNarrowingEx {

	public static void main(String[] args) {
		//Widening
		int a = 10;
		long b = a;
		float c = b;
		System.out.println(a+" "+b+" "+c);
		//Narrowing
		double x= 100.00;
		long y = (long)x;
		short z = (short)y;
		System.out.println(x+" "+y+" "+z);
	}

}
