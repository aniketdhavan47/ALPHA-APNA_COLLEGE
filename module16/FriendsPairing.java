package com.module16;

public class  FriendsPairing {
	public static void main(String[] args) {
		System.out.println(friendPairing(3));
	}
	public static int friendPairing(int n) {
		if(n==1|| n==2) {
			return n;
		}
		int single=friendPairing(n-1);
		int pair=(n-1)*friendPairing(n-2);
		return single+pair;
	}

}
