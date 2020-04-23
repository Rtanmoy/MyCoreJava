package com.loop;

public class WhileLoop {

	public static void main(String[] args) {
		//sum of natural number
		int n=10,sum=0,count=1;
		while(count<=10) {
			sum=sum+count;
			count++;
			
		}
		System.out.println("Summation==>> "+sum);
	}

}
