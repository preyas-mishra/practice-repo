class EmployeeInformation{
	int empId = 101;
	String empName = "Preyas";
	String empDesignation = "Analyst";
	double empSalary = 30000.00;

}
public class EmployeeOtherThanMain {

	public static void main(String[] args) {
		EmployeeInformation m1 = new EmployeeInformation();
		System.out.println("Employee Name : "+m1.empName+"\nEmployee ID : "+m1.empId+"\nEmployee Desination : "+m1.empDesignation+"\nEmployee Salary : "+m1.empSalary);

	}

}
