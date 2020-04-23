package com.core;

import java.util.Scanner;

public class ReverseString {
	public static void main7(String[ ] arg)
	{
	String str;
	Scanner scan=new Scanner(System.in);
	System.out.print("Enter a string : ");
	str=scan.nextLine();	
	char[] ch=str.toCharArray(); 
	System.out.println("Reverse of a String is :"); 
	int j=ch.length;
	for(int i=j;i>0;i--)
	{
	System.out.print(ch[i-1]); 
	}
	}
	public static void main(String[ ] arg)
	{
	String str;
	char ch;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter a string : ");
	str=sc.nextLine();	
	System.out.println("Reverse of a String '"+str+"' is  :"); 
	for(int j=str.length();j>0;--j)
	{
	System.out.print(str.charAt(j-1)); 
	}
}
}
