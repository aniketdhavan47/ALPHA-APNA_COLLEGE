package com.module16;

public class LastOccurance {
	public static void main(String[] args) {
		int arr[]= {5,3,4,6,7,8,4};
		int x=6;
		int i=arr.length-1;
		System.out.println(lastOccurance(arr, x, i));
	}
	public static int lastOccurance(int arr[],int x,int i) {
		if(i==0) {
			return -1;
		}
		if(arr[i]==x) {
			return i;
		}
	return 	lastOccurance(arr, x, i-1);
		
	}

}
