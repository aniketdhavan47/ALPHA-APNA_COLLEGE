package com.module8;

public class TrappedRainWater {
	public static void main(String[] args) {
		int height[]= {4,2,0,6,3,2,5};
		System.out.println("Trapped water is :"+trappedRainWater(height));
	}
	public static int trappedRainWater(int arr[]) {
		int n=arr.length;
		//leftmax boundry
		int leftmax[]=new int[n];
		leftmax[0]=arr[0];
		for(int i=1;i<n;i++) {
			leftmax[i]=Math.max(arr[i],leftmax[i-1]);
		}
		//Rightmax Boundry
		int rightmax[]=new int[n];
		rightmax[n-1]=arr[n-1];
		for(int i=n-2;i>=0;i--) {
			rightmax[i]=Math.max(arr[i],rightmax[i+1]);
		}
		//Trapped water calculation
		int trappedwater=0;
		for(int i=0;i<n;i++) {
			int waterlevel=Math.min(leftmax[i],rightmax[i]);
			trappedwater+=waterlevel-arr[i];
		}
		return trappedwater;
	}

}
