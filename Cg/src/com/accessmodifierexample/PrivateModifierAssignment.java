package com.accessmodifierexample;

class Employee{
	private int empId=101;
	private String empName="Preyas";
	private double empSalary=50000;
	
	private void empInfo() {
		System.out.println("Employee Name = "+empName+" Employee ID = "+empId+" Employee Salary = "+empSalary);
	}
}

public class PrivateModifierAssignment {

	public static void main(String[] args) {
		Employee e1 = new Employee();

//		System.out.println(e1.empId);
//		System.out.println(e1.empName);
//		System.out.println(e1.empSalary);                       // Compilation error due to private
//		e1.empInfo();

		System.out.println("Compilation error due to private");
	}

}
