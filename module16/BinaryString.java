package com.module16;

public class BinaryString {
	public static void main(String[] args) {
		binaryString(3, 0, "");
	}
	public static void binaryString(int n,int lastplace,String newstr) {
		if(n==0) {
			System.out.println(newstr);
			return;
		}
		binaryString(n-1, 0, newstr+"0");
		if(lastplace==0) {
			binaryString(n-1, 1, newstr+"1");
		}
	}

}
