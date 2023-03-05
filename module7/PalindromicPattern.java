package com.module7;

public class PalindromicPattern {
	public static void main(String[] args) {
		int n=5;
		//Outer loop
		for(int i=1;i<=n;i++) {
			//Inner loop for spaces
			for(int j=1;j<=(n-i);j++) {
				System.out.print(" ");
			}
			//Inner loop for Printing first half
			for(int j=i;j>=1;j--) {
				System.out.print(j);
			}
			//Inner loop for Printing Second half
			for(int j=2;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
