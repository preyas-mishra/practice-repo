package com.arrays;

public class LargestElementAssignment {

	public static void main(String[] args) {
		int[] arr = {67,32,99,87,55,72,15,100};
		int maxNumber = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>maxNumber) {
				maxNumber = arr[i];
			}
		}
		System.out.println("Maximum element in array is: "+maxNumber);

	}

}
