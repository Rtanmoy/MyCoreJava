package com.app.clone;

public class TempSwap { 
	public static void main(String[] args) {
		int a=10;
		int b=9;
		int c=8;
		System.out.println("a "+a+""+"  b  "+b+"  c  "+c);
		a=a+b+c;
		b=a-(b+c);
		c=a-(c+b);
		a=a-(b+c);
		System.out.println("a "+a+""+"  b  "+b+"  c  "+c);
	}

}
