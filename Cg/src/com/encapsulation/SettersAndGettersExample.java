package com.encapsulation;

class Employee{
	private int empId;
	private String empName;
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
}

public class SettersAndGettersExample {

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setEmpId(101);
		emp.setEmpName("Preyas");
		
		Employee emp1 = new Employee();
		emp1.setEmpId(201);
		emp1.setEmpName("Nilesh");
		
		System.out.println("Employee ID: "+emp.getEmpId()+" Employee name: "+emp.getEmpName());
		System.out.println("Employee ID: "+emp1.getEmpId()+" Employee name: "+emp1.getEmpName());
	}

}
