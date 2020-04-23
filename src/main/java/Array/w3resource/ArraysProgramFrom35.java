package Array.w3resource;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ArraysProgramFrom35 {
	public static void main(String[] args) {

		// the sum of the two elements of a given array which is equal to a given
		// integer.
		int sum[] = { 2, 44, 5, 4, 3, 11 };
		//System.out.println("Enter the check no: ");
		// Scanner sc = new Scanner(System.in);
		// int exp = sc.nextInt();
		int exp = 7;

		//findPair(sum, exp);

		
		//sortingFindPair(sum, exp);
		usingHashMap(sum, exp);

	}

	private static void usingHashMap(int[] sum, int exp) {
		System.out.println(Arrays.toString(sum));
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < sum.length; i++) {
			if (map.containsKey(exp - sum[i])) {
				System.out.println("Pair found index " + map.get(exp - sum[i]) + " and " + i);
				return;
			}
			map.put(sum[i], i);
		}
		System.out.println("Pair not found");

	}

	private static void sortingFindPair(int[] sum, int exp) {
		// sort array
		Arrays.sort(sum);
		System.out.println(Arrays.toString(sum));
		// take low and high index
		int low = 0;
		int count = 0;
		int high = sum.length - 1;
		while (low < high) {
			if (sum[low] + sum[high] == exp) {
				System.out.println("Pair Found " + sum[low] + "  " + sum[high]);
				return;
			} else if (sum[low] + sum[high] < exp) {
				low++;
			} else {
				high--;
			}
		}

	}

	// Native method
	private static void findPair(int[] sum, int exp) {
		int count = 0;
		for (int i = 0; i < sum.length - 1; i++) {
			for (int j = i + 1; j < sum.length; j++) {
				if (sum[i] + sum[j] == exp) {
					System.out.println("Indexs : " + i + " + " + j);
					// return;
					count++;
				}
			}
		}
		if (count > 0) {
			System.out.println(" Found");
		} else {
			System.out.println("Not Found");
		}
	}
}
