package com.module2;

public class LogicalOperator {
	public static void main(String[] args) {
		//logical AND
		System.out.println((3>2)&&(7>0));//retrurn true if both condition are true
		//logical OR
		System.out.println((3>2)&&(7<0));  //return true if either one condition is true
		//logical NOT
		System.out.println(!(3>2)); //return true if value is false and vice-versa
	}

}
