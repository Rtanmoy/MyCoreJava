package com.loop;

public class PrimeNumber1 {
	
	public static boolean isPrime(int num) {
		if(num<1) {
			return false;
		}
		for(int i=1;i<num/2;i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
		
	}
public static void main(String[] args) {
	
	if(isPrime(9)) {
		System.out.println("true");
	}else {
		System.out.println("false");
	}
	
}
}
