package com.interview;

public class CountVowelAndConsonent {

	public static void main(String[] args) {
		int count = 0;
		int count1=0;
		String str = "Cross Origin Resource Sharing";
		char[] arr = str.toCharArray();
		for (char obj : arr) {
			switch (obj) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				count++;
				break;
			default:
				count1++;

			}
		}
		System.out.println(count +" "+count1);
	}

}
