package com.assignments;

final class Employee{
	final int empId;
	final String empName;
	final int empSalary;
	public Employee(int empId, String empName, int empSalary) {
		
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
	}
	public int getEmpId() {
		return empId;
	}
	public String getEmpName() {
		return empName;
	}
	public int getEmpSalary() {
		return empSalary;
	}
	
}

public class EmployeeImmutable {

	public static void main(String[] args) {
		Employee employee = new Employee(101,"Preyas",30000);
		int empid = employee.getEmpId();
		String name = employee.getEmpName();
		int salary = employee.getEmpSalary();
		System.out.println("Employee id = "+empid+" Employee name = "+name+" Employee salary =  "+salary);

	}

}
