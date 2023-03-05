package com.module8;

public class LinearSearch {
	public static void main(String[] args) {
		int arr[]= {2,5,7,9,8};
		int key =9;
		int idx=linearSearch(arr, key);
		if(idx==-1) {
			System.out.println("Number not found");
		}else {
			System.out.println("Number found at index :"+idx);
		}
	}
	public static int linearSearch(int arr[],int key) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==key) {
				return i;
			}
		}
		return -1;
	}

}
