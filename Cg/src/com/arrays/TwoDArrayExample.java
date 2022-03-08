package com.arrays;

public class TwoDArrayExample {

	public static void main(String[] args) {
		int arr[][] = {
				{10,20,30},
				{40,50,60},
				{70,80,90},
		};
		//Using for loop
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.println(arr[i][j]);
			}
		}
		
		for(int[] innerarray:arr) {
			for(int element:innerarray) {
				System.out.println(element);
			}
		}

	}

}
