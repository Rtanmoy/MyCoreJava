package Array.w3resource;

import java.util.Arrays;

public class ArraysProgramFrom43 {
	private static int sum;

	public static void main(String[] args) {
		// find the two elements from a given array of positive and
		// negative numbers such that their sum is closest to zero.
		int[] arr = { 1, 5, -4, 7, 8, -6 };
		int min = 0;
		int max = 1;
		int min_sum = arr[min] + arr[max];
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				sum = arr[i] + arr[j];
				if (Math.abs(min_sum) > Math.abs(sum)) {
					min_sum = sum;
					min = i;
					max = j;
				}
			}
		}
		System.out.println(arr[min] + "   " + arr[max]);

		// find smalest and second smallest element in an array
		Arrays.sort(arr);
		System.out.println(arr[0] + " " + arr[1]);
		int smallest = 0;
		int secondSmallest = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] < smallest) {
				secondSmallest = smallest;
				smallest = arr[i];
			} else if (arr[i] < secondSmallest) {
				secondSmallest = arr[i];
			}
		}
		System.out.println("smallest=> " + smallest + " secondSmallest=>  " + secondSmallest);

		// segregate all 0s on left side and all 1s on right side of a given array of 0s
		// and 1s
		int nums[] = { 0, 1, 1, 1, 0, 1, 0, 0, 1, 1, 0, 0 };
		int nums_size = nums.length;
		int left = 0, right = nums_size - 1;

		System.out.println("Original Array : " + Arrays.toString(nums));

		while (left < right) {

			// While 0 at left increment left index
			while (nums[left] == 0 && left < right) {
				left++;
			}

			// While we see 1 at right decrement right index

			while (nums[right] == 1 && left < right) {
				right--;
			}

			if (left < right) {
				nums[left] = 0;
				nums[right] = 1;
				left++;
				right--;
			}
		}
		System.out.println(Arrays.toString(nums));
	}
}
