package Array.w3resource;

import java.util.HashSet;
import java.util.Scanner;

public class ArraysProgramFrom34 {
	 public static void main(String[] args) {
		 //find the longest length of sequence number
	        int nums[] = {49, 1, 3, 200, 2, 4, 70, 5};  
			System.out.println("Original array length: "+nums.length);
			System.out.print("Array elements are: ");
	       for (int i = 0; i < nums.length; i++)
	        {
	            System.out.print(nums[i]+" ");
	        }
			System.out.println("\nThe new length of the array is: "+longest_sequence(nums));
			
			//the sum of the two elements of a given array which is equal to a given integer.
			int sum[]= {2,44,5,11};
			System.out.println("Enter the check no: ");
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			int count=0;
			for(int i=0;i<sum.length-1;i++) {
				for(int k=i+1;k<sum.length;k++) {
					if(sum[i]+sum[k]==n) {
						count++;
					}else {
						count=0;
					}
				}
	    }
		if(count>0) {
			System.out.println("Present");
		}
		else {
			System.out.println("Not present");
		}
	 }
/*	 private static boolean checkSum(int[] sum, int n) {
		for(int i=0;i<sum.length;i++) {
			for(int k=i+1;k<sum.length;k++) {
				if(sum[i]+sum[k]==n) {
					return true;
				}else {
					return false;
				}
			}
		}
		return true;
	}
	*/
	public static int longest_sequence(int[] nums) {
	      final HashSet<Integer> h_set = new HashSet<>();
	        for (int i : nums) h_set.add(i);

	        int longest_sequence_len = 0;
	        for (int i : nums) {
	            int length = 1;
	            for (int j = i - 1; h_set.contains(j); --j) {
	                h_set.remove(j);
	                ++length;
	            }
	            for (int j = i + 1; h_set.contains(j); ++j) {
	                h_set.remove(j);
	                ++length;
	            }
	            longest_sequence_len = Math.max(longest_sequence_len, length);
	        }
	        return longest_sequence_len;
	}

}
