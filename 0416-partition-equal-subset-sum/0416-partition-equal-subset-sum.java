class Solution {
    public boolean canPartition(int[] arr) {
        int totalSum = 0;
        for(int i = 0; i<arr.length; i++){
            totalSum += arr[i];
        }
        if(totalSum%2 != 0){
            return false;
        }

        int halfSum = totalSum/2;
        int n = arr.length;
        Boolean[][] dp = new Boolean[n][halfSum+1];
        return canPart(arr, halfSum, n-1, dp);
    }

    public static boolean canPart(int[] arr,  int sum, int i , Boolean[][] dp ){

          if(sum == 0){
            return true;
        }
        // out range
        if(i < 0){
            return false;
        }
        // apply dp----
        if(dp[i][sum] != null){
            return dp[i][sum];
        }
        boolean take = false;
        if(arr[i] <= sum){
             take =   canPart(arr, sum-arr[i], i-1, dp);
        }
        
        boolean donttake = canPart(arr, sum, i-1, dp);
        dp[i][sum] =  take||donttake;
        return dp[i][sum];
    }
}