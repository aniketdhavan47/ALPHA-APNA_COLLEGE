package com.module14;

public class MultipleConstructor {
	public static void main(String[] args) {
		Students s1= new Students();
		Students s2= new Students("Aman");
		Students s3= new Students(5218);
	}

}
class Students{
	String name;
	int rollno;
	int age;
	
	Students(){
		System.out.println("Calling Constructor Without Parameters.....");
		System.out.println();
	}
	Students(String name){
		System.out.println("Calling Constructor with name as a parameters...");
		System.out.println("Name of student is : "+name);
		System.out.println();
	}
	Students(int rollno){
		System.out.println("Calling Constructor with roll Number as a parameters...");
		System.out.println("Name of student is : "+rollno);
		System.out.println();
	}
	
}
