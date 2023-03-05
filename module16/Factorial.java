package com.module16;

public class Factorial {
	public static void main(String[] args) {
		System.out.println(fact(5));
		
	}
	public static int fact(int n) {
		if(n==0 || n==1) {
			return 1;
		}
		int fact=n*fact(n-1);
		return fact;
	}

}
