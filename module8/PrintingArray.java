package com.module8;

public class PrintingArray {
	public static void main(String[] args) {
		int marks[]= new int[3];
		marks[0]=85;
		marks[1]=92;
		marks[2]=75;
	
  for(int i=0;i<marks.length;i++) {
	  System.out.println("Marks at index "+i+" :"+marks[i]);
  }
	}

}
