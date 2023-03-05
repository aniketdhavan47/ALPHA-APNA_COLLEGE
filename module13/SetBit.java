package com.module13;

import java.util.Scanner;

public class SetBit {
	public static void main(String[] args) {
//		Scanner sc= new Scanner(System.in);
//		System.out.println("Enter the Number :");
//		int n=sc.nextInt();
//		System.out.println("Enter the Position :");
//		int i=sc.nextInt();
//		System.out.println("Bit at :"+ i +" position is :"+setBit(n, i));
		System.out.println(setBit(10,2));
		
	}
	public static int setBit(int n,int i) {
		int bm=1<<i;
		
		return n | bm;
	}

}
