package com.module2;

import java.util.Scanner;

public class Opreators {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of first operand");
		int a=sc.nextInt();
		System.out.println("Enter the value of second operand");
		int b=sc.nextInt();
		int sum=a+b;
		int multiply=a*b;
		int division=a/b;
		int diff=a-b;
		int modulo=a%b;
		System.out.println("sum of the two number is : "+sum);
		System.out.println("diff of the two number is : "+diff);
		System.out.println("multiplication of the two number is : "+multiply);
		System.out.println("Divison of the two number is : "+division);
		System.out.println("modulo of the two number is : "+modulo);
		
	}

}
