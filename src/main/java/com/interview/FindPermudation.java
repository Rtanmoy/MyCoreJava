package com.interview;

public class FindPermudation {

	public static void main(String[] args) {
		String str="123";
		permudation(str);

	}

	private static void permudation(String str) {
		System.out.println("Permutation of String "+str);
		permudation("",str);
		
	}

	private static void permudation(String string, String str) {
		if(str.length()==0) {
			System.out.println(str.length());
			System.out.println(string +"==");
		}else {
			for(int i=0;i<str.length();i++) {
				permudation(string+str.charAt(i),str.substring(0,i)+str.substring(i+1, str.length()));
			}
		}
		
	}

}
