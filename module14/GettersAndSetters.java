package com.module14;

public class GettersAndSetters {
	public static void main(String[] args) {
		Bankaccount1 acc= new Bankaccount1();
		acc.setPword("pass@123");
		acc.setUname("user1234");
		System.out.println("Username is : "+acc.getUname());
		System.out.println("Password is : "+acc.getPword());
	}
  
}
class Bankaccount1{
	private String uname;
	private String pword;
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname=uname;
	}
	public String getPword() {
		return pword;
	}
	public void setPword(String pword) {
		this.pword=pword;
	}
	
	}

