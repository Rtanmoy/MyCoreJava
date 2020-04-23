package Array.w3resource;
import java.util.Arrays;

public class ArraysProgram3 {
	public static void main(String[] args) {
		// sort numeric and string array
		int num[] = { 1, 22, 44, 55, 11, 22 };
		String str[] = { "Oh", "my", "god" };
		Arrays.sort(num);
		Arrays.sort(str);
		System.out.println(Arrays.toString(num));
		System.out.println(Arrays.toString(str));

		// add two matrix
		int arr1[] = { 2, 4, 5, 6 };
		int arr2[] = { 4, 6, 7, 8 };
		int arr3[] = new int[4];
		for (int i = 0; i < 4; i++) {
			arr3[i] = arr1[i] + arr2[i];
		}
		System.out.println(Arrays.toString(arr3));
		System.out.println("<<============================================>>");
		// Declaration and initialization of 2D array
		int a[][] = { { 1, 2, 3 }, { 4, 5, 6 } };
		int b[][] = { { 7, 8, 9 }, { 10, 11, 12 } };

		// Instantiation of third array to store results
		int c[][] = new int[2][3];

		for (int i = 0; i < 2; ++i) {
			for (int j = 0; j < 3; ++j) {
				// add two array and result store in third array
				c[i][j] = a[i][j] + b[i][j];
				// System.out.println("Enter sum of " + i + " " + j + "index" + " " + c[i][j]);
			}
		}
		for (int[] x : c) {
			System.out.println(Arrays.toString(x));
		}
		
	}
}
