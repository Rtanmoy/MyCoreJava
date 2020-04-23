package Array.w3resource;

import java.util.Arrays;

public class ArraysProgramFrom26 {

	public static void main(String[] args) {
		// to move all 0's to the end of an array
		int[] array_nums = { 0, 0, 1, 0, 3, 0, 5, 0, 6 };
		System.out.println(Arrays.toString(array_nums));
		int i = 0;
		int l = array_nums.length;
		for (int j = 0; j < l;) {
			if (array_nums[j] == 0) {
				j++;
			} else {
				int temp = array_nums[i];
				array_nums[i] = array_nums[j];
				array_nums[j] = temp;
				i++;
				j++;
			}
		}
		while (i < l) {
			array_nums[i++] = 0;
		}
		System.out.println(Arrays.toString(array_nums));
		
		// find even and odd number
		int arr[]= {5,7,2,4,9};
		int even[]=new int[10];
		int odd[]=new int[5];
		int evenNo=0;
		int oddNo=0;
		for(int k=0;k<arr.length;k++) {
			if(arr[k]%2==0) {
				evenNo++;
				System.out.println("Even no. are "+ arr[k]);
			} else {
				oddNo++;
				System.out.println("Odd no. are "+arr[k]);
			}
		}
		System.out.println("Total Even no: "+evenNo+"  "+"Total Odd no: "+oddNo);
		System.out.println(Arrays.toString(even));
		
		//difference between min and max element
		
		int min=arr[0];
		int max=arr[0];
		for(int m=0;m<arr.length;m++) {
			if(arr[m]>max) {
				max=arr[m];
			} else if(arr[m]<min) {
				min=arr[m];
			}
		}
		int diff=max-min;
		System.out.println(diff);
		
		//find average except min and max
		int sum=0;
		for(int s:arr) {
			sum+=s;
		}
		
		int exMinMax=sum-(min+max);
		System.out.println(exMinMax);
		float avg=(float)exMinMax/(arr.length-2);
		System.out.println(avg);
		
	}

}
