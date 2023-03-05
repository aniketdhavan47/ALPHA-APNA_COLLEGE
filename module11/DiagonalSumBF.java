package com.module11;
//tc=O(n^2)

public class DiagonalSumBF {
	public static void main(String[] args) {
		int arr[][]= {{1,2,3,4},
			      {5,6,7,8},
			      {9,10,11,12},
			      {13,14,15,16}};
		System.out.println(diagonalSum(arr));
	}
	public static int diagonalSum(int arr[][]) {
		int pd=0;
		int sd=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				if(i==j) {
					pd=pd+arr[i][j];
				}
				else if(i+j==arr.length-1) {
					sd=sd+arr[i][j];
				}
			}
		}
		return pd+sd;
	}

}
