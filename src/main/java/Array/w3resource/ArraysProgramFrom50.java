package Array.w3resource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ArraysProgramFrom50 {

	public static void main(String[] args) {

		/*
		 * (55) print all sub-arrays with 0 sum present in a given array of integers.
		 * 
		 */
		int[] nums1 = { 1, 3, -7, 3, 2, 3, 1, -3, -2, -2 };
		List<Integer> llist = new ArrayList<>();
		for (int i = 0; i < nums1.length; i++) {
			int sum = 0;
			llist.removeAll(llist);
			for (int j = i; j < nums1.length; j++) {
				sum += nums1[j];
				llist.add(nums1[j]);
				if (sum == 0) {
					System.out.println("Sub-arrays with 0 sum : " + llist.toString());

				}
			}
		}

		/*
		 * (56) sort a given binary array in linear times
		 * 
		 */
		int arr[] = { 1, 0, 0, 1, 0, 1, 1, 0 };
		int k = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				arr[k++] = 0;
			}
		}

		for (int i = k; i < arr.length; i++) {
			arr[k++] = 1;
		}
		System.out.println(Arrays.toString(arr));
		/*
		 * (58) to merge elements of A with B by maintaining the sorted order i.e. fill
		 * A with first p smallest elements and fill B with remaining elements.
		 */
		int[] A = { 1, 5, 6, 7, 8, 10 };
		int p = A.length;
		int[] B = { 2, 4, 9 };
		int q = B.length;
		System.out.println("Original : "+Arrays.toString(A));
		System.out.println("Original : "+Arrays.toString(B));
		for (int i = 0; i < p; i++) {
			if (A[i] > B[0]) {
				int temp = A[i];
				A[i] = B[0];
				B[0] = temp;

				int first_arr = B[0];
				for (k = 1; k < q && B[k] < first_arr; k++) {
					B[k - 1] = B[k];
				}

				B[k - 1] = first_arr;
			}
		}
		System.out.println(Arrays.toString(A));
		System.out.println(Arrays.toString(B));
		
		/*
		 * (59)
		 *  to find maximum product of two integers in a given array of integers.
		 *  
		 */
		int arr1[]= {22,5,6,3,8};
		int mul=1;
		int max_i=0,max_j=0;
		for(int i=0;i<arr1.length-1;i++) {
			for(int j=i+1;j<arr1.length;j++) {
				if(mul<arr1[i]*arr1[j]) {
					mul=arr1[i]*arr1[j];
					max_i=i;
					max_j=j;
				}
			}
		}
		System.out.println(arr1[max_i]+" "+arr1[max_j]);
		
		/*
		 *(60) 
		 *  to shuffle a given array of integers.
		 *  
		 */
		
		for(int i=arr1.length-1;i>=0;i--) {
			Random r=new Random();
			int j=r.nextInt(i+1);
			System.out.println("J "+j);
			int temp=arr1[i];
			arr1[i]=arr1[j];
			arr1[j]=temp;
		}
		System.out.println(Arrays.toString(arr1));
	}

}