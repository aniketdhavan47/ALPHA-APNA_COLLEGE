package com.module12;

public class PalindromeString {
	public static void main(String[] args) {
		String str="racr";
		System.out.println(isPalindrome(str));
	}
	public static boolean isPalindrome(String str) {
		for(int i=0;i<str.length()/2;i++){
			int n=str.length()-1;
			if(str.charAt(i)!=str.charAt(n-i));
			{
				return false;
			}
		}
		return true;
	}

}
