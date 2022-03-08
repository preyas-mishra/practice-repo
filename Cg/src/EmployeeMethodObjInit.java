class DataOfEmployee{
	int empId;
	String empName;
	String empDesignation;
	double empSalary;
	
	void saveEmployeeData(int employeeId,String employeeName, String employeeDesignation, double employeeSalary) {
		empId = employeeId;
		empName = employeeName;
		empDesignation = employeeDesignation;
		empSalary = employeeSalary;
	}
	
	void display() {
		System.out.println("Employee Name : "+empName+"\nEmployee ID : "+empId+"\nEmployee Desination : "+empDesignation+"\nEmployee Salary : "+empSalary);
	}
}
public class EmployeeMethodObjInit {

	public static void main(String[] args) {
		DataOfEmployee d1 = new DataOfEmployee();
		d1.saveEmployeeData(101, "Preyas", "Analyst", 30000.00);
		d1.display();

	}

}
