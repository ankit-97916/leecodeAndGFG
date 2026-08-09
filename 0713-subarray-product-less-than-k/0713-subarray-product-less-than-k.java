class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        return productLessThenK(nums, k);
    }

    public static int productLessThenK(int[] arr, int k){
        int i = 0;
        int j = 0;
        int p = 1;
        int ans = 0;
        while( j < arr.length){
            p = p*arr[j];
            //window shrink;;
            while(p >= k   && i<=j){
                p = p/arr[i];
                i++;
            }
            // answer update--
            ans = ans+ (j-i+1);
            j++;
        }

        return ans;
    }
}