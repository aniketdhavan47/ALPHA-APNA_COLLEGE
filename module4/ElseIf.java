package com.module4;

import java.util.Scanner;

public class ElseIf {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter value of A");
		int A=sc.nextInt();
		System.out.println("Enter value of B");
		int B=sc.nextInt();
		System.out.println("Enter value of C");
		int C=sc.nextInt();
		if(A>=B && A>=C) {
			System.out.println("A");
		}else if(B>=C) {
			System.out.println("B");
		}else {
			System.out.println("C");
		}
		
	}

}
