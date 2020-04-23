package Array.w3resource;

import java.util.Arrays;

public class ArraysProgramFrom46 {
	static int count_rotations(int arr_int[], int n) {
		int min_val = arr_int[0], min_index = -1;
		for (int i = 0; i < n; i++) {
			if (min_val > arr_int[i]) {
				min_val = arr_int[i];
				min_index = i;
			}
		}
		return min_index;
	}

	public static void main(String[] args) {
		// int arr_int[] = {35, 32, 30, 14, 18, 21, 27}; //3
		// int arr_int[] = {35, 32, 14, 18, 21, 27}; //2
		int arr_int[] = { 35, 14, 18, 21, 27 }; // 1
		int n = arr_int.length;
		System.out.println(count_rotations(arr_int, n) + "   " + Arrays.toString(arr_int));

		// to arrange the elements of a given array of integers
		// where all negative integers appear before all the positive integers.
		int[] nums = { -4, 8, 6, -5, 6, -2, 1, 2, 3, -11 };
		int length = nums.length;
		int j = 0, temp;
		for (int i = 0; i < length; i++) {
			if (nums[i] < 0) {
				if (i != j) {
					temp = nums[i]; //-4
					nums[i] = nums[j]; //
					nums[j] = temp;  //-4
				}
				j++;
			}
		}
		/*
		 * for (int i = 0; i < length; i++) System.out.print(nums[i] + " ");
		 */
		System.out.println(Arrays.toString(nums));
	}
}