package com.superandthis;

class Subject{
	protected String subjectName;
	protected int subjectId;
	public Subject(String subjectName, int subjectId) {
		
		this.subjectName = subjectName;
		this.subjectId = subjectId;
	}
}

class Mathematics extends Subject{
	protected int chapters;

	public Mathematics(String subjectName, int subjectId, int chapters) {
		super(subjectName, subjectId);
		this.chapters = chapters;
	}
	public void display() {
		System.out.println("Subject Name - "+subjectName+" Subject ID = "+subjectId+" Total Chapters - "+chapters);
	}
}
public class SuperAndThisAssignment {

	public static void main(String[] args) {
		Mathematics m1 = new Mathematics("maths",100,10);
		m1.display();
	}
}
