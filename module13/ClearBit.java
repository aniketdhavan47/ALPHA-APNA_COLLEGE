package com.module13;

public class ClearBit {
	public static void main(String[] args) {
		System.out.println(clearBit(10, 1));
	}
	public static int clearBit(int n,int i) {
		int bm=~(1)<<i;
		return n & bm;
		
	}

}
