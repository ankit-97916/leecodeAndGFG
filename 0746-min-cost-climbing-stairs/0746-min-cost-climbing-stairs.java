class Solution {
    public int minCostClimbingStairs(int[] arr) {
        // int dp[] = new int[arr.length];
        // Arrays.fill(dp,-1);
        return   minCost(arr);
    }
    public static int minCost(int[] arr){
         if(arr.length == 1){
            return arr[0];
         }
         //
         int[] dp = new int[arr.length];
         Arrays.fill(dp, -1);
         dp[0] = arr[0];
         dp[1] =  arr[1];
         for(int i=2; i<dp.length; i++){
             int climb = arr[i] + dp[i-2];
            int no = arr[i] + dp[i-1];
            dp[i] = Math.min(climb, no);
         }
         return Math.min(dp[arr.length-1], dp[arr.length-2]);

       
    }
}