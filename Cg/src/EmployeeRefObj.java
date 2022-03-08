class EmployeeData{
	int empId;
	String empName;
	String empDesignation;
	double empSalary;
}
public class EmployeeRefObj {
	public static void main(String[] args) {
		EmployeeData employee1 = new EmployeeData();
		employee1.empId = 101;
		employee1.empName = "Preyas";
		employee1.empDesignation = "Analyst";
		employee1.empSalary = 30000.00;
		System.out.println("Employee Name : "+employee1.empName+"\nEmployee ID : "+employee1.empId+"\nEmployee Desination : "+employee1.empDesignation+"\nEmployee Salary : "+employee1.empSalary);
	}
}
