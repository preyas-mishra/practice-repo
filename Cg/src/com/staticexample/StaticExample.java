package com.staticexample;

public class StaticExample {
	int id;
	String name;
	static String employer = "Capgemini";
	
	public StaticExample(int id, String name) {
		
		this.id = id;
		this.name = name;
	}
	
	void displayInfo() {
		System.out.println("Emp id = "+this.id+ " Emp Name = "+this.name+ " Employer Name = "+employer);
	}
	
	public static void main(String[] args) {
		StaticExample s1 = new StaticExample(101,"Preyas");
		s1.displayInfo();

	}

}
