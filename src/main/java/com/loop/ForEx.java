package com.loop;

public class ForEx {
public static void main(String[] args) {
	int arr[]= {2,4,5,6,7,1,55};
	for(int i=0;arr.length>i;i++) {
		System.out.println("Normal foo loop"+arr[i]);
	}
	System.out.println("======<>===<>=====<>=======");
	for(int num:arr) {
		System.out.println("ForEach loop "+num);
	}
	System.out.println("======<>===<>=====<>=======");
	String []str= {"A","W","Q","D"};
	for(String num:str) {
		System.out.println("ForEach loop "+num);
	}
	System.out.println("======<>===<sum of natural number>=====<>=======");
	int sum=0;
	for(int i=1;i<=10;i++) {
		sum=sum+i;
	}
	System.out.println("Summation==>> "+sum);
	
	}
}

