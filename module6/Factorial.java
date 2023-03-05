package com.module6;

public class Factorial {
	public static void main(String[] args) {
		System.out.println(factorial(5));
	}
	public static int factorial(int n) {
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
		return fact;
	}

}
