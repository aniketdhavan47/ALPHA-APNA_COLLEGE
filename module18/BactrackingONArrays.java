package com.module18;

public class BactrackingONArrays {
	public static void main(String[] args) {
		int arr[]=new int[5];
		addValues( arr, 0, 1);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void addValues(int arr[],int i,int value) {
		if(i==arr.length) {
			
			return ;
		}
		arr[i]=value;
		addValues( arr, i+1, value+1);
		//BackTracking Step
		arr[i]=arr[i]-2;
	}

}
