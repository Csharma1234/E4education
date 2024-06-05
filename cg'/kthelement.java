import java.util.Arrays;

public class Solution {
    public static int kthSmallest(int[] arr, int n,int k) {
        // Sort the array
        Arrays.sort(arr);
        
        // Return the kth smallest element
        return arr[k - 1];
    }
    
   
}
