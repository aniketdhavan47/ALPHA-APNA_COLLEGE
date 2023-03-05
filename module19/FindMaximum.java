package com.module19;

import java.util.ArrayList;

public class FindMaximum {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		System.out.println(max(list));
	}
	public static int max(ArrayList<Integer> list) {
		int max=Integer.MIN_VALUE;
		for(int i=0;i<list.size();i++) {
			if(list.get(i)>max) {
				max=list.get(i);
			}
		}
		return max;
	}

}
