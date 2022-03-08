package com.pack1;

public class Father {
	int age;
	String name;
	String education;
	Son son;
	Daughter daughter;
	Father(){}
	Father(Son son){
		this.son = son;
	}
	Father(Daughter daughter){
		this.daughter = daughter;
	}
	public static void main(String[] args) {
		Son son = new Son();
		son.setAge(20);
		son.setName("Preyas");
		son.setRollNo("20");
		Father father = new Father(son);
		System.out.println(son.getAge());

	}

}
