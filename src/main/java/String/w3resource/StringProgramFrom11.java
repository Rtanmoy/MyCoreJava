package String.w3resource;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

public class StringProgramFrom11 {

	public static void main(String[] args) {
		char arr_ch[] = { '1', '2', '3', '4' };
		// Create a String containig the contents of arr_num
		// starting at index 1 for length 2.
		String str = String.copyValueOf(arr_ch, 0, 3);
		System.out.println("The book contains " + str + " pages.");
		// given string ends with the contents of another string.
		String str1 = "Classes";
		System.out.println(str1.endsWith("es"));
		// check two string contsin same data or not
		String str2 = "classes";
		System.out.println(str1.equals(str2));
		// Time and Date according to system
		System.out.println(str1.equalsIgnoreCase(str2));
		System.out.println(new Date());
		Calendar c = Calendar.getInstance();
		System.out.println("Current Date and Time :");
		System.out.format("%tB %te, %tY%n", c, c, c);
		System.out.format("%tl:%tM %tp%n", c, c, c);
		// get the contents of a given string as a byte array.
		byte[] byteArr = str1.getBytes();
		String str3 = new String(byteArr);
		System.out.println(str3 + "  " + Arrays.toString(byteArr));
		// get the contents of a given string as a character array.
		char[] charArr = str1.toCharArray();
		System.out.println(Arrays.toString(charArr));
		String str4 = "This is a sample string.";

		// /Copy the contents of the String to a byte array.
		// /Only copy characters 4 through 10 from str.
		// /Fill the source array starting at position 2.
		char[] arr = new char[] { ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' };
		str4.getChars(4, 10, arr, 2);

		// /Display the contents of the byte array.
		System.out.println("The char array equals \"" + arr + "\"");
		
		//get the index of all the characters of the alphabet.
		String str5="The quick brown fox jumps over the lazy dog.";
		
		
	}

}
