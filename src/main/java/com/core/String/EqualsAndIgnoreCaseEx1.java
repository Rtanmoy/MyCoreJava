package com.core.String;

import java.util.Locale;

public class EqualsAndIgnoreCaseEx1 {

	public static void main(String[] args) {
		String str="java";
		String str1="  Tanmoy  ";
		System.out.println(str.equals("JAVA"));
		System.out.println(str.equalsIgnoreCase("JAVA"));
		System.out.println(str.substring(1));
		System.out.println(str.substring(1, 3));
		System.out.println(str.subSequence(1, 2));
		
		System.out.println(str.replace("j", "J"));
		
		System.out.println(str1.toLowerCase()+"   "+str1.toUpperCase());
		
		 Locale locale1 = new Locale("EN", "INDIA");  //not working
		System.out.println(str1.toLowerCase(locale1));
		
		System.out.println(str1.trim());
		System.out.println(str1.indexOf('n'));
		System.out.println(str.lastIndexOf('a'));
		
        String s1=str.toLowerCase();
        String s2=str1.toUpperCase();
        System.out.println(str==s1);
        System.out.println(str1==s2);
        
        String s3=str.toString();
        System.out.println(str==s3);
		
	}

}
