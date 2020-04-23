package com.interview;

public class FirstRepeatedCharWapi {

	public static void main(String[] args) {

		String str = "good morning";
		int index = firstrepeatedchar(str);
		if (index != -1) {
			System.out.println("First repeated char  " + str.charAt(index) + " found index " + index);
		} else {
			System.out.println("not found repeated character");
		}
	}

	private static int firstrepeatedchar(String str) {
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			for (int j = i + 1; j < str.length(); j++) {
				if (c == str.charAt(j)) {
					return j;
				}
			}
		}
		return -1;
	}

}
