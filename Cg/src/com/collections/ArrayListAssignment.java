package com.collections;

import java.util.ArrayList;
import java.util.Iterator;

class Employee{
	int empId;
	String empName;
	double empSalary;
	String empDesignation;
	public Employee(int empId, String empName, double empSalary, String empDesignation) {
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
		this.empDesignation = empDesignation;
	}
	
}

public class ArrayListAssignment {

	public static void main(String[] args) {
		Employee e1 = new Employee(101,"Preyas",30000.00,"Analyst");
		Employee e2 = new Employee(102,"Nilesh",50000.00,"Senior Analyst");
		ArrayList<Employee> arraylist = new ArrayList<Employee>();
		arraylist.add(e1);
		arraylist.add(e2);
		Iterator it = arraylist.iterator();
		while(it.hasNext()) {
			Employee employee = (Employee)it.next();
			System.out.println("Employee ID = "+employee.empId);
			System.out.println("Employee Name = "+employee.empName);
			System.out.println("Employee Salary = "+employee.empSalary);
			System.out.println("Employee Designation = "+employee.empDesignation);
			System.out.println("---------------------------------");
		}
	}

}
