package Array.w3resource;

import java.util.Arrays;

public class ArraysProgramFrom47 {
	

	public static void main(String[] args) {
		// to arrange the elements of a given array of integers
		// where all negative integers appear before all the positive integers.
		int[] nums = { -4, 8, 6, -5, 6, -2, 1, 2, 3, -11 };
		int length = nums.length;
		int j = 0, temp;
		for (int i = 0; i <length; i++){
            j = i;  
            
           //Shift positive numbers left, negative numbers right
         
            while ((j > 0) && (nums[j] >0) && (nums[j-1] < 0)){
                  temp = nums[j];
                  nums[j] = nums[j-1];
                  nums[j-1] = temp;
                  j--;
            }
        }
		System.out.println(Arrays.toString(nums));
	}
}