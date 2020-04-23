package com.interview;

public class OccurenceOfCharacter {

	public static void main(String[] args) {
		String str="Java by java";
		int length=str.length();
		String s=str.replace("a", "");
		String s1=str.replace("J", "");
		int length1=s.length();
		int length2=s.length();
		System.out.println(length+"  "+length1+"  no of occurence of a ==> "+(length-length1));
		System.out.println(length+"  "+length2+"  no of occurence of j ==> "+(length-length));

	}

}
