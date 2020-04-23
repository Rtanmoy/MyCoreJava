package com.interview;

import java.util.Arrays;

public class CheckAnagram {

	public static void main(String[] args) {
		String str="keep";
		String str1="peak";
		if(str.length()!=str1.length()) {
			System.out.println("Not anagram");
		}
		char[]ch1=str.toCharArray();
		char[]ch2=str1.toCharArray();
		if(ch1.length==ch2.length) {
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			if(Arrays.equals(ch1, ch2)) {
			 System.out.println("Strings are anagram");
			}else {
				System.out.println("Not anagram");
			}
		}
	}

}
