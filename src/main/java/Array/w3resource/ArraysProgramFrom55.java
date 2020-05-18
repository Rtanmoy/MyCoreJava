package Array.w3resource;

import java.util.Arrays;

public class ArraysProgramFrom55 {

	public static void main(String[] args) {
		/*
		 * (71) to form the largest number from a given list of non negative integers.
		 * 
		 */
		int[] nums = { 1, 2, 3, 0, 4, 6 };
		System.out.println("\nOriginal array: " + Arrays.toString(nums));
		String[] array_nums = Arrays.stream(nums).mapToObj(String::valueOf).toArray(String[]::new);// convert integer to
																									// string array
		System.out.println("Arrays_nums :" + Arrays.toString(array_nums));
		Arrays.sort(array_nums, (String str1, String str2) -> (str2 + str1).compareTo(str1 + str2));
		String str = Arrays.stream(array_nums).reduce((a, b) -> a.equals("0") ? b : a + b).get();
		System.out.println(str);
	}
}