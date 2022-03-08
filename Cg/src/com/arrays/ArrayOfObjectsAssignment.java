package com.arrays;

class Employee{
	int empId;
	String empName;
	double empSalary;
	public Employee(int empId, String empName, double empSalary) {
		
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
	}
	
}

public class ArrayOfObjectsAssignment {

	public static void main(String[] args) {
		Employee[] empArray = new Employee[5];
		empArray[0] = new Employee(101,"Preyas",20000.00);
		empArray[1] = new Employee(102,"Nilesh",30000.50);
		empArray[2] = new Employee(103,"Om",25450.87);
		empArray[3] = new Employee(104,"Sagar",22000.00);
		empArray[4] = new Employee(105,"Niraj",19000.00);
		System.out.println("----Using For Loop----");
		for(int i=0;i<empArray.length;i++) {
			System.out.println("Employee Id = "+empArray[i].empId);
			System.out.println("Employee Name = "+empArray[i].empName);
			System.out.println("Employee Salary = "+empArray[i].empSalary);
			System.out.println("-------------------------------------------------");
		}
		
		System.out.println("----Using ForEachLoop----");
		for(Employee employee:empArray) {
			System.out.println("Employee Id = "+employee.empId);
			System.out.println("Employee Name = "+employee.empName);
			System.out.println("Employee Salary = "+employee.empSalary);
			System.out.println("-------------------------------------------------");
		}
		
	}

}
