class Solution {
    public boolean canPartition(int[] arr) {
        int n = arr.length;
        int toatl = 0;
        for(int i=0; i<n; i++){
            toatl += arr[i];
        }

        if(toatl%2 != 0){
            return false;
        }
        int half = toatl/2;
        //apply dp
        Boolean[][] dp = new Boolean[n+1][half+1];


        return canpart(arr, arr.length-1, half ,dp);

    }
    //
    public static boolean canpart(int[] arr, int i , int sum, Boolean[][] dp){
        if(sum == 0){
            return true;
        }
        //
        if(i < 0){
            return false;
        }
      // apply dp--
      if(dp[i][sum] != null){
        return dp[i][sum];
      }


        // chices
        boolean add =  false;
        if(arr[i] <= sum){
             add = canpart(arr, i-1, sum-arr[i],dp);
        }
        boolean dont = canpart(arr, i-1, sum, dp);
        dp[i][sum] = add || dont;// remember in table
        return dp[i][sum];

    }
}