package com.module6;

import java.util.Scanner;

public class PrimeOrNot {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		boolean prime=isPrime(n);
		if(prime==true) {
			System.out.println("Number is prime");
		}else {
			System.out.println("Number is not an prime");
		}
	}
	public static boolean isPrime(int n) {
		if(n==2) {
			return true;
		}
		for(int i=2;i<=Math.sqrt(n);i++) {
			if(n%i==0) {
				return false;
			}
		}return true;
	}

}
