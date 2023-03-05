package com.module8;

public class SumOfSubArray {
	public static void main(String[] args) {
		int arr[]= {2,4,6,8,10};
		pairs(arr);
	}
	public static void pairs(int arr[]) {
		int largestsum=Integer.MIN_VALUE;
		int smallestsum=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			      
			for(int j=i;j<arr.length;j++) {
				 int sum=0;
			   for(int k=i;k<=j;k++) {
				   sum=sum+arr[k];
			if(largestsum<sum) {
				largestsum=sum;
			}
			if(sum<smallestsum) {
				smallestsum=sum;
			}
			   }
			  
			}
			
		}
		 System.out.println("Largest sum of subarray is : "+largestsum);
		 System.out.println("smallest sum of subarray is : "+smallestsum);
	}

}
