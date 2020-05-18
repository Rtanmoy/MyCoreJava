package Array.w3resource;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArraysProgramFrom49 {

	public static void main(String[] args) {

		/*
		 * (52) to separate even and odd numbers of a given array of integers. Put all
		 * even numbers first, and then odd numbers.
		 * 
		 */
		int arr[] = { 2, 4, 5, 6, 3, 7, 8, 12, 13 };
		int left = 0, right = arr.length - 1;
		while (left < right) {
			while (arr[left] % 2 == 0 && left < right) {
				left++;
			}
			while (arr[right] % 2 != 0) {
				right--;
			}
			if (left < right) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;
			}
		}
		System.out.println(Arrays.toString(arr));

		/*
		 * (53) to replace every element with the next greatest element (from right
		 * side) in a given array of integers
		 */
		int arr1[] = { 16, 17, 4, 3, 5, 2 };
		int size = arr1.length;

		// Initialize the next greatest element
		int max_from_right = arr1[size - 1];

		// The next greatest element for the rightmost
		// element is always -1
		arr1[size - 1] = -1;

		// Replace all other elements with the next greatest
		for (int i = size - 2; i >= 0; i--) {
			// Store the current element (needed later for
			// updating the next greatest element)
			int temp = arr1[i];

			// Replace current element with the next greatest
			arr1[i] = max_from_right;

			// Update the greatest element, if needed
			if (max_from_right < temp)
				max_from_right = temp;
		}
		System.out.println(Arrays.toString(arr1));

		/*
		 * (54) to check if a given array contains a subarray with 0 sum.
		 */

		int[] nums1 = { 1, 2, -2, 3, 4, 5, 6 };
		System.out.println("Original array: " + Arrays.toString(nums1));
		System.out.println("Does the said array contain a subarray with 0 sum: " + find_subarray_sum_zero(nums1));
		int[] nums2 = { 1, 2, 3, 4, 5, 6 };
		System.out.println("\nOriginal array: " + Arrays.toString(nums2));
		System.out.println("Does the said array contain a subarray with 0 sum: " + find_subarray_sum_zero(nums2));
		
		
	}

	public static Boolean find_subarray_sum_zero(int[] nums) {
		Set<Integer> set = new HashSet<>();
		set.add(0);
		int suba_sum = 0;
		for (int i = 0; i < nums.length; i++) {
			suba_sum += nums[i];

			if (set.contains(suba_sum)) {
				return true;
			}
			set.add(suba_sum);
		}

		return false;
	}

}