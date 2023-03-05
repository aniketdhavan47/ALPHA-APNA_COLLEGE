package com.module16;

public class FibonacciNumber {
	public static void main(String[] args) {
		System.out.println(fibonacii(5));
	}
	public static int fibonacii(int n) {
		if(n==0 || n==1) {
			return n;
		}
		int nm1=fibonacii(n-1);
		int nm2=fibonacii(n-2);
		int n1=nm1+nm2;
		return n1;
	}

}
