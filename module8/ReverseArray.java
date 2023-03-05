package com.module8;

public class ReverseArray {
	public static void main(String[] args) {
		int arr[]= {2,4,6,8,10};
		System.out.println("Original  array is :");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}System.out.println();
		reverseArray(arr);
	}
	public static void reverseArray(int arr[]) {
		int start=0;
		int last=arr.length-1;
		while(start<last) {
			int temp=arr[start];
			arr[start]=arr[last];
			arr[last]=temp;
			start++;
			last--;
		}
		System.out.println("Reverse array is :");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
