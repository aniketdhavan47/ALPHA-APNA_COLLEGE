package com.module14;

public class Constructor {
	public static void main(String[] args) {
		Student s1= new Student("Aniket",5219,19);
		s1.showDetails();
		
		Student1 s2=new Student1();
		
		
	}

}
class Student1{
	String name="new";
	int rollno=5320;
	int age=18;
	//Non-Parameterized Constructor
	Student1(){
		System.out.println("Name of Student is : "+name);
		System.out.println("Rollno of student is :"+rollno);
		System.out.println("Age of Student is : "+age);
		
	}
}

class Student{
	String name;
	int rollno;
	int age;
	//Parameterized Constructor
	public Student(String name,int rollno,int age){
		this.name=name;
		this.rollno=rollno;
		this.age=age;
		
	}
	public void showDetails() {
		System.out.println("Name of student is :"+name);
		System.out.println("Rollno of student is :"+rollno);
		System.out.println("Age of student is :"+age);
	}
}
