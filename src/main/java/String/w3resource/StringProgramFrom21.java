package String.w3resource;

import java.util.Arrays;

public class StringProgramFrom21 {

	public static void main(String[] args) {
		// get the last index of a string within a string
		// Get the index of all the characters of the alphabet
		// starting from the beginning of the String.
		String str = "The quick brown fox jumps over the lazy dog.";
		int a = str.lastIndexOf("a", str.length() - 1);
		int b = str.lastIndexOf("b", str.length() - 1);
		int c = str.lastIndexOf("c", str.length() - 1);
		int d = str.lastIndexOf("d", str.length() - 1);
		int e = str.lastIndexOf("e", str.length() - 1);
		int f = str.lastIndexOf("f", str.length() - 1);
		int g = str.lastIndexOf("g", str.length() - 1);
		int h = str.lastIndexOf("h", str.length() - 1);
		int i = str.lastIndexOf("i", str.length() - 1);
		int j = str.lastIndexOf("j", str.length() - 1);
		int k = str.lastIndexOf("k", str.length() - 1);
		int l = str.lastIndexOf("l", str.length() - 1);
		int m = str.lastIndexOf("m", str.length() - 1);
		int n = str.lastIndexOf("n", str.length() - 1);
		int o = str.lastIndexOf("o", str.length() - 1);
		int p = str.lastIndexOf("p", str.length() - 1);
		int q = str.lastIndexOf("q", str.length() - 1);
		int r = str.lastIndexOf("r", str.length() - 1);
		int s = str.lastIndexOf("s", str.length() - 1);
		int t = str.lastIndexOf("t", str.length() - 1);
		int u = str.lastIndexOf("u", str.length() - 1);
		int v = str.lastIndexOf("v", str.length() - 1);
		int w = str.lastIndexOf("w", str.length() - 1);
		int x = str.lastIndexOf("x", str.length() - 1);
		int y = str.lastIndexOf("y", str.length() - 1);
		int z = str.lastIndexOf("z", str.length() - 1);
		System.out.println(t + " " + a + " " + n + " " + m + " " + o + " " + y);

		// find the length of a string
		int length = str.length();
		System.out.println(length);
		// region in the current string matches a region in another
		String str1 = "brown fox";
		boolean match1 = str.regionMatches(10, str1, 0, 9);
		System.out.println(match1);
		// replace all the 'd' characters with 'f' characters.
		String str2 = str.replace('d', 'f');
		System.out.println(str2);
		// replace each substring of a given string
		String str3 = str.replaceAll("fox", "cat");
		System.out.println(str3);
		CharSequence cs1 = "lazy";
		CharSequence cs2 = "energic";
		System.out.println(str.replace(cs1, cs2));
		// check whether a given string starts with the contents of another string.
		boolean checkPre = str.startsWith("The");
		System.out.println(checkPre);
		// get a substring of a given string between two specified positions.
		System.out.println(str.substring(10, 20));
		// create a character array containing the contents of a string
		char[] charArr = str.toCharArray();
		System.out.println(Arrays.toString(charArr));
		// Convert the above string to a char array.
		char[] arr = str.toCharArray();

		// Display the contents of the char array.
		System.out.println(charArr);
		// convert all the characters in a string to lower case. 
		String str4=str.toLowerCase();
		System.out.println(str4);
		//convert all the characters in a string to upper case.
		String str5=str.toUpperCase();
		System.out.println(str5);
		// to trim any leading or trailing whitespace from a given string.
		String srt6=str.trim();//trim leading and trail space
		

	}

}
