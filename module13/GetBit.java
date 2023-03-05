package com.module13;

import java.util.Scanner;

public class GetBit {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number :");
		int n=sc.nextInt();
		System.out.println("Enter the Position :");
		int i=sc.nextInt();
		System.out.println("Bit at :"+ i +" position is :"+getBit(n, i));
		
	}
	public static int getBit(int n,int i) {
		int bm=1;
		bm=(1<<i);
		if((n & bm)==0) {
			return 0;
		}
		return 1;
	}

}
