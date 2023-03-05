package com.module6;

public class DecimalToBinary {
	public static void main(String[] args) {
		System.out.println(decTOBin(5));
	}
	public static int decTOBin(int n) {
		int binary=0;
		while(n>0) {
			int qt=n%2;
			binary=(binary*10)+qt;
			n=n/2;
		}
		return binary;
	}

}
