package com.module10;

public class SelectionSort {
	public static void main(String[] args) {
		int arr[]= {5,4,9,1,2};
		selectionSort(arr);
		printArray(arr);
	}
	public static void printArray(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void selectionSort(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			int min=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[min]) {
					min=j;
				}
			}
			if(min!=i) {
				int temp=arr[min];
				arr[min]=arr[i];
				arr[i]=temp;
			}
		}
	}

}
