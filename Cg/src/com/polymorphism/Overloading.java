package com.polymorphism;

class CalculatorTwoDigits{
	int add(int a ,int b) {
		return a+b;
	}
}

class CalculateThreeDigits extends CalculatorTwoDigits{
	int add(int a,int b,int c) {
		return a+b+c;
	}
}
public class Overloading {

	public static void main(String[] args) {
		CalculateThreeDigits c1 = new CalculateThreeDigits();
		System.out.println(c1.add(5, 1,6));

	}

}
