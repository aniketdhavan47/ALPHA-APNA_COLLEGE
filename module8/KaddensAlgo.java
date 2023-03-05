package com.module8;

public class KaddensAlgo {
	public static void main(String[] args) {
		int arr[]= {1,-2,6,-1,3};
		kaddensAlgorithm(arr);
	}
	public static void kaddensAlgorithm(int arr[]) {
		int cs=0;
		int ms=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			cs=cs+arr[i];
			if(cs<0) {
				cs=0;
			}
			ms=Math.max(ms, cs);
		}
		System.out.println("Maximum sum is :"+ms);
	}

}
