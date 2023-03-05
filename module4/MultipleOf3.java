package com.module4;

import java.util.Scanner;

public class MultipleOf3 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value");
		int num=sc.nextInt();
		if(num%3==0) {
			System.out.println("yes");
		}else {
			System.out.println("No");
		}
	}

}
