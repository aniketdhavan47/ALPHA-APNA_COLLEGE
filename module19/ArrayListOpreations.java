package com.module19;

import java.util.ArrayList;

public class ArrayListOpreations {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		//Adding element in arraylist
		list.add(1);
		list.add(2);
		list.add(2,5);
		System.out.println(list);
		//Getting element at Index
		System.out.println(list.get(2));
		//Remove Element from index i
		list.remove(2);
		System.out.println(list);
		//Set Element At index i
		list.set(1, 10);
		System.out.println(list);
		//Check Wheter Value Present int Arraylist or not
		System.out.println(list.contains(2));
		System.out.println(list.contains(10));
	}

}
