package Array.w3resource;

import java.util.Arrays;

public class ArraysProgramFrom51 {

	public static void main(String[] args) {

		/*
		 * (61) to rearrange a given array of unique elements such that every second
		 * element of the array is greater than its left and right elements.
		 */

		int arr[] = { 1, 2, 4, 9, 5, 3, 8, 7, 10, 12, 14 };
		for (int i = 1; i < arr.length; i += 2) {
			if (arr[i - 1] > arr[i]) {
				swapElement(arr, i - 1, i);
			}
			if (arr[i + 1] > arr[i] && i + 1 < arr.length) {
				swapElement(arr, i + 1, i);
			}
		}
		System.out.println(Arrays.toString(arr));

		/*
		 * (62) Find the equilibrium indices from a given array of integers
		 * 
		 */

		int arr1[] = { -7, 1, 5, 2, -4, 3, 0 };
		// find total sum
		int totalSum = 0;
		for (int n : arr1) {
			totalSum += n;
		}
		// compare running sum to remaining sum to find equlibrium indices
		int runningSum = 0;
		for (int i = 0; i < arr1.length; i++) {

			if (totalSum - runningSum - arr1[i] == runningSum) {
				System.out.println("Equilibrium indices found at : " + i);
				System.out.println(totalSum + " " + runningSum + " " + arr1[i]);
			}
			runningSum += arr1[i];
		}

		/*
		 * (63) to replace each element of the array with product of every other element
		 * in a given array of integers.
		 */
		int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
		int n = nums.length;

		int[] left_element = new int[n];
		int[] right_element = new int[n];

		left_element[0] = 1;
		for (int i = 1; i < n; i++) {
			left_element[i] = nums[i - 1] * left_element[i - 1];
		}

		right_element[n - 1] = 1;
		for (int j = n - 2; j >= 0; j--) {
			right_element[j] = nums[j + 1] * right_element[j + 1];
		}

		for (int i = 0; i < n; i++) {
			nums[i] = left_element[i] * right_element[i];
		}
		System.out.println(Arrays.toString(nums));
	}

	private static void swapElement(int[] arr, int i, int i2) {
		int temp = arr[i];
		arr[i] = arr[i2];
		arr[i2] = temp;

	}

}