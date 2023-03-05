package com.module8;

public class BinarySearch {
	public static void main(String[] args) {
		int arr[]= {2,5,3,7,8,9};
		int key=3;
		int si=0;
		int ei=arr.length-1;
		int idx=binarySearch(arr, key,si,ei);
		if(idx==-1) {
			System.out.println("Number not found");
		}else {
			System.out.println("Number found at index :"+idx);
		}
	}
	public static int binarySearch(int arr[],int key,int si,int ei) {
		int mid=(si+ei)/2;
		while(si<=ei) {
			if(arr[mid]==key) {
				return mid;
			}
			if(arr[mid]<key) {
				si=mid+1;
			}else {
				ei=mid-1;
			}
		}
		return -1;
		
	}

}
