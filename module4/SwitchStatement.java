package com.module4;

import java.util.Scanner;

public class SwitchStatement {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value");
		int num=sc.nextInt();
		switch(num) {
		case 1:System.out.println("Hello");
		       break;
		case 2:System.out.println("Namste");
				break;
		case 3:System.out.println("Bonjour");
				break;
	    default:System.out.println("Invalid");
		
		
		} 
	}

}
