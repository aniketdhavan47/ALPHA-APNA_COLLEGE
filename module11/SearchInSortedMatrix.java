package com.module11;

import java.util.Scanner;

//StairCase Search

public class SearchInSortedMatrix {
	public static void main(String[] args) {
		int arr[][]= {{10,20,30,40},
			      {15,25,35,45},
			      {27,29,37,48},
			      {32,33,39,50}};
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter key");
		int key=sc.nextInt();
		staircaseSearch(arr, key);
	}
	public static boolean staircaseSearch(int arr[][],int key) {
		int row=0,col=arr[0].length-1;
		while(row<arr.length && col>=0) {
			if(arr[row][col]==key) {
				System.out.println("key found at index"+"("+row+","+col+")");
				return true;
			}
			else if(arr[row][col]<key) {
				row++;
			}else {
				col--;
			}
		}
		return false;
	}

}
