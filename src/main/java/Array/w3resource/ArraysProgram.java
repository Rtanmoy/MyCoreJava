package Array.w3resource;
import java.util.Arrays;

public class ArraysProgram {
	public static void main(String[] args) {
		// sort numeric and string array
		int num[] = { 1, 22, 44, 55, 11 };
		String str[] = { "Oh", "my", "god" };
		Arrays.sort(num);
		Arrays.sort(str);
		System.out.println(Arrays.toString(num));
		System.out.println(Arrays.toString(str));

		// summation of array
		int sum = 0;
		for (int i : num) {
			sum += i;
		}
		System.out.println(sum);

		// print a perticullar grid
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

		// average of summation in array
		int length = num.length;
		double average = (double) sum / length;
		System.out.println("length " + length + "  " + average);

		// find specific value

		int p = 2;
		for (int i = 0; i < length; i++) {
			if (p == num[i]) {
				System.out.println("find specific value");
			}
		}
		System.out.println("not exits");

		// find array index of specific element
		System.out.println("Index position of 25 is: " + findIndex(num, 44));
		System.out.println("Index position of 77 is: " + findIndex(num, 77));

		// Remove the second element (index->1, value->14) of the array
		int removeIndex = 1;

		for (int i = removeIndex; i < num.length - 1; i++) {
			num[i] = num[i + 1];
		}
		// We cannot alter the size of an array , after the removal, the last and second
		// last element in the array will exist twice
		System.out.println("After removing the second element: " + Arrays.toString(num));

		// copy an array into a new array
		int new_array[] = new int[10];
		for (int i = 0; i < length; i++) {
			new_array[i] = num[i];
		}
		System.out.println("New Array =>> " + Arrays.toString(new_array));

		 // Insert an element in 3rd position of the array (index->2, value->5)
		   
		   int Index_position =2;
		   int newValue    = 5;

		  System.out.println("Original Array : "+Arrays.toString(num)+" "+num.length);     
		   
		  for(int i=num.length-1; i > Index_position; i--){
		    num[i] = num[i-1];
		   }
		   num[Index_position] = newValue;
		   System.out.println("New Array: "+Arrays.toString(num));
	}

	public static int findIndex(int[] my_array, int t) {
		if (my_array == null)
			return -1;
		int len = my_array.length;
		int i = 0;
		while (i < len) {
			if (my_array[i] == t)
				return i;
			else
				i = i + 1;
		}
		return -1;
	}
}
