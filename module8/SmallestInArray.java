package com.module8;

public class SmallestInArray {
	public static void main(String[] args) {
		int arr[]= {2,5,8,9,1};
		System.out.println("Smallest number in array is :"+smallest(arr));
	}
	public static int smallest(int arr[]) {
		int smallest=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<smallest) {
				smallest=arr[i];
			}
		}
		return smallest;
		
	}

}
