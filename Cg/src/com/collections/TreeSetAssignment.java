package com.collections;

import java.util.Iterator;
import java.util.TreeSet;

class Employee1 implements Comparable<Employee1>{
	int empId;
	String empName;
	String empDesignation;
	double empSalary;
	public Employee1(int empId, String empName, String empDesignation, double empSalary) {
		this.empId = empId;
		this.empName = empName;
		this.empDesignation = empDesignation;
		this.empSalary = empSalary;
	}
	
	public int compareTo(Employee1 emp) {
		if(empSalary>emp.empSalary) {
			return -1;
		}
		else if(empSalary<emp.empSalary) {
			return 1;
		}
		else {
			return 0;
		}
	}
	
}

public class TreeSetAssignment {

	public static void main(String[] args) {
		Employee1 emp1 = new Employee1(101,"Preyas","Analyst",30000.00);
		Employee1 emp2 = new Employee1(102,"Rakesh","Senior Analyst",60000.00);
		Employee1 emp3 = new Employee1(103,"Nilesh","Analyst",33000.00);
		TreeSet<Employee1> ts = new TreeSet<Employee1>();
		ts.add(emp1);
		ts.add(emp2);
		ts.add(emp3);
		Iterator it = ts.iterator();
		while(it.hasNext()) {
			Employee1 emp = (Employee1)it.next();
			System.out.println("Employee Name = "+emp.empName);
			System.out.println("Employee Id = "+emp.empId);
			System.out.println("Employee Designation = "+emp.empDesignation);
			System.out.println("Employee Salary = "+emp.empSalary);
			System.out.println("-----------------------------------");
		}
	}

}
