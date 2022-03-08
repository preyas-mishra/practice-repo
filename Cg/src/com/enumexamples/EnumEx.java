package com.enumexamples;

public class EnumEx {
	enum Color{
		RED(10),
		BLUE(5),
		GREEN(20);
		
		private int value;
		Color(int value){
			this.value=value;
		}
		
	}
	public static void main(String[] args) {
		
		
		for(Color ele : Color.values()) {
			System.out.println(ele+"-----"+ele.value);
		}
	}

}
