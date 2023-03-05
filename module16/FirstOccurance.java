package com.module16;

public class FirstOccurance {
	public static void main(String[] args) {
		int arr[]= {5,3,4,6,7,8,4};
		int x=4;
		int i=0;
		System.out.println(firstOcurance(arr, x, i));
	}
	public static int firstOcurance(int arr[],int x,int i) {
		if(i==arr.length) {
			return -1;
		}
		if(x==arr[i]) {
			return i;
		}
		return firstOcurance(arr, x, i+1);
		
	}

}
