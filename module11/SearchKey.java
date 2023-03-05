package com.module11;

import java.util.Scanner;

public class SearchKey {
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
		System.out.println(searchInMatrix(arr,7));
	}
	
	public static boolean searchInMatrix(int arr[][],int x) {
		for(int i=0;i<arr.length;i++) {
		
			for(int j=0;j<arr[0].length;j++) {
				if(arr[i][j]==x) {
					System.out.println("X found at Index"+"("+i+","+j+")");
					return true;
					
				}
			}
			
		}
		System.out.println("X not found");
		return false;
	}

}
