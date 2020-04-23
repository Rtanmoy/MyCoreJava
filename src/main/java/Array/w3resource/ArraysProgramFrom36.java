package Array.w3resource;

import java.util.ArrayList;
import java.util.List;

public class ArraysProgramFrom36 {
	 public static void main(String[] args) {
		 //find the longest length of sequence number
	        int nums[] = {1, -2, 0, 5, -1, -4};  
	        int target=2;
	        ArraysProgramFrom36 r=new ArraysProgramFrom36();
	        System.out.println(r.threeSum(nums,target));       
	    }
	    public List<List<Integer>> threeSum(int[] nums, int target) {
	        List<List<Integer>> my_List = new ArrayList<List<Integer>>();
	        
	        for(int i = 0; i < nums.length; i++){
	            for(int j = i; j < nums.length ;j++){
	                for(int k = j; k<nums.length;k++){
	                    if ( i != j && j != k && i != k && (nums[i] + nums[j] + nums[k] == target)){
	                        List<Integer> inner_List = new ArrayList<Integer>(3);
	                        inner_List.add(nums[i]);
	                        inner_List.add(nums[j]);
	                        inner_List.add(nums[k]);
	                        my_List.add(inner_List);
	                    }
	                }
	            }
	        }
	       return my_List;
	 }
}
