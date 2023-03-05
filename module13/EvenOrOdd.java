package com.module13;

import java.util.Scanner;

public class EvenOrOdd {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		evenOrOdd(n);
	}
	public static void evenOrOdd(int n) {
		int bm=1;
		if((n & bm)==0) {
			System.out.println("Number is even");
		}else {
			System.out.println("Number is odd");
		}
	}

}
