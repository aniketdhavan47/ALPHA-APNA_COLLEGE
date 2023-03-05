package com.module12;

public class PalindromeStringBF {
	public static void main(String[] args) {
		String str="racecar";
		isPalindrome(str);
	}
	public static boolean isPalindrome(String str) {
		String newstr="";
		for(int i=0;i<str.length();i++) {
			newstr=str.charAt(i)+newstr;
		}
		if(str.toLowerCase().equals(newstr.toLowerCase())) {
			System.out.println("String is palindrome");
			return true;
		}
		System.out.println("String is not an palindrome");
		return false;
	}

}
