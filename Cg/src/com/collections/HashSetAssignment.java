package com.collections;

import java.util.HashSet;
import java.util.Iterator;

class Student{
	int studentRollNo;
	String studentFirstName;
	String studentLastName;
	int studentMarks;
	public Student(int studentRollNo, String studentFirstName, String studentLastName, int studentMarks) {
		this.studentRollNo = studentRollNo;
		this.studentFirstName = studentFirstName;
		this.studentLastName = studentLastName;
		this.studentMarks = studentMarks;
	}
	
}
public class HashSetAssignment {

	public static void main(String[] args) {
		Student student1 = new Student(10,"Steve","Smith",90);
		Student student2 = new Student(13,"David","Warner",89);
		Student student3 = new Student(17,"Joe","Root",84);
		Student student4 = new Student(20,"Pat","Cummins",80);
		HashSet<Student> hs = new HashSet<Student>();
		hs.add(student1);
		hs.add(student2);
		hs.add(student3);
		hs.add(student4);
		Iterator<Student> it = hs.iterator();
		while(it.hasNext()) {
			Student student = it.next();
			System.out.println("Student ID = "+student.studentRollNo);
			System.out.println("Student First Name = "+student.studentFirstName);
			System.out.println("Student Last Name = "+student.studentLastName);
			System.out.println("Student Marks = "+student.studentMarks);
			System.out.println("----------------------------------------");
		}

	}

}
