package Array.w3resource;

import java.util.Arrays;

public class ArraysProgramFrom44 {

	public static void main(String[] args) {
		// count the number of possible triangles from a given unsorted array of
		// positive integers
		int nums[] = { 6, 7, 9, 16, 25, 12, 30, 40 };
		int n = nums.length;
		int count = 0;
		// Find other three elements after fixing first element
		for (int i = 0; i < n - 2; i++) {
			// Find other two elements after fixing second element
			for (int j = i + 1; j < n - 1; j++) {
				// Find the fourth element after fixing third element
				for (int k = j + 1; k < n; k++) {
					if (nums[i] + nums[j] > nums[k] && nums[i] + nums[k] > nums[j] && nums[j] + nums[k] > nums[i]) {
						System.out.println(nums[i] + "  " + nums[j] + "  " + nums[k]);
						count++;
					}
				}
			}
		}
		System.out.println(count);
		System.out.println("No of Triangles= > "+findNumberOfTriangles(nums));
	}

	static int findNumberOfTriangles(int arr[]) {
		int n = arr.length;
		// Sort the array elements in non-decreasing order
		Arrays.sort(arr);

		// Initialize count of triangles
		int count = 0;

		// Fix the first element. We need to run till n-3 as
		// the other two elements are selected from arr[i+1...n-1]
		for (int i = 0; i < n - 2; ++i) {
			// Initialize index of the rightmost third element
			int k = i + 2;

			// Fix the second element
			for (int j = i + 1; j < n; ++j) {
				/*
				 * Find the rightmost element which is smaller than the sum of two fixed
				 * elements The important thing to note here is, we use the previous value of k.
				 * If value of arr[i] + arr[j-1] was greater than arr[k], then arr[i] + arr[j]
				 * must be greater than k, because the array is sorted.
				 */
				while (k < n && arr[i] + arr[j] > arr[k])
					++k;
				/*
				 * Total number of possible triangles that can be formed with the two fixed
				 * elements is k - j - 1. The two fixed elements are arr[i] and arr[j]. All
				 * elements between arr[j+1] to arr[k-1] can form a triangle with arr[i] and
				 * arr[j]. One is subtracted from k because k is incremented one extra in above
				 * while loop. k will always be greater than j. If j becomes equal to k, then
				 * above loop will increment k, because arr[k] + arr[i] is always/ greater than
				 * arr[k]
				 */
				if (k > j)
					count += k - j - 1;
			}
		}
		return count;
	}
}