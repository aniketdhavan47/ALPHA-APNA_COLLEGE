package com.module14;

public class Bank {
	public static void main(String[] args) {
		BankAccount myacc= new BankAccount();
		myacc.setUserName("username");
		//myacc.password="abcde"; This line gives error
		
		System.out.println("Username is : "+myacc.userName);
		myacc.setPassword("abcdef");
	}

}
class BankAccount{
	String userName;
	private String password;
	public void setUserName(String uname) {
		userName=uname;
		
	}
	public void setPassword(String pwd) {
		password=pwd;
		System.out.println("Password is : "+password);
	}
}