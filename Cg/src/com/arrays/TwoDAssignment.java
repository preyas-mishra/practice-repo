package com.arrays;

public class TwoDAssignment {

	public static void main(String[] args) {
		int arr[][] = {{1,5,8},{2,4,6,9},{7}};
		System.out.println("Using for loop");
		for(int i=0;i<3;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println(" ");
		}
		
		System.out.println("Using for each loop");
		for(int[] innerarr:arr) {
			for(int element:innerarr) {
				System.out.print(element+" ");
			}
			System.out.println(" ");
		}
	}

}
