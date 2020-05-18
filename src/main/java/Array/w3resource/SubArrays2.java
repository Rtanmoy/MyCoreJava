package Array.w3resource;

import java.util.Arrays;
import java.util.stream.IntStream;

import org.apache.commons.lang3.ArrayUtils;

public class SubArrays2 {
	// Get subarray of a non-primitive array between specified indices
	public static void main(String[] args) {
		String[] arr = { "A", "B", "C", "D", "E", "F", "G", "H" };
		int beg = 1, end = 4;

		String[] subarray = IntStream.range(beg, end + 1).mapToObj(i -> arr[i]).toArray(String[]::new);

		System.out.println(Arrays.toString(subarray));

		//
		String[] subarray1 = new String[end - beg + 1];
		System.arraycopy(arr, beg, subarray1, 0, subarray1.length);

		System.out.println(Arrays.toString(subarray1));

		///
		String[] subarray2 = Arrays.asList(arr).subList(beg, end + 1).toArray(new String[0]);

		System.out.println(Arrays.toString(subarray2));
		
		///
		String[] subarray3= new String[end - beg + 1];
		for (int i = 0; i < subarray3.length; i++) {
			subarray3[i] = arr[beg + i];
		}

		System.out.println(Arrays.toString(subarray3));
		
		////
		Object[] subarray4 = ArrayUtils.subarray(arr, beg, end + 1);
		System.out.println(Arrays.toString(subarray4));
		
		/////
		String[] subarray5 = Arrays.copyOf(arr, end + 1, String[].class);
		System.out.println(Arrays.toString(subarray5));
	}
}
