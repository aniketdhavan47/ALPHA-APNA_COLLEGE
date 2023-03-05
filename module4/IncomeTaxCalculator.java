package com.module4;

import java.util.Scanner;

public class IncomeTaxCalculator {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your Income");
		int income=sc.nextInt();
		int tax=0;
		if(income<500000) {
			tax=0;
			System.out.println(tax);
		}else if(income>=500000 && income<100000){
			tax=(int) (income*0.2);
			System.out.println(tax);
		}else {
			tax=(int) (income*0.3);
			System.out.println(tax);
		}
	}

}
