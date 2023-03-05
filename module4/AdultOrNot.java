package com.module4;

import java.util.Scanner;

public class AdultOrNot {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int age=sc.nextInt();
		System.out.println("Enter your age");
		if(age<18) {
			System.out.println("You are not adult");
		}else {
			System.out.println("You are adult");
		}
	}

}
