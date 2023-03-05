package com.module12;

public class PrintAllCharacters {
	public static void main(String[] args) {
		String str="Hello my name is Aman";
		printcharacters(str);
	}
	public static void printcharacters(String str) {
		for(int i=0;i<str.length();i++) {
			System.out.print(str.charAt(i)+" ");
		}System.out.println();
	}

}
