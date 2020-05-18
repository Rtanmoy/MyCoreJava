package Array.w3resource;

public class SubArrays4 {
	
    public static void main(String[] args)  
    { 
    	int arr[] = {1, 4, 2, 10, 2, 3, 1, 0, 20}; 
        int k = 4; 
        int n = arr.length; 
    	// k must be greater 
        if (n < k) 
        { 
           System.out.println("Invalid"); 
          
        } 
       
        // Compute sum of first window of size k 
        int res = 0; 
        for (int i=0; i<k; i++) 
           res += arr[i]; 
       
        // Compute sums of remaining windows by 
        // removing first element of previous 
        // window and adding last element of  
        // current window. 
        int curr_sum = res; 
        for (int i=k; i<n; i++) 
        { 
           curr_sum += arr[i] - arr[i-k]; 
           res = Math.max(res, curr_sum); 
        } 
        System.out.println(res);  
    } 

}
