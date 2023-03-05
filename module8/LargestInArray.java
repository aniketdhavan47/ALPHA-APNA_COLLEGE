package com.module8;

public class LargestInArray {
	public static void main(String[] args) {
		int arr[]= {2,4,3,5,8};
		System.out.println("Largest Number in array is :"+largest(arr));
	}
	public static int largest(int arr[]) {
		int largest=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(largest<arr[i]) {
				largest=arr[i];
			}
		}
		return largest;
	}

}
