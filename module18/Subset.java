package com.module18;

public class Subset {
	public static void main(String[] args) {
		String str="abc";
		findSubset(str,"", 0);
	}

	public static void findSubset(String str,String ans,int i) {
		if(i==str.length()) {
			if(ans.length()==0) {
				System.out.println("Null");
			}else {
				System.out.println(ans);
			}
			return;
		}
		//Choice Yes
		findSubset(str, ans+str.charAt(i), i+1);
		//Choice NO
		findSubset(str, ans, i+1);
	}
}
