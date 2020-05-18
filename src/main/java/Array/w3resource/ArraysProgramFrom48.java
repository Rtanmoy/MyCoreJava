package Array.w3resource;

import java.util.Arrays;

public class ArraysProgramFrom48 {

	public static void main(String[] args) {

		/*
		 * (50)
		 * to sort an array of positive integers of a given array, in the sorted array ,
		 * second value should be the value of the first element should be maximum
		 * minimum value, third should be second maximum, fourth second be second
		 * minimum and so on.
		 */
		int arr[] = { 4, 2, 5, 1, 3, 6 };
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		int arr1[] = new int[arr.length];
		int small_num = 0, large_num = arr.length - 1;
		boolean flag = true;
		for (int i = 0; i < arr.length; i++) {
			if (flag)
				arr1[i] = arr[large_num--];
			else
				arr1[i] = arr[small_num++];

			flag = !flag;

		}
		System.out.println(Arrays.toString(arr1));
		
		
		/*
		 * (51)
		 * to separate 0s on left side and 1s on right side of an array of 0s and 1s in
		 * random order.
		 */
		int arr2[]= {1,0,1,0,1,0,0};
		int left=0,right=arr2.length-1;
		while(left<right) {
			
			while(arr2[left]==0&&left<right) {
				left++;
			}
			while(arr2[right]==1&&left<right) {
				right--;
			}
			if(left<right) {
				arr2[left]=0;
				arr2[right]=1;
				left++;
				right--;
			}
		}
		System.out.println(Arrays.toString(arr2));
		
		/*another approach*/
		int count=0;
		for(int i=0;i<right+1;i++) {
			if(arr2[i]==0) {
				count++;
			}
		}
		for(int i=0;i<count;i++) {
			arr2[i]=0;
			}
		for(int i=count;i<right+1;i++) {
			arr2[i]=1;
			}
		System.out.println(Arrays.toString(arr2));
	}
	
}