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
        boolean[][] dp = new boolean[n+1][half+1];

          // base case--
          for(int i=0; i<n; i++){
            dp[i][0] = true;
          }

      // fill the table---
         for(int i=1; i<=n; i++){
            for(int j=1; j<=half; j++){
                //choice 
                boolean take = false;
                if(arr[i-1] <= j){
                    take = dp[i-1][j-arr[i-1]];
                }
                boolean dont = dp[i-1][j];

                dp[i][j] = take || dont; // rememver 
            }
         }

         return dp[n][half];
        

    }
    //
   
}