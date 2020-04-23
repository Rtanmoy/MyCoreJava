package com.interview;

import java.util.regex.Pattern;

public class CheckNumbers {

	public static void main(String[] args) {
		String str[] = { "123", "123.34", "asc123", "sde" };
		Pattern p = Pattern.compile(".*\\D.*");
		for (String input : str) {
			System.out.println("does (" + input + ") is number ==> " + !p.matcher(input).matches());
		}
		// Regular expression in Java to check if String is number or not
		Pattern pattern = Pattern.compile(".*[^0-9].*");
		// Pattern pattern = Pattern.compile(".*\\D.*");
		String[] inputs = { "123456", "-12334", "123.12", "abcdsd","109876" };
        Pattern p1=Pattern.compile("\\d{6}");
		for (String input : inputs) {
			System.out.println("does " + input + " is number : " + !pattern.matcher(input).matches());
		}
	}

}
