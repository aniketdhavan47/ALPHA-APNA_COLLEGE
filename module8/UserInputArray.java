package com.module8;

import java.util.Scanner;

public class UserInputArray {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size=3;
		int arr[]= new int[size];
		for(int i=0;i<arr.length;i++) {
		    System.out.println("Enter the element at index :"+i);
			arr[i]=sc.nextInt();
		}
		System.out.println("Element of the array :");
		for(int i=0;i<arr.length;i++) {
			
			System.out.print(arr[i]+" ");
		}
	}

}
