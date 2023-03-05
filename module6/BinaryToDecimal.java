package com.module6;

public class BinaryToDecimal {
	public static void main(String[] args) {
		System.out.println(binaryTODecimal(111));
	}
	public static int binaryTODecimal(int n) {
		int ld=0;
		int dec=0;
		int pow=0;
		while(n>0) {
			ld=n%10;
			dec=(int) (dec+(ld*Math.pow(2, pow)));
			pow++;
			n=n/10;
			
			
		}
		return dec;
	}

}
