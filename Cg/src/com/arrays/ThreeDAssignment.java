package com.arrays;

public class ThreeDAssignment {

	public static void main(String[] args) {
		int arr[][][] = {{{1,2,3},{2,3,4}},{{4,5,6,8},{1},{2,4}}};
		System.out.println("Using for loop");
		for(int i=0;i<2;i++) {
			for(int j=0;j<arr[i].length;j++) {
				for(int k=0;k<arr[i][j].length;k++) {
					System.out.print(arr[i][j][k]+" ");
				}
				System.out.print("\n");
			}
			System.out.println(" ");
		}
		
		System.out.println("Using for each loop");
		for(int[][] outerarr: arr) {
			for(int []innerarr:outerarr) {
				for(int element:innerarr) {
					System.out.print(element+" ");
				}
				System.out.println(" ");
			}
			System.out.println(" ");
		}
	}
}
