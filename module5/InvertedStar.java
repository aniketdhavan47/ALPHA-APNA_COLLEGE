package com.module5;

import java.util.Scanner;

public class InvertedStar {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=i;j>=1;j--) {
				System.out.print("*");
			}System.out.println();
		}
	}

}
