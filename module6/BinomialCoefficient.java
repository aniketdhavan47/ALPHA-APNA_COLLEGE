package com.module6;

public class BinomialCoefficient {
	public static void main(String[] args) {
		System.out.println(binomialCoefficient(5, 2));
		
	}
	public static int binomialCoefficient(int n,int r) {
	    int nfact=factorial(n);
		int rfact=factorial(r);
		int nrfact=factorial(n-r);
		int bcoefficient=nfact/(rfact*nrfact);
		return bcoefficient;
	}
	public static int factorial(int n) {
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
		return fact;
	}

}
