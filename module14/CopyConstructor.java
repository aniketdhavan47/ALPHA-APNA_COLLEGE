package com.module14;

public class CopyConstructor {
	public static void main(String[] args) {
		Stud s1= new Stud("aman",101);
		
		Stud s2=new Stud(s1);
		s2.showDetails();
		s1.name="akash";
		
	}

}
class Stud{
	String name;
	int age;
	
	Stud(String name,int age){
	
		this.name=name;
		this.age=age;
		
	}
	Stud(Stud s){
		
		this.name=s.name;
		this.age=s.age;
		
	}
	void showDetails() {
		System.out.println("Name is :"+name);
		System.out.println("Age is :"+age);
	}
}
