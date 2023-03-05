package com.module16;

public class BinarySearch {
	public static void main(String[] args) {
		int arr[]= {2,3,4,5,6,8};
		int target=8;
		System.out.println(BS(arr, target, 0, arr.length-1));
	}
	public static int BS(int arr[],int target,int s,int e) {
		if(s>e) {
			return -1;
		}
		int mid=s+(e-s)/2;
		if(arr[mid]==target) {
			return mid;
		}else if(arr[mid]>target) {
			return BS(arr,target,s,e=mid);
		}
		return BS(arr,target,mid+1,e);
	}

}
