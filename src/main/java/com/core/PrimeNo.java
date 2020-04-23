package com.core;

public class PrimeNo {

	private static boolean isprime=true;

	public static void main(String[] args) {
		int n=3;
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				isprime=false;
				break;
			}
		}
		if(isprime) {
			System.out.println(n+"  Number is prime");
		}else {
			System.out.println(n+"  Not prime");
		}

	}

}
