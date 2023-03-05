package com.module8;

public class PrefixArray {
	public static void main(String[] args) {
		int arr[]= {1,-2,6,-1,3};
		maxSum(arr);
	}
	public static void maxSum(int arr[]) {
		int maxsum=Integer.MIN_VALUE;
		int currsum=0;
		int prefix[]= new int[arr.length];
		prefix[0]=arr[0];
		for(int i=1;i<prefix.length;i++) {
			prefix[i]=prefix[i-1]+arr[i];
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
				currsum=i==0?prefix[j]:prefix[j]-prefix[i-1];
				maxsum=Math.max(maxsum,currsum);
			}
		}
		System.out.println("Maximum sum is :"+maxsum);
	
	}

}
