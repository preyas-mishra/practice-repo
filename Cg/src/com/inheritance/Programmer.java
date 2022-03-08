package com.inheritance;

class Employee{
	double salary = 20000;
}

public class Programmer extends Employee{
	int bonus = 2000;
	public static void main(String[] args) {
		Programmer prog = new Programmer();
		System.out.println("Salary = "+prog.salary);
		System.out.println("Bonus = "+prog.bonus);

	}

}
