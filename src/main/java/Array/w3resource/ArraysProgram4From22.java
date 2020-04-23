package Array.w3resource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysProgram4From22 {
	public static void main(String[] args) {
		// sort numeric and string array
		int num[] = { 1, 22, 44, 55, 11, 5 };
		int num1[] = { 1, 33, 44, 3, 5, 77 };
		int num2[] = {33, 44, 3, 5, 77 };
		String str[] = { "Oh", "my", "god" };
		Arrays.sort(num);
		Arrays.sort(str);
		System.out.println(Arrays.toString(num));
		System.out.println(Arrays.toString(str));

		//find sum of given no
		findPair(num,66);
		
		//find missing element in an array
		int arr[]= {1,2,4,5};
		int total_element=5;
		int sum=0;
		int expected_sum=total_element*((total_element+1)/2);
		for(int i:arr) {
			sum+=i;
		}
		int mis_ele=expected_sum-sum;
		System.out.println(mis_ele);
		
		//common element among three array
		List<Integer>common=new ArrayList<>();
		 int array1[] = {2, 4, 8};
		   int array2[] = {2, 3, 4, 8, 10, 16};
		   int array3[] = {4, 8, 14, 40};
			int x = 0, y = 0, z = 0;
			while (x < array1.length && y < array2.length && z < array3.length){
				if (array1[x] == array2[y] && array2[y] == array3[z]){
					common.add(array1[x]);
					x++;
					y++;
					z++;
				}
				else if (array1[x] < array2[y])
					x++;
				else if (array2[y] < array3[z])
					y++;
				else
					z++;
			}
			System.out.println("Common elements from three sorted (in non-decreasing order ) arrays: ");
		System.out.println(common);
	}

	private static void findPair(int[] num, int sum) {
		for(int i=0;i<num.length;i++) {
			for(int j=0;j<num.length;j++) {
				if(num[i]+num[j]==sum) {
					System.out.println(num[i]+"+"+num[j]+" = "+sum);
				}
			}
		}
		
	}
}
