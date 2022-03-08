package com.arrays;

public class SingleDimensional {

	public static void main(String[] args) {
		
		int[] arr = new int[5];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		
		int[] newarr = {10,20,30};
		
		System.out.println("Arr length = "+arr.length);
		System.out.println("NewArr length = "+newarr.length);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		for(int element:arr) {
			System.out.println(element);
		}

	}

}
