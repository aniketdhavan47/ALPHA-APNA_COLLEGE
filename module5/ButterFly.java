package com.module5;

public class ButterFly {
	public static void main(String[] args) {
		int n=4;
		for(int i=1;i<=n;i++) {
			//FOR stars of upper half left side
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			//for Spaces of upper half
			for(int j=1;j<=2*(n-i);j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			
			
			System.out.println();
		}
		for(int i=n;i>=1;i--) {
			//FOR stars of upper half left side
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			//for Spaces of upper half
			for(int j=1;j<=2*(n-i);j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			
			
			System.out.println();
		}
	}

}
