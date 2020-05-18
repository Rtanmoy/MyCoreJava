package Array.w3resource;

import java.util.Arrays;

public class ArraysProgramFrom52 {

	public static void main(String[] args) {

		int[] nums = { 4, 5, 9, 5, 6, 10, 11, 9, 6, 4, 5 };
		int[] incre_array = new int[nums.length];
		incre_array[0] = 1;
		for (int i = 1; i < nums.length; i++) {
			incre_array[i] = 1;
			if (nums[i - 1] < nums[i]) {
				incre_array[i] = incre_array[i - 1] + 1;
			}
		}
		System.out.println("Increment Array " + Arrays.toString(incre_array));
		int[] decre_array = new int[nums.length];
		decre_array[nums.length - 1] = 1;
		for (int i = nums.length - 2; i >= 0; i--) {
			decre_array[i] = 1;
			if (nums[i] > nums[i + 1]) {
				decre_array[i] = decre_array[i + 1] + 1;
			}
		}
		System.out.println("Decrement Array " + Arrays.toString(decre_array));
		int lbs_len = 1;
		int start = 0, end = 0;

		for (int i = 0; i < nums.length; i++) {
			if (lbs_len < incre_array[i] + decre_array[i] - 1) {
				lbs_len = incre_array[i] + decre_array[i] - 1;
				start = i - incre_array[i] + 1;
				end = i + decre_array[i] - 1;
			}
		}

		// print longest bitonic sub-array
		System.out.println("The longest bitonic subarray is [" + start + "," + end + "]");
		System.out.print("Elements of the said sub-array: ");
		for (int x = start; x <= end; x++) {
			System.out.print(nums[x] + " ");
		}

		System.out.println("\nThe length of longest bitonic subarray is " + lbs_len);

		/*
		 * (65) Find maximum difference between two elements in a given array of
		 * integers such that smaller element appears before larger element
		 */

		int arr[] = { 2, 33, 1, 7, 9, 5, 11, 3, 5 };
		int maxDif = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				maxDif = Integer.max(maxDif, arr[j] - arr[i]);
			}
		}
		System.out.println(maxDif);

		/*
		 * (66) to find contiguous subarray within a given array of integers which has
		 * the largest sum.
		 */
		int[] A = { 1, 2, -3, -4, 0, 6, 7, 8, 9 };
		int max_ele_val = 0;
		int max_end = 0;
		for (int i : A) {
			max_end = max_end + i;
			max_end = Integer.max(max_end, 0);

			max_ele_val = Integer.max(max_ele_val, max_end);
		}
		System.out.println(max_ele_val);
		
		/*
		 * (67)
		 *  find subarray which has the largest sum in a given circular array of
		 * integers.
		 */
		
		int[] nums1 = { 2, 1, -5, 4, -3, 1, -3, 4, -1 };
		
	}

}