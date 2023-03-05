package com.module19;

import java.util.ArrayList;

public class Basics {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		ArrayList<String> list2=new ArrayList<>();
		ArrayList<Boolean> list3= new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		
		for(int i=2;i<=10;i++) {
			list.add(i);
			
		}
		System.out.println(list);
	}

}
