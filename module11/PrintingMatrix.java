package com.module11;

import java.util.Scanner;

public class PrintingMatrix {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of rows :");
		int rows=sc.nextInt();
		System.out.println("Enter the number of columns :");
		int cols=sc.nextInt();
		int arr[][]=new int[rows][cols];
		//Loop for taking Input
		for(int i=0;i<rows;i++) {
			System.out.println("Enter the element of row :"+i);
			for(int j=0;j<cols;j++) {
				arr[i][j]=sc.nextInt();
			}
			
		}
		System.out.println("Element of array is :");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
			System.out.print(arr[i][j]+" ");
			}System.out.println();
		}
		
	}

}
