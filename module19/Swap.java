package com.module19;

import java.util.ArrayList;

public class Swap {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		ArrayList<String> list2=new ArrayList<>();
		ArrayList<Boolean> list3= new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		swap(list, 2, 3);
		
	}
	public static void swap(ArrayList<Integer> list,int idx1,int idx2) {
		int temp=list.get(idx1);
		list.set(idx1, list.get(idx2));
		list.set(idx2, temp);
		System.out.println(list);
	}
	

}
