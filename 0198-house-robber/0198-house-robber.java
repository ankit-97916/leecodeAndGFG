class Solution {
    public int rob(int[] arr) {
        int n = arr.length;
        int[] dp = new int[n];
        Arrays.fill(dp, -1);
        return chor(arr, 0, dp);
        
    }
    public static int chor(int[] arr, int i , int[] dp){
        if(i >= arr.length){
            return 0;
        }
        // apply dp--
        if(dp[i] != -1){
            return dp[i];
        }
        int add = arr[i] + chor(arr, i+2, dp);
        int not = chor(arr, i+1, dp);

        return  dp[i] =  Math.max(add, not);// remembber dp --
    }
}