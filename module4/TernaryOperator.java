package com.module4;

import java.util.Scanner;

public class TernaryOperator {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value of num");
		int num=sc.nextInt();
		String EvenOrOdd=(num%2==0)?"even":"odd";
		System.out.println(EvenOrOdd);
	}

}
