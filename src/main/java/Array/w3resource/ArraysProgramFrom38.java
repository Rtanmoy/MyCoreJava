package Array.w3resource;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ArraysProgramFrom38 {
	public static void main(String[] args) {
		// Array - test majority element
		int nums[] = { 1, 6, 6, 5, 7, 4, 1, 7, 7, 7, 7, 7, 7, 7, 2 };
		System.out.println("Original Array : " + Arrays.toString(nums));
		int result = MajorityElement(nums);
		if (result != -1)
			System.out.println("Majority element is " + result);
		else
			System.out.println("Majority element does not exist");
		
		
		// leader if it is greater than all the elements to its right side.
		int[]int_arr= {10,9,2,34,5,0,7};
		int n=int_arr.length;
		for(int i=0;i<n;i++) {
			int j;
			for(j=i+1;j<n;j++) {
				if(int_arr[i]<=int_arr[j]) {
					break;
				}
			}
			if(j==n)
			System.out.println(int_arr[i]);
		
		}
	}

	public static int MajorityElement(int arra1[]) {
		int n = arra1.length;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		// Element's frequency in a map
		for (int i = 0; i < n; i++) {
			if (map.get(arra1[i]) == null)
				map.put(arra1[i], 0);

			map.put(arra1[i], map.get(arra1[i]) + 1);
		}
		/*
		 * // Return the element if its count is more than n/2 Iterator it =
		 * map.entrySet().iterator(); while (it.hasNext()) { Map.Entry pair =
		 * (Map.Entry) it.next(); if ((int) pair.getValue() > n / 2) return (int)
		 * pair.getKey();
		 * 
		 * it.remove(); }
		 */
		for (Map.Entry<Integer, Integer> e : map.entrySet()) {
			if ((int) e.getValue() > n / 2)
				return (int) e.getKey();

		}
		// no majority element
		return -1;
	}
}
