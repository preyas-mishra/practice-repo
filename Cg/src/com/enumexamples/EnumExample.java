package com.enumexamples;
enum Color{
	RED,
	BLACK,
	BLUE
}
public class EnumExample {

	public static void main(String[] args) {
		Color c1 = Color.BLUE;
		System.out.println(c1);
		for(Color c: Color.values()) {
			System.out.println(c);
		}
		System.out.println("Value of Blue is "+Color.valueOf("BLUE"));
		System.out.println("Index Value of Blue is "+Color.valueOf("BLUE").ordinal());
	}

}
