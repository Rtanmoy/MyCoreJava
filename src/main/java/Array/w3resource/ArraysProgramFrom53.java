package Array.w3resource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysProgramFrom53 {

	public static void main(String[] args) {

		/*
		 * (68) Create all possible permutations of a given array of distinct integers
		 * 
		 */
		int[] nums1 = { 1, 2, 3, 4 };
		System.out.println("\nOriginal array: " + Arrays.toString(nums1));
		List<List<Integer>> result1 = new ArraysProgramFrom53().permute(nums1);
		System.out.println("\nPossible permutations of the said array:");
		result1.forEach(System.out::println);
		int[] nums2 = { 1, 2, 3 };
		System.out.println("\nOriginal array: " + Arrays.toString(nums2));
		List<List<Integer>> result2 = new ArraysProgramFrom53().permute(nums2);
		System.out.println("\nPossible permutations of the said array:");
		result2.forEach(System.out::println);

		/*
		 * (69) to find minimum subarray sum of specified size in a given array of
		 * integers.
		 */

		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int n = arr.length;
		int k = 4;
		// k must be greater
		if (n < k) {
			System.out.println("Invalid");
			return;
		}

		// Compute sum of first window of size k
		int res = 0;
		for (int i = 0; i < k; i++)
			res += arr[i];

		// Compute sums of remaining windows by
		// removing first element of previous
		// window and adding last element of
		// current window.
		int curr_sum = res;

		for (int i = k; i < n; i++) {
			curr_sum += arr[i] - arr[i - k];
			res = Math.min(res, curr_sum);
		}
		System.out.println("Minimum sum of sub-array "+res);

		/**** Another approach ***/
		int sub_arr_sum = 0;
		int min_sub_arr = Integer.MAX_VALUE;
		int last = 0;
		int[] result = new int[3];

		for (int i = 0; i < arr.length; i++) {
			sub_arr_sum += arr[i];

			if (i + 1 >= k) {
				if (min_sub_arr > sub_arr_sum) {
					min_sub_arr = sub_arr_sum;
					last = i;
				}

				sub_arr_sum -= arr[i + 1 - k];
			}
		}
		result[0] = last - k + 1;
		result[1] = last;
		result[2] = min_sub_arr;

		System.out.printf("\nOriginal array: " + Arrays.toString(arr));
		System.out.printf("\nSub-array from %d to %d and sum is: %d", result[0], result[1], result[2]);
	}

	public List<List<Integer>> permute(int[] nums) {
		List<List<Integer>> result = new ArrayList<>();
		Permutation(0, nums, result);
		return result;
	}

	private void Permutation(int i, int[] nums, List<List<Integer>> result) {
		if (i == nums.length - 1) {
			List<Integer> list = new ArrayList<>();
			for (int n : nums)
				list.add(n);
			result.add(list);
		} else {
			for (int j = i, l = nums.length; j < l; j++) {
				int temp = nums[j];
				nums[j] = nums[i];
				nums[i] = temp;
				Permutation(i + 1, nums, result);
				temp = nums[j];
				nums[j] = nums[i];
				nums[i] = temp;
			}
		}

	}

}