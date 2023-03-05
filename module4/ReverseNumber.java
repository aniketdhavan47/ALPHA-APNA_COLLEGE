package com.module4;

public class ReverseNumber {
	public static void main(String[] args) {
		int num=343;
		int rev=0;
		int newnum=num;
		while(newnum>0) {
			int lastdig=newnum%10;
			 rev=(rev*10)+lastdig;
			newnum=newnum/10;
			}
		if(rev==num) {
			System.out.println("number is an palindrome");
			System.out.println(num);
			System.out.println(rev);
		}else {
			System.out.println("Number is not an palindrome");
			System.out.println(num);
			System.out.println(rev);
		}
	}

}
