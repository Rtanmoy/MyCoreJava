package com.interview;

import java.util.HashSet;
import java.util.Set;

public class FirstRepeatedChar {

	public static void main(String[] args) {

		String str = "good morning";
		int index = firstrepeatedchar(str);
		if (index != -1) {
			System.out.println("First repeated char  (" + str.charAt(index) + ") found index " + index);
		} else {
			System.out.println("not found repeated character");
		}
	}

	private static int firstrepeatedchar(String str) {
		Set<Character> charSet = new HashSet<>();
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (!charSet.add(c)) {
				return i;
			}
		}

		return -1;
	}

}
