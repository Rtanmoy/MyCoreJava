package Array.w3resource;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class ArraysProgram2 {
	public static void main(String[] args) {
		// sort numeric and string array
		int num[] = { 1, 22, 44, 55, 11, 22 };
		String str[] = { "Oh", "my", "god" };
		Arrays.sort(num);
		Arrays.sort(str);
		System.out.println(Arrays.toString(num));
		System.out.println(Arrays.toString(str));

		// reverse an array
		StringBuilder sb = new StringBuilder();
		for (int a : num) {
			sb.append(a);
		}
		StringBuilder sbrev = sb.reverse();
		System.out.println(sbrev);

		for (int i = num.length - 1; i >= 0; i--) {
			System.out.println(num[i]);
		}

		for (int i = 0; i < num.length / 2; i++) {
			int temp = num[i];
			num[i] = num[num.length - i - 1];
			num[num.length - i - 1] = temp;
		}
		System.out.println(Arrays.toString(num));

		// find duplicate in array
		for (int i = 0; i < num.length - 1; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] == num[j]) {
					System.out.println(num[j]);
				}
			}
		}
		System.out.println("===========================================>>");
		// find common element between two array
		Set<Integer> set = new HashSet<>();
		int num1[] = { 12, 44, 32, 22, 11 };
		for (int i = 0; i < num1.length; i++) {
			for (int j = 0; j < num.length; j++) {
				if (num[j] == num1[i]) {
					set.add(num[i]);
				}
			}
		}
		System.out.println(set);
		System.out.println("<<==========// Remove Duplicate //==========>>");
		
		int length=num.length;
		for(int i=0;i<length;i++) {
			for(int j=i+1;j<length;j++) {
				if(num[i]==num[j]) {	
					num[j]=num[length-1];
					length--;
					j--;
				}
			}
		}
		int[] array1 = Arrays.copyOf(num, length);
		System.out.println(Arrays.toString(array1));
		Set<Integer> set1 = new LinkedHashSet<>();
		for(int i:num) {
			set1.add(i);
		}
		System.out.println(set1);
		System.out.println("<<===========//Second Lergest number//===================>>");
		
		int secondLargest=0;
		int largest=0;
		for (int i = 0; i < num.length; i++) {
			if (num[i] > largest) {
				secondLargest = largest;
				largest = num[i];
			} else if (num[i] >secondLargest) {
				secondLargest = num[i];
			}
		}
		System.out.println("Second largest number is:" + secondLargest);
		System.out.println("Largest Number is: " + largest);
		
		Arrays.sort(num);
		System.out.println(Arrays.toString(num));
		for (int i = 0; i < num.length / 2; i++) {
			int temp = num[i];
			num[i] = num[num.length - i - 1];
			num[num.length - i - 1] = temp;
		}
		System.out.println("second lergest "+num[1]);
		System.out.println("second min "+num[length-1]);
		
	}
}
