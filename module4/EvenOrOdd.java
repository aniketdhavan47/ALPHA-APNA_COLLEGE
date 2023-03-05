package com.module4;

import java.util.Scanner;

public class EvenOrOdd {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		if(num%2==0) {
			System.out.println("number is even");
		}else {
			System.out.println("Number is odd");
		}
	}

}
