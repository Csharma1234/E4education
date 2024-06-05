
public class Solution {
    public static int getInversions(int[] arr, int n) {
 
    int inv_count = 0;
        for (int i = 0; i < n - 1; i++){
            int min_idx=i;

            for (int j = i + 1; j < n; j++){
                if (arr[j] < arr[min_idx]){
                    min_idx=j;
                }
            }
            inv_count+=(min_idx-i);
            int temp = arr[i];
            arr[i] = arr[min_idx];
            arr[min_idx] = temp;

        }
        return inv_count;
}
}
