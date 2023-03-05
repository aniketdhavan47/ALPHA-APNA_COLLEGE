package com.module12;

public class Shortestpath {
	public static void main(String[] args) {
		String str="wneenesenn";
		System.out.println(shortestPath(str));
	}
	public static int shortestPath(String str) {
		String newstr=str.toLowerCase();
		int x=0;
		int y=0;
		for(int i=0;i<newstr.length();i++) {
			if(newstr.charAt(i)=='w') {
				x--;
			}else if(newstr.charAt(i)=='e') {
				x++;
			}else if(newstr.charAt(i)=='n') {
				y++;
			}else if(newstr.charAt(i)=='w') {
				y--;
			}
		}
		int distance=(x*x-0)+(y*y-0);
		return (int) Math.sqrt(distance);
	}

}
